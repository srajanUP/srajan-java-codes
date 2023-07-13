package DefaultMethodDemoInInterface;


//camera interface
interface camera{
    void takesnap();
    void recordvideo();
    //default method is used to add more functionality to the inteface.
    //it's implementations in must in an interface.
    // it can be override in an implemented class
    default void record4kVideo(){
        System.out.println("recording in 4k");
    }
}


//wifi interface
interface wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}



//cell phone class
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("Cwonnecting...");
    } 
}



//smartphone class
class MySmartphone extends MyCellPhone implements wifi,camera{
    public void takesnap(){
         System.out.println("taking snap");
    }

    public void recordvideo(){
        System.out.println("recording video");
    }
    public String[] getNetworks(){
        System.out.println("getting list of networks");
        String[] networkList={"harry","srajan","aakash","aman"};
        return networkList;
    }

    public void connectToNetwork(String Network){
        System.out.println("connecting to "+Network);
 
    }

    //implementing the 4k video in the class
    public void  record4kVideo(){
        System.out.println("this video is in 4k");
    }
}


//main class
public class DefaultMethodInInterface {
    public static void main(String[] args) {
        MySmartphone ms=new MySmartphone();
        String[] ar=ms.getNetworks();
        for (String a:ar) {
            System.out.println(a);
        }
    }

    
}
