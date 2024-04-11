package demo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] n = {5,4,1,7,3};
        bubbleSort(n);
        for (int i : n) {
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    int t = n[i];
                    n[i] = n[j];
                    n[j]=t;
                }
            }
        }
    }
}
