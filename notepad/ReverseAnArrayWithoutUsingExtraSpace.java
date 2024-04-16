
class  ReverseAnArrayWithoutUsingExtraSpace{
	public static void main(String[] args){
		int[] arr ={4,5,7,6,9,4,6,5};
		int[] rev = reverseArray(arr);
		for(int n: rev){
			System.out.print(n+" ");
		}
	}
	
	public static int[] reverseArray(int[] a){
		for(int i=0;i<a.length/2;i++){
			int t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i]=t;
		}
		return a;
	}
}