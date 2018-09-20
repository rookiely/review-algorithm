package binarySearch;

public class BinarySearch {

//    public static int binarySearch(int[] arr, int key) {
//        int mid;
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            mid = (end - start) / 2 + start;
//            if (key < arr[mid]) {
//                end = mid - 1;
//            } else if (key > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }

    public static int binarySearch(int[] arr, int key, int begin, int end) {
        if (begin <= end) {
            int mid = (end-begin)/2+begin;
            if (key < arr[mid]) {
                return binarySearch(arr, key, begin, mid - 1);
            } else if (key > arr[mid]) {
                return binarySearch(arr, key, mid + 1, end);
            } else {
                return mid;
            }
        }else{
            return -1;
        }
    }
}
