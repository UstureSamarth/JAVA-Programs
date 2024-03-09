public class A4 {
    public static void main(String[] args) {
        int x=25;
        if(x%5==0)
            System.out.println("Divisible by 5");
        else
            System.out.println("Not Divisible by 5");
        if(x%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        if((x^1)==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        int y=-25;
        if(x>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
        if(x>y)
            System.out.println("Greater number is x="+x);
        else
            System.out.println("Greater number is y="+y);
        if(y>0)
            System.out.println("Positive");
        else if(y==0)
            System.out.println("Zero");
        else
            System.out.println("Negative");
        int z=152;
        if(x>y){
            if(x>z)
                System.out.println("Greater number is X="+x);
            else
                System.out.println("Greater number is Z="+z);
        }
        else{
            if(y>z)
                System.out.println("Greater number is Y="+y);
            else
                System.out.println("Greater number is Z="+z);
        }
        char a='0';
        if(a>='A' && a<='Z' || a>='a' && a<='z')
            System.out.println("Alphabet");
        else if(a>='0' && a<='9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
        z=1548;
        if(z>99 && z<1000)
            System.out.println("Three Digit Number");
        else
            System.out.println("Not Three Digit Number");
        if(z%5==0 && z%7==0)
            System.out.println("Divisible by 5 and 7");
        else if(z%5==0 )
            System.out.println("Divisible by 5");
        else if(z%7==0)
            System.out.println("Divisible by 7");
        else
            System.out.println("Not divisible by 5 or 7");
    }
}
