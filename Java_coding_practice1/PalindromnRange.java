public class PalindromnRange {
    public static void main(String[] args) {
        int s=100,e=200;
        for (int i = s; i < e; i++) {
            if(palondrom(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean palondrom(int n){
        int rev=0;
        int v=n;
        while (n != 0) {
            int t =n%10;
            rev = rev*10+t;
            n=n/10;
        }
        // System.out.println(rev);
        return v==rev;
    }
}
