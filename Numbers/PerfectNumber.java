package Numbers;

/**
 * PerfectNumber
 */
public class PerfectNumber {

    public static void main(String[] args) {
        int n = 6;
        if(isPerfect(n)){
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }

    }

    public static boolean isPerfect(int n){
        int sum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum += i;
            }
        }
        return (sum == n);
    }
}