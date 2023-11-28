public class ReverseTableof10 {
    public static void main(String[] args) {
        int number=10; int table=0;
        System.out.println("Reverse table of ten");
        for(int i=10; i>=1; i--){
            table=number*i;
             System.out.println(number + " x " + i + " = " + table);
        }  
    }
}