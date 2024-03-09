import java.util.Scanner;
public class A21 {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Numbers:");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter Number whose frequency to find:");
        n= sc.nextInt();
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(n==arr[i])
                count++;
        }
        System.out.println("Frequency of "+n+" is "+count);
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Numbers after sorting:");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0)
                sum+=arr[i];
        }
        System.out.println("Sum of even numbers is:"+sum);*/
        Scanner sc=new Scanner(System.in);
        Employee5 e[]=new Employee5[3];
        for(int i=0;i<e.length;i++){
            e[i]=new Employee5();
        }
        System.out.println("Enter Names:");
        for(int i=0;i<e.length;i++){
            System.out.print(i+1+")Enter name:");
            e[i].setName(sc.nextLine());
        }
        System.out.println("Enter IDs:");
        for(int i=0;i<e.length;i++){
            System.out.print(i+1+")Enter Id:");
            e[i].setId(sc.nextInt());
        }
        System.out.println("Enter Salaries:");
        for(int i=0;i<e.length;i++){
            System.out.print(i+1+")Enter Salary:");
            e[i].setSalary(sc.nextFloat());
        }

        for(int i=0;i<e.length;i++){
            e[i].showEmployee();
        }
        Employee5.sortEmployeeBySalary(e);
        System.out.println("After Sorting Employees according to salary");
        for(int i=0;i<e.length;i++){
            e[i].showEmployee();
        }
        Employee5.sortEmployeeByName(e);
        System.out.println("After Sorting Employees according to name");
        for(int i=0;i<e.length;i++){
            e[i].showEmployee();
        }
    }
}
class Employee5{
    private int id;
    private String name;
    private float salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    void showEmployee(){
        System.out.println(getId()+" "+getName()+" "+getSalary());
    }
    static void sortEmployeeBySalary(Employee5 e[]){
        for(int i=0;i<e.length;i++){
            for (int j=0;j<e.length-1-i;j++){
                if(e[j].getSalary()>e[j+1].getSalary()){
                    Employee5 temp=e[j];
                    e[j]=e[j+1];
                    e[j+1]=temp;
                }
            }
        }
    }
    static void sortEmployeeByName(Employee5 e[]){
        for(int i=0;i<e.length;i++){
            for (int j=0;j<e.length-1-i;j++){
                if(e[j].getName().compareTo(e[j+1].getName()) > 0){
                    Employee5 temp=e[j];
                    e[j]=e[j+1];
                    e[j+1]=temp;
                }
            }
        }
    }
}

