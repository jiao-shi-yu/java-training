package com.jiaoshy.submarine;

import javax.swing.*;

public class Torpedo extends SeaObject {

    public Torpedo(int x, int y) {
        super(8, 21, x, y, 3);
    }

    @Override
    public void move() {
        y -= speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.torpedo;
    }
}
