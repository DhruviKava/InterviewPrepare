import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
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
    }
}
