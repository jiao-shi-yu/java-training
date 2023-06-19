package com.jiaoshy.submarine;

import javax.swing.*;

public class ObserveSubmarine extends SeaObject implements EnemyScore {

    public ObserveSubmarine() {
        super(63, 19);
    }

    @Override
    public void move() {
        x += speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.observeSubmarine;
    }

    @Override
    public int getScore() {
        return 10;
    }
}
