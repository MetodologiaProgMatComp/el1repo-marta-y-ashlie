package es.uah.matcomp.mp.e1.ejerciciosclases.Practica3.CircleyCylinder;
public class Cylinder extends CircleB{
   private double height = 1.0;
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }
    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }
    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;

    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume() {
        return getArea()*height;
    }
    @Override
    public String toString(){
        return "Cylinder: subclass of " + super.toString()+ "height = "+height;

    }


}
