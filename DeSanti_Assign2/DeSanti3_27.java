/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 3.27

*/
import java.util.*;


public class DeSanti3_27 {
    //function to get the area of a triangle give three points
    static double area_of_triangle(double x1, double x2, double x3, double y1, double y2, double y3){
        double area = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
        return Math.abs(area);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter x and y coordinate points of an arbitrary point to test if it lies within the triangle with vertexes (0,0), (0,100), and (200,0).");
        System.out.print("X Coordinate of Point: ");
        double x = in.nextDouble();
        System.out.print("Y Coordinate of Point: ");
        double y = in.nextDouble();
        System.out.print("Point Entered: ");
        System.out.print(x);
        System.out.print(" , ");
        System.out.println(y);
        //the given point will lie within the triangle if the areas of the three triangles 
        //created by connecting it to each combination of other points add to the area of the 
        //original triangle
        double original_area = area_of_triangle(0,0,200,0,100,0);
        double area1 = area_of_triangle(0,0,x,0,100,y);
        double area2 = area_of_triangle(0,x,200,0,y,0);
        double area3 = area_of_triangle(x,0,200,y,100,0);
        if(area1+area2+area3 == original_area){
            System.out.println("The Point Is Within the Triangle");
        }
        else{
            System.out.println("The Point Is NOT Within the Triangle");
        }

    }
    
}
