  

// main  class
public class superKeywordDemo{   
    public static void main(String[] args) {
        System.out.println("");
        Circle1 circle = new Circle1(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());
        
        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " +rectangle.getPerimeter());
        System.out.println("The height is :"+rectangle.getheight());
        System.out.println("The width is :"+rectangle.getWidth());
        
    }
    
}


//super class
class GeometricObject{
    //properties of the class
    private String color="white";           //by default color of the object
    private boolean filled;
    private java.util.Date dateCreated;
    
    //constructor, when ni argument is passed 
    public GeometricObject(){
        dateCreated=new java.util.Date();
        
    }
    // constructor when arguments  are passed 
    public GeometricObject(String color,boolean filled){
        dateCreated=new java.util.Date();
        this.color=color;
        this.filled=filled;

    }
    //function for returning the color
    public String getColor(){
        return color;
    }
    //function for setting the color
    public void setColor(String color){
        this.color=color;
    }
    
    //function to check whether the object is filled with color or not
    public boolean isFilled(){
        return filled;
    }
    //funtion to set  filled 
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    //funtion to get date  created 
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    // returning the details of the geometric object
    public String toString(){
        return ("created on: "+dateCreated +"\ncolor: "+color+"\nfilled: "+filled);
    }
}






// subclass of circle 
class Circle1 extends GeometricObject{       // inheriting the contents of the superclass in the class circle using extends keyword 
    private double radius;

    public Circle1(){        
    }
    public Circle1(double radius){
        this.radius=radius;        
    }
    public Circle1(double radius,String color,boolean filled){   
        //using super keyword to invoke the constructor of the super class  ***********************************************************👈🏼👈🏼
        // the constructor invoking statement must be first while invoking    *********************************************************
        super(color,filled);
       //👆🏼
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    public double getDiameter(){
        return 2*radius;
    }
    public void printCircle(){
        System.out.println("the circle is created on "+getDateCreated()+"an dthe radius is "+getRadius());
    }
}



// rectangle subclass 
class Rectangle extends GeometricObject{
    private double width;
    private double height;
    
    public Rectangle(){
        
    }
    public Rectangle(double width, double height){
        this.height=height;
        this.width=width;

    }
    public Rectangle(double height ,double width,String color,boolean filled){
        this.height=height;
        this.width=width;
        setColor(color);
        setFilled(filled);
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;

    }
    
    public double getheight(){
        return height;
    }
    public void setheight(double height){
        this.height=height;
    }

    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return  2*(height+width);
    }
    


}



