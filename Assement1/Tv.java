class TV {
    String brand;
    double size;
    double price;

    TV(String brand, double size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }
    void detailsOfTV(){
        System.out.println("The brand of TV is: "+ this.brand + "\n the size of TV "+ this.size +"\n the price of TV : " +this.price);
    }
    void displayMovie(){
        System.out.println("TV is displaying movie on Screen with hd quality ");
    }
    void playSound(){
        System.out.println("Tv is playing video with sound ");
    }


}

class mainClass5 {
    public static void main(String[] args) {
        TV t1= new TV("samsung", 42, 19500.50);

        t1.detailsOfTV();
        System.out.println("===========================");
        t1.displayMovie();
        System.out.println("=========================");
        t1.playSound();

    }

}