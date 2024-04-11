package Demo2;

public class Prime {
    public static void main(String[] args) {
        int n =55;
        if(isPrime(n)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n/2; i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
