package LeetCode.n;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
 
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 50;
        int result = ob.binarySearch(arr, x);
 
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }

    private int binarySearch(int[] arr, int x) {
        int high = arr.length-1;
        int low = 0;

        while (low < high) {
            int mid = (high+low)/2;
            if(arr[mid] == x) return mid; // if the element found in the mid position
            else if(arr[mid] > x){  //if the element is lesser than the arr[mid] 
                //so it is present at the left part of the array
                high = mid-1;
 
            }else{  // else the arr[mid] is getter than the element then the element must present 
                //in right side of the array, so increase the mid
                low = mid+1;
            }

        }
       return -1;
    }
}
