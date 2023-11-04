public class Demo4 {
    int id;
    String name;
    double salary;

    // cretating constructor 

    Demo4(int arg1, String arg2, double arg3){
        System.out.println("Running the Constructer");
        id=arg1;
        name = arg2;
        salary=arg3;
        }
        
        // creating method 
        void details(){
            System.out.println("ID: " + id );
             System.out.println("Name: " +name);
             System.out.println("Salary: " +salary);
        }    
}
class MainClass4{
    public static void main(String[] args) {
        System.out.println("Main method Started ");
        Demo4 e1 = new Demo4(12, "Niraj", 450800);
        Demo4 e2 = new Demo4(12, "Rahul", 450000);
        e1.details();
        e2.details();
        System.out.println("Main method ended ");
        
    }
}