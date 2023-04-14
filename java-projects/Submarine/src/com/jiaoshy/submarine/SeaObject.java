package com.jiaoshy.submarine;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * 其它战舰继承甚至炮弹都自这个类
 */
public abstract class SeaObject {
    /**
     * 定义两个常量 表示死活的状态
     */
    public static final int LIVE = 0; //活
    public static final int DEAD = 1; //活
    // state 当前状态 ——默认是活着的
    protected int state = LIVE;
    /**
     * 海上物体都有宽高x,y 还有移动速度这些属性
     */
    protected int width;
    protected int height;
    protected int x;
    protected int y;
    protected int speed;

    /**
     * 声明两个构造方法，一个用来构造敌舰，一个用来构造炸弹
     */

    public SeaObject(int width, int height) {
        // 三种敌舰的宽高不一样
        this.width = width;
        this.height = height;

        x = -width; // 屏幕左侧边缘
        // 位置是随机生成的
        Random random = new Random();
        y = random.nextInt(World.HEIGHT - height - 150 + 1) + 150;
        // 速度也是随机的
        speed = random.nextInt(3) + 1;
    }

    // 玩家控制的战舰 以及 鱼类水雷 炸弹 ， 需要告知宽高和位置以及移动速度，战舰和炸弹的速度是固定的
    public SeaObject(int width, int height, int x, int y, int speed) {

        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.speed = speed;

    }


    /**
     * 在 SeaObject 中声明一个移动的抽象方法，由其子类去实现。 那么 seaObject 应该定义为一个抽象类。
     */
    public abstract void move();

    /**
     * 再声明一个抽象方法，返回海洋对象的图片。 工厂模式？
     */
    public abstract ImageIcon getImage();


    /**
     * 声明两个方法，判断当前海洋对象的状态是死是活
     */
    public boolean isAlive() {
        return this.state == LIVE;
    }

    public boolean isDead() {
        return this.state == DEAD;
    }

    /**
     * 将海洋对象的图片绘制到窗口上
     */
    public void paintImage(Graphics graphics) {
        if (isAlive()) {
            this.getImage().paintIcon(null, graphics, this.x, this.y);
        }
    }

    /**
     * 屏幕越界检测
     */
    public boolean isOutOfBounds() {
        return this.x > World.WIDTH;
    }

    /**
     * 碰撞检测
     *
     */
    public boolean isHitWith(SeaObject anotherSeaObject) {
        // 假设：this表示玩家战舰 seaObject 表示炸弹

        boolean constraint1 = anotherSeaObject.x > this.x - anotherSeaObject.width;
        boolean constraint2 = anotherSeaObject.x < this.x + this.width;
        boolean constraint3 = anotherSeaObject.y > this.y - anotherSeaObject.height;
        boolean constraint4 = anotherSeaObject.y < this.y + this.height;

        return constraint1 && constraint2 && constraint3 && constraint4;
    }

    /**
     * 海洋对象将状态改为死去
     * 玩家战舰会生命为0，状态就变为死去的; 敌舰超出屏幕或受到攻击一次或多次，也应当将状态改为死去。
     */
    public void goDie() {
        state = DEAD;
    }



    public SeaObject shootThunder() {
        if (isAlive()) {
            int x = this.x + this.width;
            int y = this.y - 5;

            if (this instanceof TorpedoSubmarine) {
                return new Torpedo(x, y);   //鱼雷
            } else if (this instanceof MineSubmarine) {
                return new Mine(x, y);      //水雷
            } else { //侦查潜艇
                return null;
            }
        } else {
            return null;
        }
    }


}
