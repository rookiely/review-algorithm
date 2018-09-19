package HeapSort;

public class HeapSort {

    public static void create(int[] arr) {
        for (int i = arr.length / 2; i >= 0; i--) {
            adjust(arr,arr.length,i);
        }
        for (int i = arr.length - 1; i >= 1; i--) {
            swap(arr, i, 0);
            adjust(arr, i, 0);
        }
    }

    public static void adjust(int[] arr,int length, int index) {
        int leftNode = index*2+1;
        int rightNode = index*2+2;
        int largestNode = index;
        if (leftNode < length && arr[leftNode] > arr[largestNode]) {
            largestNode = leftNode;
        }
        if (rightNode < length && arr[rightNode] > arr[largestNode]) {
            rightNode = rightNode;
        }
        if (largestNode != index) {
            swap(arr,largestNode,index);
            adjust(arr,length,largestNode);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

    }
}

