/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 9.5

*/
import java.util.*;
public class DeSanti9_5 {
    public static void main(String[] args){
        final long millis = 1234567898765L;
        GregorianCalendar now = new GregorianCalendar();

        System.out.println("This program uses java's builtin Gregorian Calander class to display the month, day, and year at runtime.");
        System.out.println("It then changes the time to 1234567898765L milliseconds after 1/1/1970 and displays the month, date, and year.");


        System.out.println("Current Date Information: ");
        System.out.println("Month: " + (1+now.get(GregorianCalendar.MONTH)));
        System.out.println("Day: " + now.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Year: " + now.get(GregorianCalendar.YEAR));

        now.setTimeInMillis(millis);
        System.out.println("Information after setting date to 1234567898765L milliseconds after 1/1/1970: ");
        System.out.println("Month: " + now.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + now.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Year: " + now.get(GregorianCalendar.YEAR));
    }
}
