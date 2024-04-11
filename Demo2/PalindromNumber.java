package Demo2;

public class PalindromNumber {
    public static void main(String[] args) {
        int n =122;
        System.out.println((isPlaindrom(n)?"Palindrom":"Not Palinfrom"));
    }

    public static boolean isPlaindrom(int n){
        int k =n;
        int rev =0;
        while (n !=0) {
            rev = rev*10+(n%10);
            n = n/10;
        }
        return (rev == k);
    }
}
