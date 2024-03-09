import java.util.Scanner;
public class A15 {
    public static void main(String[] args) {
        Person1 p;
        p=new Person1();
        p.getPerson();
        p=new Person1(20);
        p.getPerson();
        p=new Person1("Samarth");
        p.getPerson();
        p=new Person1("Samarth",21);
        p.getPerson();
        Employee2 e;
        e=new Employee2();
        e.getEmployee();
        e=new Employee2();
        e.getEmployee();
        e=new Employee2("Ram",1600.0f);
        e.getEmployee();
        e=new Employee2("Shyam",1900.0f);
        e.getEmployee();
        Box2 b;
        b=new Box2();
        b.getBox();
        b=new Box2(5);
        b.getBox();
        b=new Box2(5,8,4);
        b.getBox();
        Time1 t;
        t=new Time1();
        t.getTime();
        t=new Time1(5);
        t.getTime();
        t=new Time1(5,15,30);
        t.getTime();
        Customer c;
        c=new Customer(1,"Samarth","7385610506","usturesamarth@gmail.com");
        c.getCustomer();
        c=new Customer(2,"Ghar","8788517218");
        c.getCustomer();

    }
}
class Customer{
    private int id;
    private String name,mobile,email;
    Customer(int id,String name,String mobile,String email){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
    }
    Customer(int id,String name,String mobile){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
    }
    void getCustomer(){
        System.out.println(id+" "+name+" "+mobile+" "+email);
    }
}
class Time1{
    private int hr,min,sec;
    Time1(){

    }
    Time1(int sec){
        this.sec=sec;
    }
    Time1(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    void getTime(){
        System.out.println(hr+" "+min+" "+sec);
    }
}
class Box2{
    private int length,breadth,height;
    Box2(){
        length=1;
        breadth=1;
        height=1;
    }
    Box2(int length){
        this.length=length;
        breadth=1;
        height=1;
    }
    Box2(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    void getBox(){
        System.out.println("Length:"+length+" Breadth:"+breadth+" Height:"+height);
    }
}
class Employee2{
    private int empId;
    private String name;
    private float salary;
    static int count=0;
    private static int generateEmpId(){
        return ++count;
    }
    Employee2(String name,float salary){
        this.name=name;
        this.salary=salary;
        this.empId=generateEmpId();
    }
    Employee2(){
        Scanner sc=new Scanner(System.in);
        this.empId=generateEmpId();
        System.out.print("Enter Employee Name:");
        this.name=sc.nextLine();
        System.out.print("Enter Salary of Employee:");
        this.salary=sc.nextFloat();
    }
    void getEmployee(){
        System.out.println(empId+" "+name+" "+salary);
    }
}
class Person1{
    private String name;
    private int age;
    Person1(){
        name="A";
        age=1;
    }
    Person1(String name){
        this.name=name;
        this.age=1;
    }
    Person1(int age){
        this.age=age;
        this.name="A";
    }
    Person1(String name,int age){
        this.name=name;
        this.age=age;
    }
    void getPerson(){
        System.out.println("Name :"+name+" Age:"+age);
    }
}
