package com.jiaoshy.submarine;

import javax.swing.*;

/**
 * 鱼雷潜艇
 */
public class TorpedoSubmarine extends SeaObject implements EnemyScore {

    public TorpedoSubmarine() {
        super(64, 20);
    }


    @Override
    public int getScore() {
        return 40;
    }

    @Override
    public void move() {
        x += speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.torpedoSubmarine;
    }


}
