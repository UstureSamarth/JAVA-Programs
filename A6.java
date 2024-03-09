public class A6 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i>=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>=6-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=6-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i<=j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            int k=1;
            for(int j=1;j<=5;j++){
                if(i>=j)
                    System.out.print(k++);
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            int k=i;
            for(int j=1;j<=4;j++){
                if(i>=j)
                    System.out.print(k--);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            char a='A';
            for(int j=1;j<=5;j++){
                if(i<=j)
                    System.out.print(a++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        int n=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i>=j)
                    System.out.print(n++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        char a='A';
        for(int i=1;i<=5;i++){
            char k=a;
            for(int j=1;j<=5;j++){
                if(i<=j)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            a++;
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j==1 || j==5 || i==1 || i==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
