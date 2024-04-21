

class AutomorphicNumber{
	public static void main(String[] args){
		int n =65;
		System.out.println(automorphic(n));
	}
	
	public static boolean automorphic(int n){
		int pow = n*n;
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