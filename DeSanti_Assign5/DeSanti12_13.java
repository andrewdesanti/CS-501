/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 12.13

*/
import java.util.*;
public class DeSanti12_13 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int running = 1;
        fileHelper file_helper = new fileHelper();
        System.out.println("This program allows the user to enter a text file (sample.txt). It returns the number of lines, characters, and words found within the file.");

        while(running == 1){
            System.out.println("Enter the text file name (sample.txt).");
            String file = in.nextLine();
            try{
                file_helper = new fileHelper(file);
                file_helper.print();
            }
            catch(Exception ex){
                System.out.println("ERROR");
                ex.getMessage();
            }
            System.out.println("To run again with a new file name enter 1. To exit enter another integer.");
            running = in.nextInt();
            in.nextLine();
        }

        in.close();

    }
}
