package Demo2;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, -1, -2, 4};
        selectionSort(array);
    for(int n:array){
        System.out.print(n+" ");
    }
    }
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min] >arr[j]) {
                    min=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
    }
}
