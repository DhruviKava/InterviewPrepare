import java.util.Scanner;

public class SecondMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Please enter at least two elements.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize variables for second min and second max calculations
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        // Iterate through the array to find the second min and second max
        for (int i = 0; i < arr.length; i++) {
            // Update first and second minimums
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }

            // Update first and second maximums
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Min is:"+min);
        System.out.println("Second minimum element: " + secondMin);
        System.out.println("Max is:"+max);
        System.out.println("Second maximum element: " + secondMax);
    }
}
