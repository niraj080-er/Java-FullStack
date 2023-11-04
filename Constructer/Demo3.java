public class Demo3 {
    int x;
    double y;
    Demo3(int arg1, double arg2){
        System.out.println("Running Demo3 Constructor ");
        x=arg1;
        y= arg2;

    }
}
class MainClass3
{
    public static void main(String[] args) {
        System.out.println("Main Method Started ");
        Demo3 d3 = new Demo3(12, 34.4);
        System.out.println("The value of X : "+d3.x);
        System.out.println("The value of y : "+d3.y);
        Demo3 d4 = new Demo3(12,45.5);
        System.out.println("The value of X : "+d4.x);
        System.out.println("The value of y : "+d4.y);
        System.out.println("Main Method ended ");
    }
}