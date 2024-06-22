import java.util.Scanner;

public class reverseDigit {
    public static int reverseno(int n) {
        int rev=0;
       while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
       }
       return rev;
    }
    public static void main(String[] args) {
        System.out.println("Enter your Number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=reverseno(n);
        System.out.println("Reversed words: " + rev);
        sc.close();
    }
}
