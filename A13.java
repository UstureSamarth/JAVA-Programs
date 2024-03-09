import java.util.Scanner;
public class A13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int n1,n2;
        System.out.print("Enter Number to check for even or odd :");
        n=sc.nextInt();
        System.out.println(n%2==0?"Even":"Odd");
        System.out.println("Enter three numbers for finding greatest number among three:");
        n=sc.nextInt();
        n1= sc.nextInt();
        n2=sc.nextInt();
        System.out.println((n>n1)? (n>n2)? (n):(n2):(n1>n2)?(n1):(n2));
        System.out.print("Enter number to find digits count :");
        n=sc.nextInt();
        n1=0;
        while(n!=0){
            n/=10;
            n1++;
        }
        System.out.println(n1);
        System.out.print("Enter number to reverse :");
        n=sc.nextInt();
        n1=0;
        while(n!=0){
            n1=n1*10+n%10;
            n/=10;
        }
        System.out.println(n1);
        System.out.print("Enter N to find sum of N natural numbers :");
        n=sc.nextInt();
        n1=0;
        while(n!=0){
            n1+=n;
            n--;
        }
        System.out.println(n1);
        System.out.print("Enter N to find sum of odd N natural numbers :");
        n=sc.nextInt();
        n1=0;
        while(n!=0){
            n1+=(2*n-1);
            n--;
        }
        System.out.println(n1);
        System.out.print("Enter N to find sum of even N natural numbers :");
        n=sc.nextInt();
        n1=0;
        while(n!=0){
            n1+=(2*n);
            n--;
        }
        System.out.println(n1);
        System.out.print("Enter N to find sum of square of N natural numbers :");
        n=sc.nextInt();
        n1=0;
        while(n!=0){
            n1+=(n*n);
            n--;
        }
        System.out.println(n1);
        System.out.print("Enter number to find sum of digits :");
        n=sc.nextInt();
        n1=0;
        while(n!=0){
            n1+=n%10;
            n/=10;
        }
        System.out.println(n1);
        System.out.print("Enter number to find factorial :");
        n=sc.nextInt();
        n1=1;
        while(n!=0){
            n1*=n;
            n--;
        }
        System.out.println(n1);
        }
    }

