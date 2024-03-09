public class A18 {
    public static void main(String[] args) {
        /*Circle5 c=new Circle5();
        System.out.println(c.getArea());*/
        Employee4 e=new Employee4(55.0f);
        e.showEmployeeData();
    }
}
class Person5{
    private String name;
    private int age;
    Person5(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person5(){
        this("ABC",16);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class Employee4 extends Person5{
    private float salary;
    Employee4(){
        this(1.0f);
    }
    Employee4(float salary){
        this.salary=salary;
    }
    void showEmployeeData(){
        System.out.println(getName()+" "+getAge()+" "+salary);
    }
}
class Circle5{
    private int radius;
    private static final float PI;
    static
    {
        PI=3.14f;
    }
    {
        radius=5;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    float getArea(){
       return PI*radius*radius;
    }
}
