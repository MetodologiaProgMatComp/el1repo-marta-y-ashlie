package es.uah.matcomp.mp.e1.ejerciciosclases.Practica4.PointyLine.Line;
/**Una linea está compuesta de dos puntos**/
import es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.PointMovablePoint.Point;
public class Line {
    private Point begin;
    private Point end;
    public Line (Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY){
        begin = new Point (beginX, beginY);
        end = new Point (endX, endY );
    }
    @Override
    public String toString(){
        return "Linea[begin = "+begin+" end = "+end+"]";
    }
    public Point getBegin(){
        return begin;
    }
    public Point getEnd(){
        return end;
    }
    public void setBegin(Point begin){
        this.begin=begin;
    }
    public void setEnd(Point end){
        this.end=end;
    }
    public int getBeginX(){
        return (int)begin.getX();
    }
    public int getEndX(){
        return (int)end.getX();
    }
    public int getBeginY(){
        return (int)begin.getY();
    }
    public int getEndY(){
        return (int)end.getY();
    }
    public void setBeginX(int x){
        begin.setX(x);
    }
    public void setBeginY(int y){
        begin.setY(y);

    }
    public void setEndX(int x){
       end.setX(x);
    }
    public void setEndY(int y){
        end.setY(y);
    }
    public void setBeginXY(int x,int y){
        begin.setXY(x,y);
    }
    public void setEndXY(int x,int y){
        end.setXY(x,y);
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
