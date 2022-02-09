import java.util.*;
public class DeSanti4_3 {
    static double GCD(double x1, double y1, double x2, double y2){
        double radius = 6371.01;
        double sins = Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2));
        double coss = Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1)-Math.toRadians(y2));
        double d = radius*Math.acos(sins+coss);
        return d;
    }
    static double area_of_triangle(double s1, double s2, double s3){
        double S = (s1+s2+s3)/2;
        double A = Math.pow((S*(S-s1)*(S-s2)*(S-s3)),0.5);
        return A;
    }
    public static void main(String[] args){
        System.out.println("This program finds the area enclosed by the polygon by connecting Savanah, Charlotte, Orlando, and Atlanta in square kilometers.");
        double cx = 35.2270869;
        double cy = -80.8431267;
        double ax = 33.7489954;
        double ay = -84.3879824;
        double ox = 28.5383355;
        double oy = -81.3792365;
        double sx = 32.0835407;
        double sy = -81.0998342;

        double ACS = area_of_triangle(GCD(cx, cy, sx, sy), GCD(cx, cy, ax, ay), GCD(ax, ay, sx, sy));
        double AOS = area_of_triangle(GCD(ax, ay, ox, oy), GCD(ox, oy, sx, sy), GCD(sx, sy, ax, ay));
        double total_area = ACS+AOS;
        System.out.print("The total area enclosed by the four cities is (km^2): ");
        System.out.println(total_area);
    }

    
}
