package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.ResizableGeometricObj;

public class MainResizableCircle {
    public static void main(String[] args){
        ResizableCircle r1 = new ResizableCircle(3);
        System.out.println("Mi circulo r1=" + r1);
        r1.resize(30);
        System.out.println("Mi círculo reformable=" +r1);
    }

}
