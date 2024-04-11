package Demo2;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int f= fact(n);
        System.err.println(f);
    }

    public static int fact(int n){
        if(n == 1) return 1;
        else
            return n*fact(n-1);
    }
}
