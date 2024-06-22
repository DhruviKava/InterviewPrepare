import java.util.Scanner;

public class Factorial {
    public static int findF(int n){
        if(n==0){
            return 0;
        }
        else if (n==1){
            return 1;
        }
        else {
            int f=n*findF(n-1);
            return f;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int f=findF(n);
        System.out.println("Factorial is:"+f);

    }
}
