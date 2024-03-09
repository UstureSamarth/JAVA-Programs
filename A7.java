public class A7 {
    public static void main(String[] args) {
        Complex c=new Complex();
        c.setValue(3,4);
        c.printValue();
        Time t=new Time();
        t.setTime(3,5,50);
        t.displayTime();
        Cuboid cu=new Cuboid();
        cu.setValues(5,10,4);
        cu.getValues();
        System.out.println("Volume of Cuboid=" +cu.volumeOfCuboid());
        System.out.println("Surface Area Of Cuboid=" +cu.surfaceAreaOfCuboid());
        Employee e=new Employee();
        e.setEmpId(1);
        e.setName("Samarth");
        e.setSalary(5.6f);
        System.out.println("Employee "+e.getEmpId()+" "+e.getName()+" "+e.getSalary());
        Contact co=new Contact();
        co.setId(1);
        co.setFirstName("Samarth");
        co.setLastName("Usture");
        co.setMobileNo("+917385610506");
        co.setEmailId("usturesamarth@gmail.com");
        System.out.println("Contact "+co.getId()+" "+co.getFirstName()+" "+co.getLastName()+" "+co.getMobileNo()+" "+co.getEmailId());
        Question q=new Question();
        q.setQueNo(1);
        q.setQue("Capital of India is ?");
        q.setOptionA("Delhi");
        q.setOptionB("Mumbai");
        q.setOptionC("Chennai");
        q.setOptionD("BhagyaNagar");
        q.setAnswer("Delhi");
        System.out.println(q.getQueNo()+") "+q.getQue());
        System.out.println("A) "+q.getOptionA()+" B) "+q.getOptionB()+" C) "+q.getOptionC()+" D) "+q.getOptionD());
        System.out.println("Answer:"+q.getAnswer());
        Course cp=new Course();
        cp.setCourseId(1);
        cp.setCourseName("C++ and STL");
        cp.setDuration(2.5f);
        cp.setFee(3500);
        System.out.println(cp.getCourseId()+" "+cp.getCourseName()+" "+cp.getDuration()+" Months "+cp.getFee());
        Distance d1=new Distance();
        d1.setDistance(10,1200,120);
        Distance d2=new Distance();
        d2.setDistance(20,2200,220);
        Distance d3=d1.addDistance(d2);
        d3.displayDistance();
        Circle ci=new Circle();
        ci.setRadius(5);
        System.out.println("Area of Circle="+ci.areaOfCircle());
        System.out.println("Circumference of Circle="+ci.circumferenceOfCircle());
        Book b=new Book();
        b.setBookId(1);
        b.setTitle("Avengers");
        b.setAuthor("Marvel");
        b.setPrice(5526.0f);
        System.out.println(b.getBookId()+" "+b.getTitle()+" "+b.getPrice()+" "+b.getAuthor());
    }
}
class Complex{
    int real,imag;
    void setValue(int real,int imag){
        this.real=real;
        this.imag=imag;
    }
    void printValue(){
        System.out.println(real+"+"+imag+"i");
    }
}
class Time{
    int hr,min,sec;
    void setTime(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    void displayTime(){
        System.out.println(hr+" hr "+min+" min "+sec+" sec");
    }

}
class Cuboid{
    int length,breadth,height;
    void setValues(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    void getValues(){
        System.out.println("Length="+length+" Breadth="+breadth+" Height="+height);
    }
    int volumeOfCuboid(){
        return length*breadth*height;
    }
    int surfaceAreaOfCuboid(){
        return 2*(length*breadth+breadth*height+length*height);
    }
}
class Employee{
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
class Contact{
    int id;
    String firstName,lastName,mobileNo,emailId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
class Question{
    int queNo;
    String que,optionA,optionB,optionC,optionD,answer;

    public int getQueNo() {
        return queNo;
    }

    public void setQueNo(int queNo) {
        this.queNo = queNo;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
class Course{
    int courseId,fee;
    String courseName;
    float duration;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
class Distance{
    int km,m,cm;
    void setDistance(int km,int m,int cm){
        this.km=km;
        this.m=m;
        this.cm=cm;
    }
    void displayDistance(){
        System.out.println(km+" km "+m+" m "+cm+" cm");
    }
    Distance addDistance(Distance d){
        Distance temp=new Distance();
        temp.cm=cm+d.cm;
        temp.m=temp.cm/100+m+d.m;
        temp.cm=temp.cm%100;
        temp.km=temp.m/1000+km+d.km;
        temp.m=temp.m%1000;
        return temp;
    }
}
class Circle{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    float areaOfCircle(){
        return 3.14f*radius*radius;
    }
    float circumferenceOfCircle(){
        return 2*3.14f*radius;
    }
}
class Book{
    int bookId;
    String title,author;
    float price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

