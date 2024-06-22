import java.util.Scanner;

public class reverseString {
    public static String reverseWord(String input) {
        String[] words = input.split(" ");
        String reversed = "";

        for (String word : words) {
            String temp = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                temp =temp+ word.charAt(i);
            }
            reversed =reversed+ temp + " ";
        }

        return reversed.trim();
    }
    public static void main(String[] args) {
        System.out.println("Enter your String:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev=reverseWord(str);
        System.out.println("Reversed words: " + rev);
        sc.close();
    }

}


