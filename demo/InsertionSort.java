package demo;

public class InsertionSort {
    public static void main(String[] args) {
        int[] n = {5,4,1,7,3};
        insertationSort(n);
        for (int i : n) {
            System.out.print(i);
        }
    }

    private static void insertationSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            int ele = n[i];
            int j = i-1;
            while (j>=0 && n[j] > ele) {
                n[j+1] = n[j];
                j--;
            }
            n[j+1] = ele;
        }
    }
    
}
