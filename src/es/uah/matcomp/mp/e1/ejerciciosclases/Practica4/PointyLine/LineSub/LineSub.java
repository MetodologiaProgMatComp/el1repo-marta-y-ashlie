package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.LineSub;

import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint.Point;

public class LineSub extends Point {
    Point end; //la clase contiene su punto final y heredará el inicial
    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX,beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub (Point begin, Point end){
        super(begin.getX(),begin.getY());
        this.end = end;
    }
    @Override
    public String toString(){
       return "Linea[begin = "+ super.toString()+"end = "+end+"]";
    }

    public Point getBegin(){
        Point begin = new Point(super.getX(),super.getY());
        return begin;
    }

    public Point getEnd(){
        return end;
    }

    public void setBegin(int x, int y){
        super.setX(x);
        super.setY(y);
    }
    public void setEnd(int x, int y){
        Point end = new Point(x,y);
        this.end = end;
    }
    public int getBeginX(){
        int x = (int)super.getX();
        return x;
    }
    public int getEndX(){
        return (int)end.getX();
    }
    public int getBeginY(){
        int y = (int)super.getY();
        return y;
    }
    public int getEndY(){
        return (int)end.getY();
    }
    public void setBeginX(int x){
        super.setX(x);
    }
    public void setBeginY(int y){
        super.setY(y);
    }
    public void setBeginXY(int x,int y){
        super.setX(x);
        super.setY(y);
    }
    public void setEndX(int x){
        end.setX(x);
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }
    public int getLength(){
        int xDiff = this.getEndX()-this.getBeginX();
        int yDiff = this.getEndY()-this.getBeginY();
        return (int)Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double getGradient(){
        double xDiff = this.getEndX()-this.getBeginX();
        double yDiff = this.getEndY()-this.getBeginY();
        return Math.atan2(yDiff,xDiff);

    }

}
