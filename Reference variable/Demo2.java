public class Demo2 {

int x=12;
void test(){
    System.out.println("Function tet() method");
}}
class MainClass2{
    public static void main(String[] args) {
        new Demo2().test();
        Demo2 d1= new Demo2();
        Demo2 d2= new Demo2();
        Demo2 d3= new Demo2();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        

    }
}
