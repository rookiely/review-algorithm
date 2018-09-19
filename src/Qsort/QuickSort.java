package Qsort;

public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int patition(int[] arr, int begin, int end) {
        int i = begin-1;
        int temp = arr[end];
        for (int j = begin; j <= end-1; j++) {
            if (arr[j] < temp) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,end,i+1);
        return i+1;
    }

    public static void qsort(int[] arr,int begin,int end) {
        if (begin < end) {
            int pivot = patition(arr, begin, end);
            qsort(arr, begin, pivot - 1);
            qsort(arr, pivot + 1, end);
        }
    }

    public static void main(String[] args) {

    }
}
