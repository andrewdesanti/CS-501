import java.util.*;

public class MyDate {
    private int year;
    private int month;
    private int day;

    MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    MyDate(long timeElapsed){
        setDate(timeElapsed);
    }

    MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getDay(){
        String yad = String.valueOf(day);
        return (day < 10 ? "0" + yad : yad);
    }

    public String getMonth(){
        String mon = String.valueOf(month+1);
        return (day < 10 ? "0" + mon : mon);
    }

    public int getYear(){
        return year;
    }

    public void setDate(long millis){
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(millis);
        year = cal.get(GregorianCalendar.YEAR);
        month = cal.get(GregorianCalendar.MONTH);
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
