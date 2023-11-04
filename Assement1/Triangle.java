 class Triangle {
    double length;
    double height;
    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }
    void area(){
        double a = 0.5*length*height;
        System.out.println("Area of triangle: "+a);
    }
}
class MainClass4{
    public static void main(String[] args) {
        Triangle obj1=new Triangle(23.3, 23.6);
        obj1.area();
    }
    
}
