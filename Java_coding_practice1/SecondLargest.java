

class SecondLargest{
	public static void main(String[] args){
		 int[] arr ={5,7,8,6,11,78,45,95};
        int n = findSecondHighest(arr);
        System.out.println(n);
	}
	
	public static int findSecondHighest(int[] a){
		int large= Integer.MIN_VALUE;
		int secondLarge= Integer.MIN_VALUE;
		
		for(int n : a){
			if(n > large){
				secondLarge = large;
				large=n;
			}else if(n > secondLarge){
				secondLarge = n;
			}
		}
		return secondLarge;
		
	}
}