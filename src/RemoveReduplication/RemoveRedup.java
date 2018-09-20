package RemoveReduplication;

import java.util.Arrays;

public class RemoveRedup{

    public static int remove(int[] arr){
        Arrays.sort(arr);
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] != arr[i]) {
                arr[++index] = arr[i];
            }
        }
        System.out.println(index + 1);
        return index+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5, 5, 7, 9, 12, 12, 12, 13};
        int num = remove(arr);
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

