/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 4.2

*/
import java.util.*;

public class DeSanti4_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Calculate the Great Circle Distance Between two points on the Earth in km");
        System.out.println("Enter the lat. and long. coordinates of two points. North and West are considered positive.");

        System.out.print("Enter latitude 1: ");
        double x1 = in.nextDouble();
        System.out.print("Enter longitude 1: ");
        double y1 = in.nextDouble();
        System.out.print("Enter latitude 2: ");
        double x2 = in.nextDouble();
        System.out.print("Enter longitude 2: ");
        double y2 = in.nextDouble();
        double radius = 6371.01;


        double sins = Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2));
        double coss = Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2));
        double d = radius*Math.acos(sins+coss);
        //d = radius*arccos(sin(x1)*sin(x2)*cos(x1)*cos(x2)*cos(y1-y2))
        System.out.print("The Great Circle Distance Between the Two Points (km): ");
        System.out.println(d);
    }
}
