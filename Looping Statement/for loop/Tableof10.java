public class Tableof10 {
    public static void main(String[] args) {
        int number = 10;  int table=0;
        System.out.println("Ten able");
        for (int i = 1; i <= 10; i++) {
            table = number * i;
            System.out.println(number + " x " + i + " = " + table);
        }
    }
}
