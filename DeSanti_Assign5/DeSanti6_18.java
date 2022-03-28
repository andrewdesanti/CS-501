/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 6.18

*/
import java.util.*;
public class DeSanti6_18{

    //function to convert a string to a list of characters
    public static List<Character>
    convertStringToCharList(String str)
    {
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }
        return chars;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Character[] list_of_nums = {'0','1','2','3','4','5','6','7','8','9'};
        int running = 1;
        //repeat loop here...
        while(running == 1){
            System.out.println("Enter a valid Password.\nIt must contain at least 10 characters.\nIt must only consist of leters and digits.\nIt must contain at least 3 digits (numbers i.e. 1 2 3).");
            String password_attempt = in.nextLine();
            System.out.print("You entered: " + password_attempt + "\n");
            boolean isValid = true;
            List<Character> password_list = convertStringToCharList(password_attempt);
            //first check if it is at least ten long...
            int length_of_password_list = password_list.size();         //this contains the length of the entered password (ie 1234 = length of 4)
            if(length_of_password_list<10){
                isValid = false;
            }
            //check for not all digits and letters
            for(int i=0;i<length_of_password_list;i++){
                if((Character.isLetterOrDigit(password_attempt.charAt(i)) == false)){ //for all values within the string, if they are not a letter or digit the string is not valid set the flag
                    isValid = false; 
                }
            }
            //check for at least three numbers
            int num_nums = 0;
            for(int i=0;i<length_of_password_list;i++){//check if each value is a number
                for(int j=0;j<=9;j++){
                    if(password_list.get(i)==list_of_nums[j]){
                        num_nums++;
                    }
                }
            }
            if(num_nums<3){ //if there are less than three numbers, invalid input
                isValid = false;
            }

            //finally check response
            if(isValid==true){
                System.out.println("Valid Password.");
            }
            else{
                System.out.println("Invalid Password.");
            }
            System.out.println("To run again enter '1'. Enter any other number to end the program.");
            running = in.nextInt();
            in.nextLine();
        }
        in.close();
    }

}