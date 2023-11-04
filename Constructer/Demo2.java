public class Demo2 {
    int x;
    double y;
    Demo2(){ // constructor of the class
        System.out.println("Running Demo2 constructor");
        x=10;
        y=23.45;


    }
}
class MainClass2{
    public static void main(String[] args) {
        System.out.println("Main method Started");
        Demo2 d1 = new Demo2();
        System.out.println("The value of x : "+d1.x);
        System.out.println("The value of Y : "+d1.y);
        System.out.println("Main method ended");
        
    }
}
