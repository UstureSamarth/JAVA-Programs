public class A8 {
    public static void main(String[] args) {
        Account a=new Account();
        a.setAccountNo("12345");
        a.setCustomerName("Samarth Usture");
        a.setBalance(5000.0f);
        Account.setRateOfInterest(0.95f);
        System.out.println(a.getAccountNo()+" "+a.getCustomerName()+" "+a.getBalance()+" "+a.calculateSimpleIntersest(2));
        SuperCar s1=SuperCar.getCar();
        s1.setOwnerName("Samarth");
        s1.setColour("White");
        s1.setPrice(100.0f);
        System.out.println(s1.getOwnerName()+" "+s1.getColour()+" "+s1.getPrice());
        try{
        SuperCar s2=SuperCar.getCar();
        s2.setOwnerName("Ram");
        s2.setColour("Gold");
        s2.setPrice(1000.0f);
        System.out.println(s2.getOwnerName()+" "+s2.getColour()+" "+s2.getPrice());
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        Video v=new Video();
        v.setVideoId(125);
        v.setTitle("IAmComing");
        v.setViews(15400);
        v.setLikes(1000);
        Video.setTotalVideos(20);
        System.out.println(v.getVideoId()+" "+v.getTitle()+" "+v.getViews()+" "+v.getLikes()+"\nTotal Videos="+Video.getTotalVideos());
        Batch b=new Batch();
        b.setBatchCode(10);
        b.setStartDate("15 June");
        b.setCourseName("MySirG");
        b.setTime("9.00 PM");
        b.setStudentCount(120);
        Batch.setTotalNumberOfBatches(5);
        System.out.println(b.getBatchCode()+" "+b.getStartDate()+" "+b.getCourseName()+" "+b.getTime()+" "+b.getStudentCount()+"\n"+Batch.getTotalNumberOfBatches());
        Box bo=new Box();
        bo.setLength(3);
        bo.setBreadth(4);
        bo.setHeight(5);
        Box.setBoxCount(50);
        System.out.println(bo.getLength()+" "+bo.getBreadth()+" "+bo.getHeight());
        System.out.println("Total Box Count is "+Box.getBoxCount());
    }
}
class Box{
    int length,breadth,height;
    static int boxCount;

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

    public void setHeight(int height) {
        this.height = height;
    }

    public static int getBoxCount() {
        return boxCount;
    }

    public static void setBoxCount(int boxCount) {
        Box.boxCount = boxCount;
    }
}
class Account{
    String accountNo,customerName;
    float balance;
    static float rateOfInterest;

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }
    float calculateSimpleIntersest(int n){
        return balance*n*rateOfInterest/100;
    }
}
class SuperCar{
    String ownerName,colour;
    float price;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    private SuperCar(){};
    private static SuperCar s;
    static SuperCar getCar(){
        if(s==null)
        {
            s=new SuperCar();
            return s;
        }
        return null;
    }
}
class Video{
    int videoId,views,likes;
    String title;
    static int totalVideos;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static int getTotalVideos() {
        return totalVideos;
    }

    public static void setTotalVideos(int totalVideos) {
        Video.totalVideos = totalVideos;
    }
}
class Batch{
    int batchCode,studentCount;
    String courseName,startDate,time;
    static int totalNumberOfBatches;

    public int getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static int getTotalNumberOfBatches() {
        return totalNumberOfBatches;
    }

    public static void setTotalNumberOfBatches(int totalNumberOfBatches) {
        Batch.totalNumberOfBatches = totalNumberOfBatches;
    }
}