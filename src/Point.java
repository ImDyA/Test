package com.TestProjectTeam; //Комментарий Андрей: одинаковое название пакета проекта

/**
 * Created by User on 12.10.2017.
 */


public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
