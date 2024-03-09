import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        A22 a=new A22();
        String s=sc.nextLine();
       // a.countVowels(sc.nextLine());
       // a.reverseString(s);
        //System.out.print("Enter Pattern :");
       // String p=sc.nextLine();
       // countOccuranceofgivenpattern(s,p);
       // palindrome(s);
        countWords(s);
    }
    void countVowels(String s){
        int count=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')count++;
        System.out.println("Number of Vowels in given String are :"+count);
    }
    void reverseString(String s){

        char t[]=s.toCharArray();
        int n=s.length();
        for(int i=0;i<n/2;i++){
           char temp=t[i];
           t[i]=t[n-i-1];
           t[n-i-1]=temp;
        }
        s=s.valueOf(t);
        System.out.println("Reversed String is "+s);
    }
    static void countOccuranceofgivenpattern(String gs,String p){
        int count=0;
        int gsSize=gs.length();
        int pSize=p.length();
        int i,j;
        for(i=0;i<=gsSize-pSize;i++){
            for(j=0;j<pSize;j++){
                if(gs.charAt(i+j)!=p.charAt(j))
                    break;
            }
            if(j==pSize)
            {
                count++;
                j=0;
            }
        }
        System.out.println("Occurance of given pattern is "+count);
    }
   static void palindrome(String s){
        int size=s.length()-1;
        int i=0;
        while(s.charAt(i) == s.charAt(size) && i!=size) {
            System.out.println(s.charAt(i)+" "+s.charAt(size));
            i++;
            size--;
        }
        if(s.charAt(i)==s.charAt(size))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
   }
   static void countWords(String s){
        s=s.trim();
        int size=s.length();
        int count=0;
        for(int i=0;i<size;i++)
            if(s.charAt(i)==' ') {
                while (s.charAt(i+1)==' ')
                    i++;
                count++;
            }
       System.out.println("Number of words in given string is "+(count+1));
   }
}


