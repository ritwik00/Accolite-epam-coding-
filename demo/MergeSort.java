package demo;

public class MergeSort {
    public static void main(String[] args) {
        int[] n = {5,4,1,7,3};
        mergeSort(n);
        for (int i : n) {
            System.out.print(i);
        }
    }

    private static void mergeSort(int[] n) {
        mergeSort(n,0,n.length-1);
    }

    private static void mergeSort(int[] n, int i, int j) {
       if (i < j) {
        int mid = (i+j)/2;
        mergeSort(n, i, mid);//for left part
        mergeSort(n, mid+1, j);//for right part
        merge(n,i,mid,j);//for merging array
       }
    }

    private static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // sorting logic
                arr[k++] = L[i++];
            }
            else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
