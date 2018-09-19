package Qsort;

import java.util.Scanner;

public class Qsort {

    private static int[] arr = new int[100];

    public void exchange(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int patition(int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j <= r - 1; j++) {
            if (arr[j] < x) {
                i += 1;
                exchange(i, j);
            }
        }
        exchange(i + 1, r);
        return i+1;
    }

    public void quickSort(int p,int r){
        if(p <r){
            int q = patition(p,r);
            quickSort(p,q-1);
            quickSort(q+1,r);
        }
    }

    public static void main(String[] args) {
        Qsort q = new Qsort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        q.quickSort(0,n-1);
        for (int ele :
                arr) {
            System.out.print(ele + " ");
        }
    }
}
