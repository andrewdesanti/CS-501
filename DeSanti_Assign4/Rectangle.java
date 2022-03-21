/*

I pledge my honor that I have abided by the Stevens Honor System.
Andrew DeSanti

ex 9.1

*/
public class Rectangle {
    //declare parameters...
    private double height = 1.0;
    private double width = 1.0;
    private String error = "";

    //create the two different constructor functions...
    //create a default rectangle
    public Rectangle()
    {}
    //create a rectangle given width and height with set functions 
    public Rectangle(double new_height, double new_width) throws Exception{
        set_height(new_height);
        set_width(new_width);
    }

    //create get functions to retrieve values from rectangle object...
    public double get_height(){
        return height;
    }
    public double get_width(){
        return width;
    }
    public String get_error(){
        return error;
    }

    //create set functions to change values of the new rectangle object...
    public void set_height(double new_height) throws Exception{
        if(new_height < 0) {
            throw new Exception(error);
        }
        height = new_height;
    }

    public void set_width(double new_width) throws Exception{
        if(!check_valid(new_width)){
            throw new Exception(error);
        }
        width = new_width;
    }
    //create methods specific to this class...
    public double getArea(){
        return (height *  width);
    }
    public double getPerimeter(){
        return (width + width + height + height);
    }
    public boolean check_valid(double value){
        if(value > 0){
            return true;
        }
        else{
            error = "Invalid Parameter. Height and width must be greater than 0";
            return false;
        }
    }
    //override some standard methods...
    public boolean equals(Object obj){
        
        if(obj == null){
            //false if null
            return false;
        }
        //check if it even is a rectangle object
        String name = obj.getClass().getName();//built in to get name
        if(!name.equals("Rectangle")){
            //if the name is not Rectangle, it is a different type of class
            return false;
        }

        Rectangle Rect = (Rectangle) obj;
        if(height != Rect.get_height()){
            //false if different heights
            return false;
        }
        if(width != Rect.get_width()){
            //false if different widths
            return false;
        }

        return true;
    }

    public String toString(){
        return ("Width: " + width + "\n" + "Height: " + height);
    }

    public void print(){
        System.out.println("Rectangle Paramters: ");
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }

}