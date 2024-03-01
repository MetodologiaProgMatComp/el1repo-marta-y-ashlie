package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyTriangle;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString() {
        return "MyTriangle[v1=(" + this.v1.getX() + "," + this.v1.getY() + "), v2=(" + this.v2.getX() + "," + this.v2.getY() + "), v3=(" + this.v3.getX() + "," + this.v3.getY() + ")]";
    }
    public double getPerimeter() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        double distTot = d1+d2+d3;
        return distTot;
    }
    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if(d1==d2 && d2 == d3) {
            return "Equilatero";
        }
        else if (d1 == d2 || d2 == d3 || d1 == d3) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}
