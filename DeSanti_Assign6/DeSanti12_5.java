/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 12.5

*/
import java.util.*;
public class DeSanti12_5 {
    public static void main(String[] args){
        double side1, side2, side3 = 0;
        String color = "";
        boolean filled = false;
        int choice = 0;
        int running = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("This program lets the user input data to test a triangle class, and a custom execption.");
        while(running==1){
            System.out.println("Side length 1: ");
            side1 = in.nextDouble();
            System.out.println("Side length 2: ");
            side2 = in.nextDouble();
            System.out.println("Side length 3: ");
            side3 = in.nextDouble();
            System.out.println("Enter color: ");
            color = in.next();
            System.out.println("Enter 1 to fill. Enter another int to not.");
            choice = in.nextInt();
            if(choice==1){
                filled = true;
            }
            else{
                filled = false;
            }
            try{
                Triangle triangle = new Triangle(side1, side2, side3, color, filled);
                triangle.print();
                System.out.println("Enter 1 to run again. Enter another int to stop.");
                running = in.nextInt();
            }
            catch(IllegalTriangleException error){
                System.out.println(error);
            }
        }
        in.close();
    }
}

