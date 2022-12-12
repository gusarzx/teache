package project1;

import java.sql.SQLOutput;

public class OOPClassObject {
    public static void main(String[] args) {
        // ООП классы и объекты
        Transport bmw = new Transport(250.5f, 2500, "White", new byte[] {0, 0, 0});
      /*  bmw.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);
       bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordiante = new byte[] {0, 0, 0};
*/
        Transport truck = new Transport(5600, new byte[] {100, 0, 100});
//        truck.speed = 140.5f;
  ///      truck.weight = 5600;
     //   truck.color = "Red";
       // truck.coordiante = new byte[] {100, 0, 100};

 //       String res2 = truck.getValues();
   //     System.out.println(res2);
        //System.out.println("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed);
    }
}
