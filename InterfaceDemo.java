package InterfaceDemo;

//declaring the interface
// all the methods of the interface class is necessary to implement
// it is different from the abstract classes i.e only abstract methods need to be implemented


//creating first interface
interface Bicycle{
    //we can define the properties in the interface
    int a=10;   //it is a final and can not be changed
    void applyBreak(int decrement);
    void speedup(int increment);
}


//creating the another interface
interface HornBicycle{
    void blowhorn1();
    void blowhorn2();
}


//creating the class to implement the the interface methods 
class AvonCycle implements Bicycle,HornBicycle{
    void blowHor(){
        System.out.println("pee pee");
    }
     
    //inplementing the method applybreak
    public void applyBreak(int decrement){    //method must be defined public while implementing
        System.out.println("applying break");
    }
    //implementing the method speedup 
    public void speedup(int increment){
        System.out.println("sppeding up");
    }
    
    //implementing the methods of the HornBicycle interface
    public void blowhorn1(){
        System.out.println("peeeeeeee");
    }
    public void blowhorn2(){
        System.out.println("pee pee pee pee");
    }


}


//main class
public class InterfacesDemo {
    public static void main(String[] args) {

        //creating object of AvonCycle
        AvonCycle cyclesrajan=new AvonCycle();
        //calling the properties of the interface bicycle
        System.out.println(cyclesrajan.a);
        
        //unable to modify the properties of the interface
        //cyclesrajan.a=15; --error because a is final
        
        cyclesrajan.blowhorn1();
        cyclesrajan.blowhorn2();
    }
    
}





