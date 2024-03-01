package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.MovPointCircle;

public class MainTestMovable {
    public static void main(String[] args){
        MovablePoint point = new MovablePoint(10, 20, 3, 4);
        System.out.println("MovablePoint:");
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        System.out.println("\nMovableCircle:");
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle);

    }
}
