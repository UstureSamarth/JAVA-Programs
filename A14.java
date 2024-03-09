public class A14 {
    public static void main(String[] args) {
        /*Person p=new Person();
        p.setValuesOfPerson("Samarth",21);
        p.printValuesOfPerson();*/

    }
}
class Person{
    private String name;
    private int age;
    public void setValuesOfPerson(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void printValuesOfPerson(){
        System.out.println("Name:"+name+" Age:"+age);
    }
}
class Employee1{
    int empId;
    String name;
    float salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
class Box1{
    private int length,breadth,height;
    protected int volume,surfaceArea;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }
    protected int getVolume(){
        volume=length*breadth*height;
        return volume;
    }
    protected int getSurfaceArea(){
        surfaceArea=2*(length*breadth+breadth*height+height*length);
        return surfaceArea;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
