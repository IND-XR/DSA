
public class sds{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] orderIds = new int[50];

        // Input 50 order IDs
        for (int i = 0; i < 50; i++) {
            orderIds[i] = sc.nextInt();
        }

        // Bubble Sort - Ascending Order
        for (int i = 0; i < 49; i++) {
            for (int j = 0; j < 49 - i; j++) {

                if (orderIds[j] > orderIds[j + 1]) {
                    int temp = orderIds[j];
                    orderIds[j] = orderIds[j + 1];
                    orderIds[j + 1] = temp;
                }
            }
        }

        // Print sorted order IDs
        for (int i = 0; i < 50; i++) {
            System.out.print(orderIds[i] + " ");
        }

        sc.close();
    }
}


import java.util.Scanner;

public class Looop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] orderIds = new int[50];

        // Input 50 order IDs
        for (int i = 0; i < 50; i++) {
            orderIds[i] = sc.nextInt();
        }

        // Bubble Sort - Ascending Order
        for (int i = 0; i < 49; i++) {
            for (int j = 0; j < 49 - i; j++) {

                if (orderIds[j] > orderIds[j + 1]) {
                    int temp = orderIds[j];
                    orderIds[j] = orderIds[j + 1];
                    orderIds[j + 1] = temp;
                }
            }
        }

        // Print sorted order IDs
        for (int i = 0; i < 50; i++) {
            System.out.print(orderIds[i] + " ");
        }

        sc.close();
    }
}




import java.util.Scanner;

public class OrderSorting {

    // Merge two sorted parts
    static void merge(int[] orderId, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = orderId[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = orderId[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                orderId[k] = L[i];
                i++;
            } else {
                orderId[k] = R[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of L[]
        while (i < n1) {
            orderId[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[]
        while (j < n2) {
            orderId[k] = R[j];
            j++;
            k++;
        }
    }

    // Merge Sort
    static void mergeSort(int[] orderId, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            // Divide
            mergeSort(orderId, left, mid);
            mergeSort(orderId, mid + 1, right);

            // Merge
            merge(orderId, left, mid, right);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] orderId = new int[50];

        // Input 50 order IDs
        System.out.println("Enter 50 Customer Order IDs:");

        for (int i = 0; i < 50; i++) {
            orderId[i] = sc.nextInt();
        }

        // Apply Merge Sort
        mergeSort(orderId, 0, 49);

        // Display sorted order IDs
        System.out.println("\nOrder IDs in Ascending Order:");

        for (int i = 0; i < 50; i++) {
            System.out.print(orderId[i] + " ");
        }

        sc.close();
    }
}



public class MergeSort {

    static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];

        while (i <= mid && j <= right) {

            if (arr[i] < arr[j])
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while (i <= mid)
            temp[k++] = arr[i++];

        while (j <= right)
            temp[k++] = arr[j++];

        for (i = left, k = 0; i <= right; i++, k++)
            arr[i] = temp[k];
    }

    public static void main(String[] args) {

        int[] arr = {50, 20, 80, 10, 40};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int x : arr)
            System.out.print(x + " ");
    }
}