/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 6.23

*/
import java.util.*;
public class DeSanti6_23 {
    //convert a string to an arraylist for parsing
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
        System.out.println("This program allows you to enter a word and then a character. It returns the number of times the character exists within the word.");
        int running = 1;
        while(running == 1){
            int again = 1;
            System.out.println("Enter a string to parse over: ");
            String word = in.nextLine();
            List<Character> array_word = convertStringToCharList(word);
            int length_of_word = array_word.size();
            while(again == 1){
                System.out.println("Enter a character to search for within the word: " + word + " :");
                char char_search = in.next().charAt(0);
                int char_count = 0;
                for(int i=0;i<length_of_word;i++){
                    if(array_word.get(i) == char_search){
                        char_count++;
                    }
                }
                System.out.println("The character: " + char_search + " appeared within the word " + word + " " + char_count + " times.");
                System.out.println("To search for another character within the same word enter 1. Any other integer input to input another word or quit.");
                again = in.nextInt();
            }
            System.out.println("To try another word enter 1. Enter any other integer to quit.");
            running = in.nextInt();
            in.nextLine();

        }
        in.close();
    }
}
