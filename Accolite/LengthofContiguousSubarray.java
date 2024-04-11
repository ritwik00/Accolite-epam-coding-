package Accolite;

public class LengthofContiguousSubarray {
    public static void main(String args[])
{
    int N = 9;
    int arr[] = {5,6,3,5,7,8,9,1,2};
 
    System.out.println(maxiConsecutiveSubarray(arr, N));
}

    private static int maxiConsecutiveSubarray(int[] arr, int n) {
      int m = 0;

      for (int i = 0; i < n; i++) {
        int count=1,j;
        for (j = i+1; j < n; j++) {
            if (arr[j] > arr[j-1]) {
                count++;
                m = Math.max(m, count);
                
            }else{
                count=1;
                i=j;
            }
               
        }
      }
      return m;
    }
}
