class Demo2{
    static int x=13;
    static void test1(){
        System.out.println("running test() method");

    }
}
class MainClass1{
    public static void main(String[] args) {
        System.out.println("main method starting");
        System.out.println("X value is "+ Demo2.x);
        Demo2.test1();
        System.out.println("modifying the x value");
        Demo2.x=200;
        System.out.println("X value after modifying " +Demo2.x);
        System.out.println("main method stopped");
    }
    
}
