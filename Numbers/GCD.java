package Numbers;

public class GCD {
    public static void main(String[] args) {
        int n1 = 15,n2=75;
        int gcd = gcd(n1,n2);
        System.out.println(gcd);
    }

    private static int gcd(int a, int b){
        if(a<b) return gcd(b,a);
        if(b ==0) return a;
        return gcd(b,a%b);
    }
}
