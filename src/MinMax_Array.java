//import java.util.Scanner;
//
//public class MinMax_Array {
//    public static int[] Sort(int[] a){
//        int temp;
//        for(int i = 0; i < a.length - 1; i++){
//            for (int j=i+1;j<a.length;j++){
//                if(a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        return a;
//    }
//    public static void main(String[] args) {
//        int a[]=new int[5];
//        int n,i;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array Size:");
//        n=sc.nextInt();
//
//        System.out.println("Enter array Values:");
//        for (i=0;i<n;i++){
//            a[i]=sc.nextInt();
//        }
//
//        int[] s = Sort(a);
//
////        System.out.println("Sorted Array:");
////        for (int num : s) {
////            System.out.println(num + " ");
////        }
//        System.out.println("\nMin value:"+s[0]);
//        System.out.println("Mix value:"+s[s.length-1]);
//    }
//}

import java.util.Scanner;

public class MinMax_Array {
    public static void main(String[] args) {
        int a[] = new int[10];
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        n = sc.nextInt();

        System.out.println("Enter array Values:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];

        for (i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Minimum Value: " + min);
        System.out.println("Maximum Value: " + max);
    }
}

