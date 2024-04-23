
class AmnstrongNumber{
	public static void main(String[] args){
		 System.out.println((checkArmstrongNumber(153))?true:false);
	}
	
	public static boolean checkArmstrongNumber(int n){
		int countDigit=String.valueOf(n).length();
		int temp=n;
		int sum=0;
		while(n != 0){
			int t = n%10;
			sum = sum + pow(t,countDigit);
			n=n/10;
		}
		return (sum == temp);
	}
	
	public static int pow(int b,int p){
		/*
		if(p == 0){
			return 1;
		}else{
			return b*pow(b,p-1);
		}
		*/
		
		return (p == 0)?1:b*pow(b,p-1);
	}
}