import java.util.Scanner;

public class PrimeNumber {
    public static void Prime(int n){
        int f=0;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else {
        for (int i=2;i<n/2;i++) {
            if (n % i == 0) {
                f = 1;
                System.out.print("Not Prime");
                break;
            }
        }
            if(f==0){
                System.out.print("Prime");
            }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        int n=sc.nextInt();

        System.out.println("Your number is:");
        Prime(n);
    }
}
