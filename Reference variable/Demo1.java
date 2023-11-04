
public class Demo1 {
    int x=10;
    int y=20;
    void test(){
        System.out.println();
    }  
}
class MainClass1{
    public static void main(String[] args) {
        Demo1 d1=new Demo1();
        Demo1 d2=d1;
        d1.x=100;
        d1.y=200;
        System.out.println(d2.x);
        System.out.println(d2.y);
        System.out.println(d1);
        System.out.println(d2);
    }
}