package Numbers;

/**
 * PalindromNumber
 */
public class PalindromNumber {

    public static void main(String[] args) {
        int n = 121;

        if (isPalindrom(n)) {
            System.out.println("Palindrom number");
        } else {
            System.out.println("Not Palindrom Number");
        }
    }

    private static boolean isPalindrom(int n){
        int rev = 0;
        int t = n;
        while (n != 0) {
            rev = rev*10+(n%10);
            n = n/10;
        }
        return (rev == t);
    }
}