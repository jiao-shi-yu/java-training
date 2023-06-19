package com.jiaoshy.submarine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 整个游戏窗口
 */
public class World extends JPanel {
    // 窗口的宽高
    public static final int WIDTH = 641;
    public static final int HEIGHT = 479;

    public static final int START = 0;
    public static final int RUNNING = 1;
    public static final int GAME_OVER = 2;

    private int state = START;

    private Battleship ship = new Battleship();
    private SeaObject[] submarines = {

    }; // 所有的潜艇

    // 鱼类水雷
    private SeaObject[] thunders = {

    };

    private Bomb[] bombs = {

    }; //深水炸弹

    /**
     * 生成潜艇
     * 三种潜艇，随机生成
     */

    public SeaObject nextSubmarine() {
        Random random = new Random();
        int type = random.nextInt(20);

        if (type < 10) {
            return new ObserveSubmarine();
        } else if (type < 15) {
            return new TorpedoSubmarine();
        } else {
            return new MineSubmarine();
        }

    }

    private int submarineEnterIndex = 0;
    /**
     * 潜艇入场 方法
     */
    public void submarineEnterAction() {
        submarineEnterIndex ++;
        if (submarineEnterIndex % 40 == 0) {
            SeaObject submarine = nextSubmarine();
            submarines = Arrays.copyOf(submarines, submarines.length + 1);
            submarines[submarines.length-1] = submarine;
        }
    }

    private int thunderEnterIndex = 0;
    public void thunderAction() {
        thunderEnterIndex ++;
        if (thunderEnterIndex % 100 == 0) {
            for (int i = 0; i< submarines.length; i++) {
                SeaObject thunder = submarines[i].shootThunder();
                if (thunder != null) {
                    thunders = Arrays.copyOf(thunders, thunders.length + 1);
                    thunders[thunders.length - 1] = thunder;
                }
            }
        }
    }

    private int score = 0;
    public void bombBangAction() { // 每 10 毫秒走一次
        for (int i = 0; i < bombs.length; i ++) {
            Bomb bomb = bombs[i];
            for (int j = 0; j < submarines.length; j++) {
                SeaObject submarine = submarines[j];
                if (bomb.isAlive() && submarine.isAlive() && bomb.isHitWith(submarine)) { // 前提：两者都活着
                    bomb.goDie();
                    submarine.goDie();

                    if (submarine instanceof EnemyScore) {
                        EnemyScore enemyScore = (EnemyScore) submarine;
                        score += enemyScore.getScore();
                    }
                    if (submarine instanceof EnemyLife) {
                        EnemyLife enemyLife = (EnemyLife) submarine;
                        int lifeAmount = enemyLife.getLife();
                        ship.addLife(lifeAmount);
                    }
                }
            }
        }
    }

    public void thunderBangAction() {
        for (int i = 0; i < thunders.length; i++) {
            SeaObject thunder = thunders[i];
            if (thunder.isAlive() && ship.isAlive() && thunder.isHitWith(ship)) {
                thunder.goDie();
                ship.subtractLife();
            }
        }
    }

    public void action() {
        KeyAdapter k = new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    switch (state) {
                        case START:
                            state = RUNNING;
                            break;
                        case GAME_OVER:

                            score = 0;
                            ship = new Battleship();
                            submarines = new SeaObject[0];
                            thunders = new SeaObject[0];
                            bombs = new Bomb[0];
                            state = START;
                            break;
                        case RUNNING:
                            Bomb bomb = ship.shootBomb();
                            bombs = Arrays.copyOf(bombs, bombs.length + 1);
                            bombs[bombs.length-1] = bomb;
                    }
                }
                if (state == RUNNING) {
                    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                        ship.moveLeft();
                    }
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                        ship.moveRight();
                    }
                }
            }
        };
        this.addKeyListener(k);
        Timer timer = new Timer();
        int intervel = 10;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (state == RUNNING) {
                    submarineEnterAction();
                    thunderAction();
                    stepAction();
                    bombBangAction();
                    thunderBangAction();
                    checkGameOverAction();
                }
                repaint();
            }
        }, intervel, intervel);
    }

    public void stepAction(){
        for (int i = 0; i < submarines.length; i++) {
            submarines[i].move();
        }
        for (int i = 0; i < thunders.length; i++) {
            thunders[i].move();
        }
        for (int i = 0; i < bombs.length; i++) {
            bombs[i].move();
        }
    }

    public void checkGameOverAction() {
        if (ship.getLife() <= 0) {
            state = GAME_OVER;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        World world = new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH , HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        world.action();
    }

    @Override
    public void paint(Graphics g) {

        switch (state) {

            case START:
                Images.gamestart.paintIcon(null, g, 0, 0);
                break;
            case GAME_OVER:
                Images.gameover.paintIcon(null, g, 0, 0);
                g.drawString("Score:" + score, 200, 50);
                g.drawString("Life:" + ship.getLife(), 400, 50);
                break;
            case RUNNING:
                Images.sea.paintIcon(null, g, 0, 0);
                ship.paintImage(g);

                for (int i = 0; i < submarines.length; i++) {
                    submarines[i].paintImage(g);
                }

                for (int i = 0; i < thunders.length; i++) {
                    thunders[i].paintImage(g);
                }


                for (int i = 0; i < bombs.length; i++) {
                    bombs[i].paintImage(g);
                }
                g.drawString("Score:" + score, 200, 50);
                g.drawString("Life:" + ship.getLife(), 400, 50);
        }


    }
}
