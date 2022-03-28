import java.io.*;
import java.util.*;

public class fileHelper {
    
    String error = "Error";
    int letters = 0;
    int words = 0;
    int lines = 0;
    Scanner reader = null;
    File file = null;

    public fileHelper(){};
    public fileHelper(String file_name) throws Exception{
        setInfo(file_name);
    }
    public fileHelper(File file) throws Exception{
        setInfo(file);
    }

    public void print(){
        System.out.println("==================================");
        System.out.println("File: " + file.getName());
        System.out.println("# Letters: " + letters);
        System.out.println("# Words: " + words);
        System.out.println("# lines: " + lines);
        System.out.println("==================================");

    }

     //checks for a valid file. exists, is a file not a directory, and is a .txt
     public boolean isValidFile(File file_name){
        if(file_name.exists()){
            if(file_name.isFile()){
                if(file_name.getName().endsWith(".txt")){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }


    public int getLetters(){
        return letters;
    }
    public int getWords(){
        return words;
    }
    public int getLines(){
        return lines;
    }
   
    


    public void setFile(File file_name){
        file =  file_name;
    }

    public void setReader(File file_name) throws FileNotFoundException{
        reader = new Scanner(file_name);
    }

    public void setLetters(File file_name) throws FileNotFoundException{
        setReader(file_name);
        letters = 0;
        while(reader.hasNext()){
            letters+=reader.next().length();
        }
    }

    public void setWords(File file_name) throws FileNotFoundException{
        setReader(file_name);
        words = 0;
        while(reader.hasNext()){
            reader.next();
            words++;
        }
    }

    public void setLines(File file_name) throws FileNotFoundException{
        setReader(file_name);
        lines = 0;
        while(reader.hasNext()){
            reader.nextLine();
            lines++;
        }
    }

    public void setInfo(String file_name) throws Exception{
        File name = new File(file_name);
        if(!isValidFile(name)){
            throw new Exception(error);
        }
        setFile(name);
        setLetters(file);
        setWords(file);
        setLines(file);
    }

    public void setInfo(File file_name) throws Exception{
        if(!isValidFile(file_name)){
            throw new Exception(error);
        }
        setFile(file);
        setLetters(file);
        setWords(file);
        setLines(file);
    }
    
   
}
