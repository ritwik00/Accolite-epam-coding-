public class ReverseNumber {
    public static void main(String[] args) {
        int n =757423;
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int rev =0;
        while(n != 0){
            int t = n%10;
            rev = rev*10+ t;
            n=n/10;
        }
        return rev;
    }
}
