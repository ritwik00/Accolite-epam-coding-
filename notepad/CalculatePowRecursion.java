
class CalculatePowRecursion{
	public static void main(String[] args){
		int base =10;
		int pow = 5;
		
		System.out.println(power(base,pow));
	}
	
	public static int power(int b, int p){
		if(p == 0){
			return 1;
		}else{
			return b*power(b,p-1);
		}
	}
}