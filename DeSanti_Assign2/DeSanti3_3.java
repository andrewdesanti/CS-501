/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 3.3

*/
import java.util.Scanner;
public class DeSanti3_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("This program will prompt you to enter the six constant values to solve a system of linear equations via Cramer's Rule.");
        System.out.println("If the equation is valid x and y values will be returned. If not, it will be stated so.");
        char letters[] = {'a','b','c','d','e','f'};
        double val[] = new double[6];
        for(int i = 0; i<=5; i++){
            System.out.print(letters[i]);
            System.out.print("= ");
            val[i] = in.nextDouble();
        }
        for(int i = 0; i <= 5; i++){
            System.out.print("Value of ");
            System.out.print(letters[i]);
            System.out.print(" = ");
            System.out.print(val[i]);
            System.out.print("\n");
        }
        double a = val[0];
        double b = val[1];
        double c = val[2];
        double d = val[3];
        double e = val[4];
        double f = val[5];

        double undef_check = (a*d-b*c);
        if(undef_check==0){
            System.out.println("That equation has no solution.");
        }
        //ax+by=e and cx+dy=f
        else{
            double x = (e*d-b*f)/undef_check;
            double y = (a*f-e*c)/undef_check;
            System.out.print("Value of x: ");
            System.out.println(x);
            System.out.print("Value of y: ");
            System.out.println(y);
        }
    }
}