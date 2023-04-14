package com.jiaoshy.submarine;

import javax.swing.*;

public class Battleship extends SeaObject {

    // 战舰有一个私有属性生命值
    private int life;

    public Battleship() {
        super(66, 26, 270, 124, 10);
        // 默认5条命
        this.life = 5;
    }

    /**
     *先重写抽象父类的连个方法
     */
    @Override
    public void move() {
        // 玩家战舰是通过键盘来移动的，所以这里做个空实现
    }

    @Override
    public ImageIcon getImage() {
        return Images.battleship;
    }

    /**
     * 然后是玩家战舰，特有的方法
     */


    public Bomb shootBomb() {
        // 炸弹刚刚发射时，与玩家战舰位置相同，后面可以微调。好像不用，因为炮口不是在中间。到时候再说吧。
        return new Bomb(this.x, this.y);
    }

    /**
     * 玩家战舰可以左移、右移
     */
    public void moveLeft() {
        x -= speed;
    }
    public void moveRight() {
        x += speed;
    }

    /**
     * 玩家战舰还会增命，减命，获取命数
     */
    public void addLife(int num) { // 还可以指定加命的条数
        life += num;
    }

    public void subtractLife() {
        life --;
    }
    public int getLife() {
        return life;
    }
}
