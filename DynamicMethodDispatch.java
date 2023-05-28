package DynamicMehtodDispatch;


class Super{
    // overriding method
    public void display(){
        System.out.println(" thsi is Super method");
    }
}


class Sub extends Super{
    //overridden method 
    public void display(){
        System.out.println("Sub class method");
    }
}



// main class
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Super su=new Sub();   // super class is reference to the object of subclass
        su.display();         // which contain two overriding methods but the method of the 
                              // super class is hided hence the method diaplay of sub class is 
                              //invoked
    }  
    
}
