public class A17 {
    public static void main(String[] args) {
        ThickCircle1 t=new ThickCircle1();
        t.setRadius(7);
        t.setThickness(5);
        System.out.println("Area of thickcircle is:"+t.getArea());
        Person3 p=new Person3();
        p.setPerson(21);
        p.getPerson();
        p=new Person3();
        p.setPerson("Samarth");
        p.getPerson();
        p=new Person3();
        p.setPerson("Samarth",21);
        p.getPerson();
        FilledRectangle f=new FilledRectangle();
        f.setLength(3);
        f.setBreadth(5);
        f.setBorderColor(4);
        f.setFillColor(2);
        f.printRectangleColor();
        Coordinate c=new Coordinate();
        c.setCoordinate(3,4);
        System.out.println("Distance from origin:"+c.getDistance());
        Coordinate d=new Coordinate();
        d.setCoordinate(5,3);
        System.out.println("Distance between two points:"+c.getDistance(d));
        Person4 p1=new Person4();
        p1.setName("Samarth");
        p1.showName();
        p1.showName("Mr");
    }
}
class Person4{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void showName(){
        System.out.println("Name is "+name);
    }
    void showName(String title){
        System.out.println("Name is \""+title+"\" "+name);
    }
}
class Coordinate{
    private int x,y;
    void setCoordinate(int x,int y){
        this.x=x;
        this.y=y;
    }
    float getDistance(){
        return (float) Math.sqrt(x*x+y*y);
    }
    double getDistance(Coordinate c){
        return (float) Math.sqrt((x-c.x)*(x-c.x)+((y-c.y)*(y-c.y)));
    }
}
class Rectangle{
    private int length,breadth,borderColor;

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

    public int getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(int borderColor) {
        this.borderColor = borderColor;
    }
    void printRectangleColor(){
        System.out.println(borderColor);
    }
}
class FilledRectangle extends Rectangle{
    private int fillColor;
    public int getFillColor() {
        return fillColor;
    }
    public void setFillColor(int fillColor) {
        this.fillColor = fillColor;
    }
    void printRectangleColor(){
        System.out.println("Border Color is "+super.getBorderColor()+" Fill color is "+fillColor);
    }

}
class Person3{
    private int age;
    private String name;
    void setPerson(String name){
        this.name=name;
    }
    void setPerson(int age){
        this.age=age;
    }
    void setPerson(String name,int age){
        this.name=name;
        this.age=age;
    }
    void getPerson(){
        System.out.println("Name:"+name+" Age:"+age);
    }
}
class Circle4{
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
class ThickCircle1 extends Circle4{
    private int thickness;

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    float getArea(){
        return (3.14f*(getRadius()+thickness)*(getRadius()+thickness))-super.getArea();
    }
}
