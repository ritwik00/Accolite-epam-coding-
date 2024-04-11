package demo;

public class SelectionSort {
    public static void main(String[] args) {
        int[] n = {5,4,1,7,3};
        selectionSort(n);
        for (int i : n) {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] n) {
       for (int i = 0; i < n.length; i++) {
        int min =i;
        for (int j = i+1; j < n.length; j++) {
            if (n[min] > n[j]) {
                min = j;
            }
        }
        int t = n[i];
        n[i] = n[min];
        n[min] = t;
       }
    }
}
