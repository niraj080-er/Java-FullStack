import java.util.Scanner;
class Car {
   String brand;
   String engine_type;
   String fuelType;
   int capacity;
   String model;

    Car(String brand, String engine_type, String fuelType, int capacity, String model) {
      this.brand = brand;
      this.engine_type = engine_type;
      this.fuelType = fuelType;
      this.capacity = capacity;
      this.model = model;
   }

   void details(){
      System.out.println("your brand is: "+this.brand+"\nand engine type is: "+this.engine_type+"\nand fuel type of car is "+ this.fuelType+ "\nand the capacity of the car is "+ this.capacity +"\nand the model is: "+this.model);
   }

}

class mainClass1 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Brand ");
   String brand=sc.next();
   System.out.println("Enter the Engine Type ");
   String engineType=sc.next();
   System.out.println("Enter the Fuel Type ");
   String fuelType=sc.next();
   System.out.println("Enter the Capacity ");
   int capacity= sc.nextInt();
   System.out.println("Enter the model ");
   String model=sc.next();   

   Car c1 = new Car(brand, engineType, fuelType, capacity, model);
   c1.details();
   sc.close();
}
   
}