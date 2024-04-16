

class CountDigitInNumber{
	public static void main(String[] args){
		int number = 784512451;
		System.out.println(countDigit(number));
	}
	
	public static int countDigit(int n){
		int count=0;
		while(n != 0){
			count++;
			n=n/10;
		}
		return count;
	}
}