public class Testing{
   public static void main(String[] args) {

      //printing heading
      System.out.println("Feet     Meters   | Meters    Feet");
      System.out.println("---------------------------------");
      
      //printing data
      for (double feet=1.0, meter = 20.0; feet<=10.0; feet++,meter+=5 ) {
         System.out.printf("%-4.1f    ",feet);
         System.out.printf("%5.1f    |   ",footToMeter(feet));
         System.out.printf("%-4.1f     ",meter);
         System.out.printf("%-7.1f \n",meterToFoot(meter));
         
      }

      
   }
   


   //foot to meter
   public static double footToMeter(double feet) {
       double meter=0.305*feet;
      return meter;
   }
   // meter to foot
   public static double meterToFoot(double meter) {
      double feet = 3.279 * meter;
      return feet;
      
   }
}

//output
// Feet     Meters   | Meters    Feet
// ---------------------------------
// 1.0       0.3    |   20.0     65.6
// 2.0       0.6    |   25.0     82.0
// 3.0       0.9    |   30.0     98.4
// 4.0       1.2    |   35.0     114.8
// 5.0       1.5    |   40.0     131.2
// 6.0       1.8    |   45.0     147.6
// 7.0       2.1    |   50.0     164.0
// 8.0       2.4    |   55.0     180.3
// 9.0       2.7    |   60.0     196.7
// 10.0      3.1    |   65.0     213.1
