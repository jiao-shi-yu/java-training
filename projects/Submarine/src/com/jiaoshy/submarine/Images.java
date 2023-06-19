package com.jiaoshy.submarine;

import javax.swing.*;

/**
 * 写一个工具类，是专门用来获取图片的
 */
public class Images {

    /**
     * 先声明几个变量，用来存储静态图片
     */
    public static ImageIcon battleship;         // 战舰
    public static ImageIcon observeSubmarine;   // 侦查潜艇
    public static ImageIcon torpedoSubmarine;   // 鱼类潜艇
    public static ImageIcon mineSubmarine;      // 水雷潜艇


    public static ImageIcon torpedo;            // 鱼雷
    public static ImageIcon mine;               // 水雷
    public static ImageIcon bomb;               // 炸弹
    public static ImageIcon sea;                // 海洋
    public static ImageIcon gamestart;          // 游戏开始
    public static ImageIcon gameover;           // 游戏结束

    /**
     * 使用静态块，初始化静态图片
     */
    static {
        battleship = new ImageIcon("img/battleship.png");
        observeSubmarine = new ImageIcon("img/obsersubm.png");
        torpedoSubmarine = new ImageIcon("img/torpesubm.png");
        mineSubmarine = new ImageIcon("img/minesubm.png");
        torpedo = new ImageIcon("img/torpedo.png");
        mine = new ImageIcon("img/mine.png");
        bomb = new ImageIcon("img/bomb.png");
        sea = new ImageIcon("img/sea.png");
        gamestart = new ImageIcon("img/gamestart.png");
        gameover = new ImageIcon("img/gameover.png");
    }




}
