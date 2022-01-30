/*
I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 2.15

*/

import java.util.Scanner;

public class DeSanti2_15 {
    public static void main(String[] args){

        //initialize scanner and variables
        Scanner in = new Scanner(System.in);
        double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        double step1 = 0;
        double distance = 0;


        //take inputs...
        System.out.println("Enter two coordinate points to find the distance between them via the distance formula.\n");
        System.out.print("x1= ");
        x1 = in.nextDouble();
        System.out.print("y1= ");
        y1 = in.nextDouble();
        System.out.print("x2= ");
        x2 = in.nextDouble();
        System.out.print("y2= ");
        y2 = in.nextDouble();
        in.close();

        //math...
        step1 = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
        distance = Math.pow(step1, 0.5);

        //echo inputs...
        System.out.print("Coordinate1: (" +x1+", " +y1+")\n");
        System.out.print("Coordinate2: (" +x2+", " +y2+")\n");

        //display answer...
        System.out.println("The distance via the distance formula is: "+distance);

    }
}
