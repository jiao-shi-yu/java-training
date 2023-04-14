package com.jiaoshy.submarine;

import javax.swing.*;

public class Bomb extends SeaObject {

    public Bomb(int x, int y) {
        super(9, 12, x, y, 3);
    }

    @Override
    public void move() {
        // 因为玩家战舰所发射的炸弹是往下的，所以  this.y += speed;
        this.y += speed;

    }

    @Override
    public ImageIcon getImage() {
        return Images.bomb;
    }

    /**
     * 玩家战舰所发射的炸弹是是往下的，所以他的越界判断与父类不同，需要重写
     */
    @Override
    public boolean isOutOfBounds() {
        return this.y > World.HEIGHT;
    }
}
