
class GrandParents{
    //no inheritance in this constructor so the the Grandparents constructor are executed
    public GrandParents(){
        System.out.println("grandparent constructor");
    }
}

//inheriting the GrandParents(superclass) class in the parent class(subclass) 
class Parent extends GrandParents{  
    // without executing the GrandChild constructor it moves to the child constructor
    public Parent(){     
        System.out.println("parent constructor");
    }
}


//inheriting the parent(superclass) class in the child class(subclass) 
class Child extends Parent{
    // without executing the GrandChild constructor it moves to the child constructor
    public Child(){
        System.out.println("child constructor");
    }
}

//inheriting the Child(superclass) class in the GrandChild class(subclass) 
class GrandChild extends Child{
    // without executing the GrandChild constructor it moves to the child constructor
    public GrandChild(){
        System.out.println("grand child constructor");
    }
}



// main class
public class constructorChaining {
    public static void main(String[] args) {
        GrandChild gC=new GrandChild(); // creating the object of the GrandChild Class
    }    
}
