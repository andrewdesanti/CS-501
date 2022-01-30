/*
I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 2.19

*/

import java.util.Scanner;

public class DeSanti2_19 {
    public static void main(String[] args){

        //initialize scanner and variables
        Scanner in = new Scanner(System.in);
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        double x3 = 0;
        double y3 = 0;
        double s = 0;
        double area = 0;
        double step1 = 0;
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;

        //take inputs...
        System.out.println("Enter three coordinates to find the area of the triangle enclosed by them.\n");
        System.out.print("x1= ");
        x1 = in.nextDouble();
        System.out.print("y1= ");
        y1 = in.nextDouble();
        System.out.print("x2= ");
        x2 = in.nextDouble();
        System.out.print("y2= ");
        y2 = in.nextDouble();
        System.out.print("x3= ");
        x3 = in.nextDouble();
        System.out.print("y3= ");
        y3 = in.nextDouble();
        in.close();

        //math
        //side lengths
        step1 = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        s1 = Math.pow(step1, 0.5);
        step1 = Math.pow((x2-x3), 2) + Math.pow((y2-y3), 2);
        s2 = Math.pow(step1, 0.5);
        step1 = Math.pow((x3-x1), 2) + Math.pow((y3-y1), 2);
        s3 = Math.pow(step1, 0.5);
        //actual area
        s = (s1+s2+s3)/2;
        area = Math.pow((s*(s-s1)*(s-s2)*(s-s3)), 0.5);

        //echo inputs...
        System.out.print("Coordinate1: (" +x1+", " +y1+")\n");
        System.out.print("Coordinate2: (" +x2+", " +y2+")\n");
        System.out.print("Coordinate3: (" +x3+", " +y3+")\n");

        //output...
        System.out.println("The area of the triangle enclosed by those three points is: "+area);

    }
}
