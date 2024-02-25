package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint;

public class MyPoint {
    private int X = 0;
    private int Y = 0;

    public MyPoint (){}
    public MyPoint(int x, int y) {
        this.X = x;
        this.Y = y;
    }
    public int getX() {return X;}
    public int getY() {return Y;}

    public void setY(int y) {
        this.Y = y;
    }

    public void setX(int x) {
        this.X = x;
    }

    public int [] getXY() {
        int [] result = new int[2];
        result[0] = X;
        result[1] = Y;
        return result;
    }
    public void setXY(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    @Override
    public String toString() {
        return "(" + X + "," + Y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((Math.pow((this.X - x),2)) + Math.pow((this.Y - y),2));
    }
    public double distance(MyPoint another) {
        return Math.sqrt((Math.pow((this.X - another.X),2)) + Math.pow((this.Y - another.Y),2));
    }
    public double distance() {
        return Math.sqrt((Math.pow((this.X),2)) + Math.pow((this.Y),2));
    }
}
