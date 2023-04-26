
// static method is accessing the non-static/instance variable

public class staticKeyword{
    public static void main(String[] args) {
        
        Circles c1=new Circles();
        c1.radius=15;

        System.out.println("area of the circle c1 is :"+c1.getArea());
    
        Circles c2=new Circles();

        System.out.println("area of c1 circle is :"+c2.getArea(20.0));


        System.out.println("circles are"+Circles.getNoOfObjects());
        System.out.println("circles are"+Circles.getNoOfObjects());


        System.out.println(Circles.radius);     // static method can not access the non static data field
        
    }
}

class Circles{
    double radius=10;                     // an instance variable
    static int noOfObjects=1;

    double getArea(){
        return Math.PI*radius*radius;
    }

    static int getNoOfObjects(){
        int y=noOfObjects++;
        return y;
    }

    double getArea(double radius){
        return Math.PI*radius*radius;
    }

    
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////static method is accessing the static datafield////////////////////////////////



public class staticKeyword{
    public static void main(String[] args) {
        
        Circles c1=new Circles();
        c1.radius=15;

        System.out.println("area of the circle c1 is :"+c1.getArea());
    
        Circles c2=new Circles();

        System.out.println("area of c1 circle is :"+c2.getArea(20.0));


        System.out.println("circles are"+Circles.getNoOfObjects());
        System.out.println("circles are"+Circles.getNoOfObjects());


        System.out.println(Circles.radius);  // static method can only access the static data field
        
    }
}

class Circles{
    static double radius=10;          // static data field 
    static int noOfObjects=1;

    double getArea(){
        return Math.PI*radius*radius;
    }

    static int getNoOfObjects(){
        int y=noOfObjects++;
        return y;
    }

    double getArea(double radius){
        return Math.PI*radius*radius;
    }

    
}


