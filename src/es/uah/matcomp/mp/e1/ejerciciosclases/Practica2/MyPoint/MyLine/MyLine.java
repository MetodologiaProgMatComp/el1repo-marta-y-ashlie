package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyLine;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint(x2,y2);
    }
    public MyLine (MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end =end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public void setBeginX (int x) {
        begin.setX(x);
    }
    public void setBeginY (int y) {
        begin.setY(y);
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY () {
        return end.getY();
    }
    public void setEndX (int x) {
        end.setX(x);
    }
    public void setEndY (int y) {
        end.setY(y);
    }
    public int[] getBeginXY () {
        return new int[] {begin.getX(), begin.getY()};
    }
    public void setBeginXY (int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }
    public int[] getEndXY () {
        return new int[] {end.getX(),end.getY()};
    }
    public void setEndXY (int x, int y) {
        end.setX(x);
        end.setY(y);
    }
    public double getLength() {
        MyPoint begin = new MyPoint(this.begin.getX(),this.begin.getY());
        MyPoint end = new MyPoint(this.end.getX(),this.end.getY());
        return begin.distance(end);
    }
    public double getGradient () {
        int [] begin = getBeginXY();
        int [] end = getEndXY();
        int xDiff = end[0] - begin[0];
        int yDiff = end[1] - begin[1];
        double gradient = Math.atan2(yDiff,xDiff);
        return gradient;
    }
    public String toString() {
        return "MyLine[begin=(" + begin.getX() + "," +begin.getY() + "), end=(" + end.getX() + "," + end.getY() + ")]";
    }
}