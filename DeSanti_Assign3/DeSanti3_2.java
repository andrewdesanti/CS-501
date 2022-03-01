/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 7.9, 7.10, 7.20

*/
import java.util.*;
public class DeSanti3_2 {
    public static double max(double[] array){
        int len = array.length;
        double max = 0;
        for(int i=0;i<(len-1);i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    public static int indexOfLargestElement(double[] array){
        int len = array.length;
        double max = 0;
        int max_index = 0;
        for(int i=0;i<(len-1);i++){
            if(array[i]>max){
                max=array[i];
                max_index = i;
            }
        }
        return max_index;
    }
    public static void descBubbleSort(double[] array){
        int len = array.length;
        double temp = 0;
        //nested for loop to sort the array
        for(int i=0; i<len; i++){
            for(int j=1; j<(len-i); j++){
                if(array[j-1]<array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        //print the array
        System.out.println("Descended sorted array: ");
        for(int i=0;i<len;i++){
            System.out.print(array[i] + " ");
        }
    }
    
    public static void main(String[] args){
        int running = 1;
        Scanner in = new Scanner(System.in);
        while(running == 1){
            System.out.println("This program is for problems 7.9, 7.10, and 7.20.");
            System.out.println("find the max of 10 doubles. find the index of the max of ten doubles. to bubble sort 10 doubles in descending order.");
            //int choice = in.nextInt();

            //largest number/index in an array 
            double[] ten = new double[10];
            System.out.println("Enter ten doubles: ");
            for(int i=0;i<10;i++){
                ten[i] = in.nextDouble();
            }
            //if(choice == 1){
                double out = max(ten);
                System.out.print("The max value of the ten inputs was: ");
                System.out.println(out);
            //}
            //else if(choice == 2){
                int out2 = indexOfLargestElement(ten);
                System.out.print("The index of the max value of the ten inputs was: ");
                System.out.println(out2);
            //}
            //else if(choice == 3){
                descBubbleSort(ten);
                System.out.println("");
            //}

            System.out.println("To run again enter 1. Any other input will close the program");
            running = in.nextInt();
        }
        in.close();
    }
    
}