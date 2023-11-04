class Demo3 {
    int x=10;
    int y=20;
    void test(){
        System.out.println("Function is started");
    }
    
}
class MainClass3{
    public static void main(String[] args) {
        Demo3 d1 ;
        d1=new Demo3();
        d1.x=25;
        d1.y=45;
        d1=new Demo3();
        System.out.println(d1.x);
        System.out.println(d1.y);



    }
}
