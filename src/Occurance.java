import java.util.Scanner;

public class Occurance {
//    public static  int DigitCount(int n,int c){
//        int count=0;
//        while (n>0){
//            int lastdig=n%10;
//            if(lastdig==c){
//                count++;
//            }
//            n=n/10;
//        }
//        return count;
//    }

    public static int StrCount(String str,char c){
        int countstr=0;
        String temp=str.toLowerCase();
        for(int i=0;i<temp.length();i++){
            if(temp.charAt(i)==c){
                countstr++;
            }
        }
       return countstr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number series:");
//        int no=sc.nextInt();
//
//        System.out.println("Enter digit :");
//        int digit=sc.nextInt();
//
//        int count=DigitCount(no,digit);
//         System.out.println(digit+" : "+count );

         //------------------------------------
        System.out.println("Enter String series:");
        String str=sc.nextLine();

        System.out.println("Enter character :");
        char ch=sc.next().charAt(0);

        int countstr=StrCount(str,ch);
        System.out.println(ch+" : "+countstr );
    }
}
