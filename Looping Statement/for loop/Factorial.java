public class Factorial {
    public static void main(String[] args) {
        int n=10;
        int b=1;
        for(int i=1; i<=n; i++){
            b*=i;
        }
        System.out.println("The factorial of " + n + " = " + b);
       
    }
}
