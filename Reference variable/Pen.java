class Pen {
    String Brand;
    String color;
    double price;

    void write (){
        System.out.println("writting.......");   
     } 
}

class MainClass4{
    public static void main(String[] args) {
        System.out.println("Main method Started");
        Pen d1=new Pen();
        d1.Brand="Cello";
        d1.color="Black";
        d1.price=22.00;
        System.out.println("Pen Brand : " +d1.Brand);
        System.out.println("Pen color : " +d1.color);
        System.out.println("Pen price : "+d1.price);
        d1.write();

        System.out.println("main method ended");
    }
}
