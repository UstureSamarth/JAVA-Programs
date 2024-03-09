import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class A16 {
    public static void main(String[] args) {
        /*Employee3 e;
        e=new Employee3();
        e.setEmployee();
        e.getEmployee();
        e.setEmployee();
        e.getEmployee();
        ThickCircle t=new ThickCircle();
        t.setRadius(5);
        t.setThickness(2);
        System.out.println("Hollow Area:"+t.getArea());
        System.out.println("Thickness Area:"+t.getThicknessArea());*/

    }
}
class Contact1{
    private String name,mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
class DetailedContact extends Contact1{
    private String email;
    private LocalDateTime dob;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }
}
class Circle3{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    float getArea(){
        return 3.14f*radius*radius;
    }
}
class ThickCircle extends Circle3{
    private int thickness;

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    public float getThicknessArea(){
        return 3.14f*(getRadius()+thickness)*(getRadius()+thickness)-getArea();
    }
    public float getHollowArea(){
        return getArea();
    }
}
class Person2{
    private String name;
    private int age;

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
}
class Employee3 extends Person2{
    private float salary;
    public void setEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name:");
        setName(sc.nextLine());
        System.out.print("Enter Age:");
        setAge(sc.nextInt());
        System.out.print("Enter Salary:");
        this.salary=sc.nextFloat();
    }
    public void getEmployee(){
        System.out.println("Name:"+getName()+" Age:"+getAge()+" Salary:"+salary);
    }
}
