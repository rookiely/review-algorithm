package FindTopK;

import java.util.Scanner;

public class TopK {

    /**
     *  首先用快排实现
     */
    /*public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int pivot = patition(arr, begin, end);
            quickSort(arr, begin, pivot-1);
            quickSort(arr, pivot + 1, end);
        }
    }

    public static void exchange(int[] arr, int i, int j) {
        int tem = arr[i];
        arr[i] = arr[j];
        arr[j] = tem;
    }

    public static int patition(int[] arr, int begin, int end) {
        int temp = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j] < temp) {
                i++;
                exchange(arr, i, j);
            }
        }
        exchange(arr, i + 1, end);
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, num - 1);
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k = 3;
        System.out.print(arr[k-1]);
    }*/


    /**
     * 虽然我们不会采用快速排序的算法来实现TOP-K问题，但我们可以利用快速排序的思想，
     * 在数组中随机找一个元素key，将数组分成两部分Sa和Sb，其中Sa的元素>=key，Sb的元素<key，然后分析两种情况：
     * 若Sa中元素的个数大于或等于k，则在Sa中查找最大的k个数
     * 若Sa中元素的个数小于k，其个数为len，则在Sb中查找k-len个数字
     * 如此递归下去，不断把问题分解为更小的问题，直到求出结果。
     * 该算法的平均时间复杂度为O(N * logk)
     */

}
