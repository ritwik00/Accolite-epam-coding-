

class MaxMin{
	public static void main(String[] args){
		int  n =756385;
		find(n);
	}
	
	public static void find(int n){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int v=n;
		
		while(n != 0){
			if(n%10 > max){
				max=n%10;
			}
			if(v%10 < min){
				min=v%10;
			}
			v=v/10;
			n=n/10;
			
		}

		// int max = Integer.MIN_VALUE;
		// int min = Integer.MAX_VALUE;
		
		// while(n != 0){
		// 	int digit = n%10;
		// 	if(digit > max){
		// 		max=digit;
		// 	}
		// 	if(digit < min){
		// 		min=digit;
		// 	}
		// 	n=n/10;
			
		// }
		
		System.out.println(max);
		System.out.println(min);
	}
}