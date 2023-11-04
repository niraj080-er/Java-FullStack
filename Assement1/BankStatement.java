import java.util.Scanner;
public class BankStatement {
    int actbal;
    String name;
    long accountNumber;
    String ifsc;
    double balance;

    Scanner ip=new Scanner(System.in);

    {
        actbal=500;
    }
    public BankStatement(String name, long accountNumber, String ifsc) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.ifsc = ifsc;
    }
    void balanceEnquiry(){
        System.out.println("======Balalace Enquiry ======");
        System.out.println(" Hi Mr/Ms "+this.name+"welecome to SBI Bank: ");
        System.out.println("Your Balance is : "+actbal);

    }
    void deposite(){
        System.out.println("======Deposite Balance ======");
        System.out.println("Hi "+this.name+"Please enter the deposite amount ");
        int amt=ip.nextInt();
        actbal=actbal+amt;
        System.out.println("Amount Deposite Succesfully!!!!");
    }
    void withdraw(){
        System.out.println("=======withdraw Balance");
        if(actbal>500){

        System.out.println("Hi "+this.name+"Please enter the withdraw amount ");
        int wamt=ip.nextInt();
        if(actbal-wamt>500){
            actbal=actbal-wamt;
            System.out.println("Withdraw Succesfull");
        }else{
            System.out.println("you have not sufficient balance !!!!");
        }
        
        }else{
            System.out.println("you have not sufficient balance !!!!");
        }
    }
    
    
}
class MianClass{
    public static void main(String[] args) {
        BankStatement b1=new BankStatement("niraj", 987654, "sbin0014292");
        b1.balanceEnquiry();
        b1.deposite();
        b1.withdraw();

    }
}