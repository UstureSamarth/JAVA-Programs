import java.util.Scanner;
public class A12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter N to print N natural numbers:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Enter N to print N natural numbers in in reverse order:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print((n+1)-i+" ");
        }
        System.out.println();
        System.out.print("Enter N to print N odd natural numbers:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(2*i-1+" ");
        }
        System.out.println();
        System.out.print("Enter N to print N odd natural numbers in reverse order:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(2*n-(2*i-1)+" ");
        }
        System.out.println();
        System.out.print("Enter N to print N even natural numbers:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(2*i+" ");
        }
        System.out.println();
        System.out.print("Enter N to print N even natural numbers in reverse order:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print((n*2+2)-2*i+" ");
        }
        System.out.println();
        System.out.print("Enter N to print Square of N natural numbers:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i*i+" ");
        }
        System.out.println();
        System.out.print("Enter N to print cubes of N natural numbers:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i*i*i+" ");
        }
        System.out.println();
        System.out.print("Enter N whose table to print:");
        n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.print(n*i+" ");
        }
        System.out.println();

    }
}
