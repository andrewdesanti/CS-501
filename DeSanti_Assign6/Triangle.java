public class Triangle extends GeometricObject{
    private double side1, side2, side3;
    private String errorMessage = "";

    Triangle(){
        side1 = side2 = side3 = 1;
    }

    Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
        if(!isValidTriangle(side1, side2, side3)){
            throw new IllegalTriangleException(side1, side2, side3);
        }
        this.side1 = side1;
        this.side2 = side2;
		this.side3 = side3;
    }

    Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException
	{
		if(!isValidTriangle(side1,side2,side3))
			throw new IllegalTriangleException(side1,side2,side3);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		setColor(color);
		setFilled(filled);
	}

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public void setSide1(double side1) throws IllegalTriangleException{
        if(!isValidTriangle(side1,side2,side3))
			throw new IllegalTriangleException(side1,side2,side3);
        this.side1 = side1;
    }

    public void setSide2(double side2) throws IllegalTriangleException{
        if(!isValidTriangle(side1,side2,side3))
			throw new IllegalTriangleException(side1,side2,side3);
        this.side2 = side2;
    }

    public void setSide3(double side3) throws IllegalTriangleException{
        if(!isValidTriangle(side1,side2,side3))
			throw new IllegalTriangleException(side1,side2,side3);
        this.side3 = side3;
    }

    public boolean isValidTriangle(double side1, double side2, double side3){
        if(side1+side2 > side3 && side2+side3 > side1 && side1+side3 > side2){
            return true;
        }
        else{
            errorMessage = "Error. Invalid Triangle. Side lengths must be greater than 0 and the sum of any two sides must be greater than the remaining.";
            return false;
        }
    }

    public double getPerimeter(){
		 return side1+side2+side3;
	}

    public double getArea(){
        double s = (side1+side2+side3)/2;
        double inside = s*(s-side1)*(s-side2)*(s-side3);
        double area = Math.pow(inside, 0.5);
        return area;
    }

    public void print(){
        System.out.println("============================");
        System.out.println("Side 1: " + side1);
        System.out.println("Side 2: " + side2);
        System.out.println("Side 3: " + side3);
        System.out.println("Color: " + getColor());
        System.out.println("Filled: " + isFilled());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
        System.out.println("============================");
    }

}
