class Demo1{
    Demo1(){
        System.out.println("Running Demo1 constructor");
    }
}
class MainClass1{
    public static void main(String[] args) {
        System.out.println("main method ended");
        Demo1 d1=new Demo1();
        Demo1 d2=new Demo1();
        System.out.println("main methed ended");
    }
}