class Super{
    // overriding method
    public void display(){
        System.out.println(" thsi is Super method");
    }
}


class Sub extends Super{
    //overridden method 
    public void display(){
        System.out.println(" this is sub method");
    }
}



// main class
public class MethodOverriding{
    public static void main(String[] args) {
        // invoking the Super class's method
        Super su=new Super();
        su.display();

        // invoking the sub class method  but the overridding method of the super class is not visible and only the
        //sub class's method is executed
        Sub sb=new Sub();
        sb.display();
    }    
}
