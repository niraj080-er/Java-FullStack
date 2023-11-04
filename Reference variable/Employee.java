public class Employee {
    int id;
    String name;
    String gender;
    double salary;
    void work(){
        System.out.println("Employee started the work......");
    }
}
class MainClass6{
    public static void main(String[] args) {
        System.out.println("Main Method stated......");
        Employee emp=new Employee();
        emp.id=23;
        emp.gender="Male";
        emp.name="Niraj kumar";
        emp.salary=45000.00;
        System.out.println("Employee name : "+emp.name);
        System.out.println("Employee Id : "+emp.id);
        System.out.println("employee salary: "+emp.salary);
        System.out.println("Employee gender : " +emp.gender);
        emp.work();
        System.out.println("Main method ended.......");
    }
}