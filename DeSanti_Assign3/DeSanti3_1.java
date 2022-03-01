/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 5.16, 5.20, and 6.10

*/
import java.util.*;
public class DeSanti3_1 {
    //function to check if a number is prime
    static boolean primeCheck(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    //prewritten isPrime
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            } 
        }
        return true;
    }

    public static void primeFactors(int value){
        while(value%2==0){
            System.out.print(2 + " ");
            value /= 2;
        }
        for (int i=3; i<=Math.sqrt(value); i+=2)
        {
            while (value%i == 0)
            {
                System.out.print(i + " ");
                value/= i;
            }
        }
        if (value > 2)
            System.out.print(value);
    }

    public static void main(String[] args){
        //setup and inputs
        System.out.println("This program calculates the first 1000 primes, displays the first 50, and allows you to search for primes. Non-primes return prime factorization.");
        int running = 1;
        Scanner in = new Scanner(System.in);
        int p_count = 0;
        int[] p_array = new int[1000];
        //check until you have the first 1000 primes
        for(int i=0;i<10000;i++){
            if(isPrime(i)==true){
                p_array[p_count]=i;
                if(p_count<999)
                {  
                   p_count++;
                }
            }
        }
        //print first 50 primes
        System.out.println("The first 50 primes: ");
        for(int j=0;j<50;j++){
            System.out.println(p_array[j]);
        }
        while(running == 1){
            System.out.println("Enter an integer. If it is prime true will be returned. \n If not, its prime factorizaion will be returned.");
            int search = in.nextInt();
            boolean temp = false;
            for(int i =0;i<p_array.length;i++){
                if(p_array[i]==search){
                    System.out.println("Is Prime.");
                    temp = true;
                    break;
                }
            }
            if(temp == false){
                System.out.println("Not Prime.");
                System.out.println("Prime factorization: ");
                primeFactors(search);
                System.out.println(" ");
            }
            System.out.println("Enter 1 to run again. Other inputs end program.");
            running = in.nextInt();
        }
        
    }
}