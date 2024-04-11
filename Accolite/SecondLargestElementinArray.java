package Accolite;

public class SecondLargestElementinArray {
    public static void main(String[] args) {
        int[] n ={5,7,8,6,11,78,45,95};

        int large= n[0];
        for (int i = 0; i < n.length; i++) {
            for (int j =i+1; j < n.length; j++) {
                if (n[j] > large) {
                    large=n[j];
                }
            }
        }
        int second =n[0];
        for (int i = 0; i < n.length; i++) {
            for (int j = i+1; j < n.length; j++) {
                if (n[j] != large && n[j] > second) {
                    second=n[j];
                }
            }
        }
        System.out.println("Second largest is: "+second);
        
    }
}
