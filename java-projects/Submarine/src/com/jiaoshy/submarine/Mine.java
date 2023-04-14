package com.jiaoshy.submarine;

import javax.swing.*;

public class Mine extends SeaObject {
    public Mine(int x, int y) {
        super(11, 11, x, y, 1);
    }

    @Override
    public void move() {
        y -= speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.mine;
    }
    /**
     * 重写越界检测
     */
    @Override
    public boolean isOutOfBounds() {
        return this.y <= 150 - this.height;
    }
}
