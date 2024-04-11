package Accolite;

 
class GFG 
{
     
    // Function to return the maximum length of 
    // strictly increasing subarray after 
    // removing atmost one element 
    static int maxIncSubarr(int a[], int n) 
    { 
        // Create two arrays pre and pos 
        int pre[] = new int[n] ; 
        int pos[] = new int[n] ; 
        pre[0] = 1; 
        pos[n - 1] = 1; 
        int l = 0; 
     
        // Find out the contribution of the current 
        // element in array[0, i] and update pre[i] 
        for (int i = 1; i < n; i++)
        { 
            if (a[i] > a[i - 1]) 
                pre[i] = pre[i - 1] + 1; 
            else
                pre[i] = 1; 
        } 
     
        // Find out the contribution of the current 
        // element in array[N - 1, i] and update pos[i] 
        l = 1; 
        for (int i = n - 2; i >= 0; i--)
        { 
            if (a[i] < a[i + 1]) 
                pos[i] = pos[i + 1] + 1; 
            else
                pos[i] = 1; 
        } 
     
        // Calculate the maximum length of the 
        // strictly increasing subarray without 
        // removing any element 
        int ans = 0; 
        l = 1; 
        for (int i = 1; i < n; i++)
        { 
            if (a[i] > a[i - 1]) 
                l++; 
            else
                l = 1; 
            ans = Math.max(ans, l); 
        } 
     
        // Calculate the maximum length of the 
        // strictly increasing subarray after 
        // removing the current element 
        for (int i = 1; i <= n - 2; i++) 
        { 
            if (a[i - 1] < a[i + 1]) 
                ans = Math.max(pre[i - 1] + 
                                pos[i + 1], ans); 
        } 
        return ans; 
    } 
     
    // Driver code 
    public static void main (String[] args)
    { 
        int arr[] = {1, 2,5,3,4}; 
        int n = arr.length; 
     
        System.out.println(maxIncSubarr(arr, n)); 
    } 
}
 