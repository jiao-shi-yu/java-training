package com.jiaoshy.submarine;

import javax.swing.*;

public class MineSubmarine extends SeaObject implements EnemyLife {

    public MineSubmarine() {
        super(63, 19);
    }
    @Override
    public int getLife() {
        return 1;
    }

    @Override
    public void move() {
        x += speed;
    }

    @Override
    public ImageIcon getImage() {
        return Images.mineSubmarine;
    }


}
