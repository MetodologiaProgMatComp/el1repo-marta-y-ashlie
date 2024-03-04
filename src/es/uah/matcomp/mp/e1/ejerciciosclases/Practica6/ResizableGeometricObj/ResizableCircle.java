package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.ResizableGeometricObj;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius){
        super(radius);
    }
    public String toString(){
        return "ResizableCircle[Circle[radius=" + radius + "]]";
    }

    @Override
    public void resize(int percent) {
        radius*= percent/100.0;
    }
}
