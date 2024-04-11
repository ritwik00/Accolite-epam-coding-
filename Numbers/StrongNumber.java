package Numbers;

public class StrongNumber {
    public static void main(String[] args) {
        for (int i = 1; i < 500; i++) {
            if (isStrong(i) == true) {
                System.out.println(i);
            }
           }

    }

    private static boolean isStrong(int n){
        int sum =0;
        int t=n;
        while(n > 0){
            sum = sum+fact(n%10);
            n = n/10;
        }
        System.out.println(sum);
        return (t==sum);
    }

    private static int fact(int n){
        if(n == 1) return 1;
        return n*fact(n-1);
    }
}
