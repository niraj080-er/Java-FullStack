public class Notebook {
    double Size;
    int pages;
    String Brand;
    int price;

    void Open(){
        System.out.println("Starting opening the notebook.....");
    }
}
class MainClass5{
    public static void main(String[] args) {
        System.out.println("Main Method Started.........");
        Notebook Book =new Notebook();
        Book.Brand="ClassMate";
        Book.Size=6.6;
        Book.pages=200;
        Book.price=200;
        System.out.println("NoteBook Brand : " +Book.Brand);
        System.out.println("NoteBook Price : " +Book.price);
        System.out.println("Pages in NoteBook : "+Book.pages);
        System.out.println("Size of NoteBook : " +Book.Size);
        Book.Open();
        System.out.println("Main method ended.............");
    
    }
}
