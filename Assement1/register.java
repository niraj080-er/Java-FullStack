
import java.util.Scanner;
class register {
    String name;
    String degree;
    String email;
    long phone;

     register(String name, String degree, String email) {
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

     register(String name, String degree, long phone) {
        this.name = name;
        this.degree = degree;
        this.phone = phone;
    }

    void display() {
        System.out.println("Name of Studennt is:" + this.name + "\n Degree of student is: " + this.degree
                + "\n The email of student is: " + this.email + "\n the Phnoe Number is: " + this.phone);

    }
}

class mainClass3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Jspider");
        System.out.println("Enter 1: for email registeration 2: for Phone Registeration");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("enter your name");
            String name = sc.next();
            System.out.println("enter your Degree");
            String degree = sc.next();
            System.out.println("enter your Email");
            String email = sc.next();

            register reg1 = new register(name, degree, email);
            reg1.display();
        }
        else if(choice == 2){
             System.out.println("enter your name");
            String name = sc.next();
            System.out.println("enter your Degree");
            String degree = sc.next();
            System.out.println("enter your Phone");
            long phone = sc.nextLong();

            register reg1 = new register(name, degree, phone);
            reg1.display();
        }
        else{
            System.out.println("enter valid choice please!");
        }
    }
    
}

