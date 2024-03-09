import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class A11 {
    public static void main(String[] args) {
        LocalDateTime L=LocalDateTime.now();
        System.out.println(L);
        DateTimeFormatter d=DateTimeFormatter.ofPattern("d/M/y");
        System.out.println(d.format(L));
        d=DateTimeFormatter.ofPattern("h:m:s");
        System.out.println(d.format(L));
        System.out.println((int)(Math.random()*100+100));
        int a=1,b=-3,c=-10;
        double x=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        double y=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println(x+" "+y);

    }
}
