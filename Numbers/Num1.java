package Numbers;

public class Num1 {
    public static void main(String[] args) {
        int n = 25;
        System.out.println((ifDisplay(n))?"Yes":"No");
    }

    private static boolean ifDisplay(int n) {
       int pow=1;
       int p=2;
       // for calculate the power
       while(p!=0){
        pow = pow*n;
            p--;
       }
      while(n>0 && pow>0){
        if (n%10 != pow%10) {
            return false;
          }
          n=n/10;
          pow=pow/10;
      }
      return true;  
    }
}
