import java.util.Scanner;
public class practice {
    public static int Fact(int n){
        if(n==0)
        {
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int f=n*Fact(n-1);
            return f;
        }
    }
    public static void Fibo(int n)
    {
        int a=0,b=1,c=0;
        System.out.print(a+","+b+",");
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
    public static void Prime(int n)
    {
        int f=0;
        for(int i=2;i<n/2;i++){
            if(n%i ==0)
            {
                f=1;
                System.out.println("Not prime");
                break;
            }
        }
        if(f==0)
        {System.out.println("Prime no");}

    }

    public static int reverseno(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
    public static String reverseword(String input){
        String[] words=input.split(" ");
        String reverse="";

        for(String word:words){
            String temp="";
            for(int i=word.length()-1;i>=0;i--){
                temp=temp+word.charAt(i);
            }
            reverse=reverse+temp+" ";
        }
        return reverse.trim();
    }
    public static String reversestr(String input){
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);
        }

        return reverse.trim();
    }

    public static int Digitcount(int no, int d) {
        int count = 0;

        while (no > 0) {
            int ldigit = no % 10;
            if (ldigit == d) {
                count++;
            }
            no = no / 10;
        }

        return count;
    }

    public static int Strcount(String str,char c){
        int count=0;
        String temp=str.toLowerCase();
        for(int i=0; i<temp.length();i++){
            if(temp.charAt(i)==c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //-----Factorial
        /*Scanner sc =new Scanner(System.in);
		System.out.println("Enter number:");
        int n = sc.nextInt();
        int f=Fact(n);
		System.out.println("Factorial is:"+f);*/

        //-----------Fibonacci
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter number:");
        int n = sc.nextInt();
		System.out.println("Fibonacci series:");
		Fibo(n);*/

        //-----Prime
        /*Scanner sc =new Scanner(System.in);
		System.out.println("Enter number:");
        int n = sc.nextInt();
		System.out.println("Your number is prime/Not?");
        Prime(n);*/

        //-----Palindrome digit and string
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n = sc.nextInt();

		int rev=0,temp=n;

		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}

		if(temp==rev){
			System.out.println("Palindrome Number");
		}
		else{	System.out.println("Not Palindrome");}

		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=s.nextLine().toLowerCase();

		String reverse="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("Palindrome String");
		}
		else{	System.out.println("Not Palindrome");}*/

        //-----Armstrong number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int no = 0, power, result, rem;
        int originalno = n;

        // Calculate the number of digits in the input number
        while (originalno != 0) {
            originalno = originalno / 10;
            ++no;
        }

        originalno = n;
        result = 0;

        // Calculate the sum of each digit raised to the power of the number of digits
        while (originalno != 0) {
            rem = originalno % 10;
            power = 1;
            for (int i = 1; i <= no; i++) {
                power = power * rem;
            }
            result = result + power;
            originalno = originalno / 10;
        }

        // Check if the result is equal to the original number
        if (result == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }

        //-----Revere number
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int rev=reverseno(n);
		System.out.println("Reverse number is:"+rev);*/

        //-----Reverse word
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str=sc.nextLine();
		String rev=reverseword(str);
		System.out.println("Reverse word is:"+rev);*/

        //-----Reverse String
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str=sc.nextLine();
		String rev=reversestr(str);
		System.out.println("Reverse String is:"+rev);*/

        //-----Min-Max second
		/*int a[]=new int[10];
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		n=sc.nextInt();

		System.out.println("Enter Value:");
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}

		int min=a[0], secondmin=Integer.MAX_VALUE;
		int max=a[0], secondmax=Integer.MIN_VALUE;

		for(i=1;i<n;i++){
			if(a[i]<min){
				secondmin=min;
				min=a[i];
			}
			else if(a[i]<secondmin && a[i]!=min){
				secondmin=a[i];
			}

			if(a[i]>max){
				secondmax=max;
				max=a[i];
			}
			else if(a[i] > secondmax && a[i]!=max){
				secondmax=a[i];
			}
		}

		System.out.println("Min is:"+min+" SecondMin is:"+secondmin+" Max is:"+max+" SecondMax is:"+secondmax);*/

        //-----Number of digit occurance
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int n= sc.nextInt();
		System.out.println("Enter digit to count:");
		int d=sc.nextInt();
		int count=Digitcount(n,d);
		System.out.println(d+" is:"+count+" times");*/

        //-----Number of Char occurance
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter string:");
		String str= sc.nextLine();
		System.out.println("Enter char to count:");
		char c=sc.next().charAt(0);
		int count=Strcount(str,c);
		System.out.println(c+" is:"+count+" times");*/

    }
}
