package org.example.liner;

public class Liner_Search {


    public static int search(int[] arr, int n, int key){
        for (int i = 0; i < n; i++) {
            if (arr[i]==key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr={2,2,3,4,5,1};
        int x = 1;

        int result = search(arr, arr.length, x);

        System.out.println(result);
    }
}
