package AbstractionDemo;


//abstract class that is to be inherited
abstract class AbstractionDemoGeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date Datecreated;


    // construct a default geometric object
    protected AbstractionDemoGeometricObject(){
        Datecreated =new java.util.Date();
    }
    // construct a geometric object with default color and filled
    protected AbstractionDemoGeometricObject(String color,boolean filled){
        Datecreated =new java.util.Date();
        this.color=color;
        this.filled=filled;
    }

    //return color
    public String getColor(){
        return color; 
    }

    // set a new color 
    public void setColor(String color){
        this.color=color;
    }

    //return filled
    public boolean isFilled(){
        return filled;
    }

    //set a new filled
    public void setFilled(boolean filled){
        this.filled=filled;
    }

    //get date created
    public java.util.Date getDateCreated(){
        return Datecreated;
    }

    public String toString(){
        return "created on "+Datecreated+" \n color: "+color+" and filled :"+filled;
    }

    //abstract method getArea
    public abstract double getArea();

    //abstract method getprimeter
    public abstract double getPerimeter();

}



// circle class extends to the superclass
class circle extends AbstractionDemoGeometricObject{
    private double radius=3;
    @Override
    //overriding the abstract method getArea()
    public double getArea(){
        return 3.14*radius*radius;
    }
    
    //overriding the abstract method getPerimeter
    public double getPerimeter(){
        return 2*3.14*radius;
    }

}



//rectangle class extends to superclass
class rectangle extends AbstractionDemoGeometricObject{
    private double length=4;
    private double breadth=6;
    
    //overriding the getArea() method
    public double getArea(){
        return length*breadth;
    }
    
    //overriding the getPerimeter() method
    public double getPerimeter(){
        return 2*(length+breadth);
    }

}


//main class
public class TestGeometricObject{
    public static void main(String[] args) {
        //creating two geometric objects
        circle circle1=new circle();
        rectangle rectangle1=new rectangle();


        //calling the equalArea() to check if the area are equal or not
        System.out.println(" the area of two objects are equal? : "+equalArea(circle1, rectangle1));


        //displaying the circle 
        displayGeopmetricObject(circle1);
        
        //displaying the rectangle 
        displayGeopmetricObject(rectangle1);


    }

    //method  for displaying the geometric object
    public static void displayGeopmetricObject(AbstractionDemoGeometricObject object){
        System.out.println();
        System.out.println("the area of object is : "+ object.getArea());
        System.out.println("the perimeter of the object is : "+object.getPerimeter());
    }

    //method for comapring the two objects
    public static boolean equalArea(AbstractionDemoGeometricObject object1,AbstractionDemoGeometricObject object2){
        if (object1.getArea()==object2.getArea()){
            return true;
        }
        return false;
    }
    

}
