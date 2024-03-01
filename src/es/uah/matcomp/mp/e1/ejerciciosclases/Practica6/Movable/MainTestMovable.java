package es.uah.matcomp.mp.e1.ejerciciosclases.Practica6.Movable;

public class MainTestMovable {
    public static void main(String[] args){
        MovablePoint p1 = new MovablePoint(1,2,3,4);
        System.out.println("My Point:" + p1.toString());
        p1.moveUp();
        System.out.println("My Point was moved up:" + p1.toString());
        p1.moveDown();
        System.out.println("Now the point came to origin:" + p1.toString());
        p1.moveLeft();
        System.out.println("Move the point left:" + p1.toString());
        p1.moveRight();
        System.out.println("Now the point came to origin:" + p1.toString());
    }
}
