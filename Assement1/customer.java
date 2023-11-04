import java.util.Scanner;

class customer {
    String name;
    String address;
    long phone;

     customer(String name, String address, long phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    void display() {
        System.out.println("the name of customer is : " + this.name + "\nThe Address of customer is :" + this.address
                + "\nThe phone number of the customer is :" + this.phone);

    }
}

class mainClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of Cutomer");
        String name = sc.next();
        System.out.println("Enter the Address of Cutomer");
        String address = sc.next();
        System.out.println("Enter the Phone Number of Cutomer");
        long phone = sc.nextLong();

        customer c1 = new customer(name, address, phone);
        c1.display();
        sc.close();
    }
}