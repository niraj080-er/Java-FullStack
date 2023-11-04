public class Assignment1 {
    String AppName;
    String UserName;
    int IdNumber;
    int Contact;
    void Message(){
        System.out.println("Running tets of method");
    }
}
class WhatsApp{
    public static void main(String[] args) {
        System.out.println("Main Method Started.............");
        Assignment1 SM= new Assignment1();
        SM.AppName="WhatsApp";
        SM.UserName="Niraj Kumar";
        SM.IdNumber=6280;
        SM.Contact= 628045;
        System.out.println("App Name is : "+SM.AppName);
        System.out.println("User name is : "+SM.UserName);
        System.out.println("ID is : "+SM.IdNumber);
        System.out.println("Contact Number is : " +SM.Contact);
        SM.Message();
        System.out.println("Main Method Ended.............");


    }
}
