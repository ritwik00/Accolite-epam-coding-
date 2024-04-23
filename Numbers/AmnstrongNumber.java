package Numbers;

public class AmnstrongNumber {
    public static void main(String[] args) {
        int n = 371;
        System.out.println(isAmnstronng(n)?true:false);
    }

    public static boolean isAmnstronng(int n){
        int temp =n;
        int sum =0;
        int c = String.valueOf(n).length();
        while (n != 0) {
            int t = n%10;
            sum = sum+pow(t,c);
            n = n/10;
        }
        return (sum == temp);
    }
    public static int pow(int b, int p){
        return (p == 0)?1:b*pow(b,p-1);
    }
}
