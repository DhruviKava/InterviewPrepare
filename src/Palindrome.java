
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter your String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();

        String reverse = "";
        int length = str.length();
        for ( int i = length - 1; i >= 0; i-- ) {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("String is Palindrome");
        }
        else {
            System.out.println("String is not Palindrome");
        }


        System.out.println("Enter your Number:");
        Scanner s=new Scanner(System.in);
        int no=sc.nextInt();

        int rev = 0,temp=no;

        while (no>0){
            int r=no%10;
            rev=(rev*10)+r;
            no=no/10;
        }
        if(temp==rev){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");

        }
    }
}
