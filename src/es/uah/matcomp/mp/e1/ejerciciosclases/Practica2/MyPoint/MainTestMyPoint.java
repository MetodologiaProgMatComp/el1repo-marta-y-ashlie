package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint;

public class MainTestMyPoint {
    public static void main(String [] args) {
        // Test program to test all constructors and public methods
        MyPoint p1 = new MyPoint(); // Test constructor
        System.out.println(p1); // Test toString()
        p1.setX(8); // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX()); // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0); // Test setXY()
        System.out.println(p1.getXY()[0]); // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 4); // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2)); // which version? --> point to point
        System.out.println(p2.distance(p1)); // which version? --> point to point
        System.out.println(p1.distance(5, 6)); // which version? --> point to coord
        System.out.println(p1.distance()); // which version? --> point to origin(0,0)

        //Example distance(x,y)
        MyPoint pt1 = new MyPoint(3, 4);
        System.out.println(pt1.distance(5, 6));
        //Example distance(another)
        MyPoint pt2 = new MyPoint(5, 6);
        System.out.println(pt1.distance(pt2));
        //Example distance()
        System.out.println(pt1.distance());

        //CREAMOS LOS 10 PRIMEROS PUNTOS DE LA ULTIMA PARTE DEL EJERCICIO
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < 10; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }
        //CREAMOS LA MATRIZ DE DISTANCIAS
        System.out.println("Distance matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                double distance = points[i].distance(points[j]);
                System.out.printf("%.2f ", distance);
            }
            System.out.println();
        }

    }
}
