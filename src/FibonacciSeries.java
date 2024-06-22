import java.util.Scanner;

public class FibonacciSeries {
    public static void Fibo(int n){
        int a=0,b=1,c=0;
        System.out.print(a+ " "+b+" ");
        for (int i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
//        int f=Fibo(n);
        System.out.println("Fibonacci series is:");
        Fibo(n);
    }
}
