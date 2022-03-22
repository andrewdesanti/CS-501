/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 9.1

*/
import java.util.*;
public class DeSanti9_1{

    public static void main(String[] args) throws Exception{

        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        int running = 1;
        Rectangle sample_rectangle = new Rectangle();

        System.out.println("This program allows the user to input values to test the creation of a rectanlge class.");
        System.out.println("You will be prompted for double values. These will be stored, returned and used to find an area and perimeter.");
        System.out.println("Here are two samples from the question:");

        System.out.println("Height will be 40 and width will be 4.");
        sample_rectangle.setHeight(40);
        sample_rectangle.setWidth(4);
        sample_rectangle.print();

        System.out.println("Height will be 35.9 and width will be 3.5");
        sample_rectangle.setHeight(35.9);
        sample_rectangle.setWidth(3.5);
        sample_rectangle.print();

        System.out.println("Now the program will loop and allow for testing until prompted to stop by the user.");
        while(running==1){
            System.out.println("Enter height as a double.");
            height = in.nextDouble();
            System.out.println("Enter width as a double.");
            width = in.nextDouble();

            try{
                sample_rectangle = new Rectangle(height, width);
                sample_rectangle.print();
                System.out.println("To continue running enter 1. Any other integer will end this test.");
                running = in.nextInt();
            }
            catch(Exception ex){
                System.out.println("Error.");
                System.out.println(ex.getMessage());
                System.out.println("reenter valid values.");
            }
        }
        in.close();
    }
}