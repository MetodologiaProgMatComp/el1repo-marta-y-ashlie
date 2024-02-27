package es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyLine;
import es.uah.matcomp.mp.e1.ejerciciosclases.Practica2.MyPoint.MyPoint;

public class MainTestMyLine {
    public static void main(String[] args) {
        String[] input = {"1 2 3 4 5 6 7 8"};

        System.out.println("Enter the x and y coordinates of the first point:");
        String[] tokens1 = input[0].split(" ");
        int x1 = Integer.parseInt(tokens1[0]);
        int y1 = Integer.parseInt(tokens1[1]);
        MyPoint begin = new MyPoint(x1, y1);

        String[] tokens2 = input[0].split(" ");
        int x2 = Integer.parseInt(tokens2[2]);
        int y2 = Integer.parseInt(tokens2[3]);
        MyPoint end = new MyPoint(x2, y2);

        MyLine line = new MyLine(begin, end);

        System.out.println("Length of the line: " + line.getLength());
        System.out.println("Gradient of the line: " + line.getGradient());
        System.out.println("Begin point of the line: " + line.getBegin());
        System.out.println("End point of the line: " + line.getEnd());

        System.out.println("Enter new x and y coordinates for the begin point:");
        String[] tokens3 = input[0].split(" ");
        int newX = Integer.parseInt(tokens3[4]);
        int newY = Integer.parseInt(tokens3[5]);
        line.setBegin(new MyPoint(newX, newY));

        System.out.println("New length of the line: " + line.getLength());
        System.out.println("New gradient of the line: " + line.getGradient());
        System.out.println("New begin point of the line: " + line.getBegin());
        System.out.println("End point of the line: " + line.getEnd());
    }
}
