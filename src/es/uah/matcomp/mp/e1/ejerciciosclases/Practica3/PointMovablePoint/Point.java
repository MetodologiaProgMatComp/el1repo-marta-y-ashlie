package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint;

public class Point {
    float x = 0.0f;
    float y =0.0f;
    public Point(float x,float y){
        this.x = x;
        this.y = y;
    }
    public Point(){}

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public float[] getXY(){
        float[] result = new float[2];
        result[0]=x;
        result[1]=y;
        return result;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
