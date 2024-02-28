package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyCircle;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;

public class MyCircle {
    private MyPoint center = new MyPoint(0,0);
    private int radius = 1;

    public MyCircle(){};

    public MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x,y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center){
        this.center = center;
    }
    public int getCenterX() {
        int x = this.center.getX();
        return x;
    }
    public int getCenterY() {
        int y = this.center.getY();
        return y;
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public int[] getCenterXY () {
        return new int[] {center.getX(), center.getY()};

        /**int [] center = new int[2];
        center[0] = this.center.getX();
        center[1] = this.center.getY();
         Son lo mismo, pero para que el array funcione sin el this no podemos llamar center al array,
         porque para java hemos redefinido lo que es center.*/
    }
    public void setCenterXY (int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString();
    }
    public double getArea() {
        double area = (Math.pow(radius,2)) * Math.PI;
        return area;
    }

    public double getCircumference() {
        double circumference = radius * 2 * Math.PI;
        return circumference;
    }
    public double distance(MyCircle another) {
        double distancia = this.center.distance(another.center);
        return distancia;
    }
}
