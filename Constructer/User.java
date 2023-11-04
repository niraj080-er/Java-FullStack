import java.util.Scanner;
public class User {
    String username;
    String emailid;
    long mobileno;
    public User(String username, String emailid, long mobileno) {
        this.username = username;
        this.emailid = emailid;
        this.mobileno = mobileno;
    }
    void detail(){
        System.out.println("Username: "+username);
        System.out.println("Emailid: "+emailid);
        System.out.println("Mobileno: "+mobileno);
    }
}
class MainCLass5{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the user Name: ");
        String us_r = sc1.nextLine();
        System.out.println("Enter the emailID: ");
        String em_id = sc1.nextLine();
        System.out.println("Enter the user mobile number : ");
        long mob_no = sc1.nextLong();
        User d1=new User(us_r, em_id, mob_no);
        d1.detail();
    }
}
