package org.example.liner;

public class Liner {
    public static void main(String[] args) {
        Liner liner = new Liner();
        System.out.println(liner.search(new int[]{9, 7, 2, 16, 4},5, 16));
    }

    public int search(int arr[], int n, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i+1;
        }
        return -1;
    }
}
