public class frist {
    
}
import java.util.Scanner;

public class Main {

    // Merge two sorted parts
    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy left part
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        // Copy right part
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Merge in ascending order
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }

            k++;
        }

        // Remaining elements of left array
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Remaining elements of right array
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Merge Sort
    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Divide left half
            mergeSort(arr, left, mid);

            // Divide right half
            mergeSort(arr, mid + 1, right);

            // Merge both sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] orderIds = new int[50];

        System.out.println("Enter 50 Customer Order IDs:");

        for (int i = 0; i < 50; i++) {
            orderIds[i] = sc.nextInt();
        }

        // Apply Merge Sort
        mergeSort(orderIds, 0, 49);

        System.out.println("Customer Order IDs in Ascending Order:");

        for (int i = 0; i < 50; i++) {
            System.out.print(orderIds[i] + " ");
        }

        sc.close();
    }
}