import java.util.*;

public class Solution {
    public static int[] MinToMaxHeap(int N, int[] arr){
        // Write your code here
        for (int i = (N - 2) / 2; i >= 0; --i)
            MaxHeapify(arr, i, N);
            return arr;
    }
    public static void MaxHeapify(int arr[], int i, int N)
    {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largest = i;
        if (l < N && arr[l] > arr[i])
            largest = l;
        if (r < N && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            // swap arr[i] and arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(arr, largest, N);
        }
    }
}
