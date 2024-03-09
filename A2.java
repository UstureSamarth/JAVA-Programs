public class A2 {
    public static void main(String[] args) {
        int a=125,b=512,temp;
        System.out.println(a%10);
        System.out.println(a/10);
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+" b="+b);
        System.out.println(35&83);
        System.out.println(47|29);
        System.out.println(76^108);
        int c=123;
        System.out.println(c%10+""+c/10);
    }
}
