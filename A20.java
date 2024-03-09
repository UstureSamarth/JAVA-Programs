import java.util.Scanner;
public class A20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter how many numbers to store in array:");
        n= sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Given Numbers are ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max=arr[0];
        int min=arr[0];
        int sum=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Greater Number is :"+max);
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Smaller Number is :"+min);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Numbers is :"+sum);
        System.out.println("Average of numbers is :"+sum/ (float)arr.length);
    }
}
