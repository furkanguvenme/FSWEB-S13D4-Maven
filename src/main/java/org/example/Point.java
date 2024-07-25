package org.example;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point object) {
        return Math.sqrt(Math.pow((x - object.getX()), 2) + Math.pow((y - object.getY()), 2));
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.getX() - x, 2) + Math.pow(this.getY() - y, 2));
    }
}
