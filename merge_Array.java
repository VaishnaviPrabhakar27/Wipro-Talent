import java.util.Arrays;
import java.util.Scanner;

public class merge_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and elements for first array
        int n1 = 0;
        while (true) {
            System.out.print("Enter size of first array: ");
            if (sc.hasNextInt()) {
                n1 = sc.nextInt();
                if (n1 > 0) break;
                else System.out.println("Size must be positive.");
            } else {
                System.out.println("Please enter a valid integer.");
                sc.next();
            }
        }
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                sc.next();
            }
            arr1[i] = sc.nextInt();
        }

        // Input size and elements for second array
        int n2 = 0;
        while (true) {
            System.out.print("Enter size of second array: ");
            if (sc.hasNextInt()) {
                n2 = sc.nextInt();
                if (n2 > 0) break;
                else System.out.println("Size must be positive.");
            } else {
                System.out.println("Please enter a valid integer.");
                sc.next();
            }
        }
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                sc.next();
            }
            arr2[i] = sc.nextInt();
        }

        // Merge and sort arrays
        int[] merged = new int[n1 + n2];
        System.arraycopy(arr1, 0, merged, 0, n1);
        System.arraycopy(arr2, 0, merged, n1, n2);

        Arrays.sort(merged);

        System.out.println("Merged and sorted array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}