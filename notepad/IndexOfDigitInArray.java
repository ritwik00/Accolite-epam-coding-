import java.util.*;
class IndexOfDigitInArray{
	public static void main(String[] args){
		int[] n ={4,8,5,6,4,7,8,1};
		int digit = 8;
		List<Integer> s= search(n,digit);
		for(Integer p : s){
			System.out.print(p+" ");
		}
	}
	
	public static List<Integer> search(int[] a, int d){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i< a.length;i++){
			if(a[i] == d){
				list.add(i);
			}
		}
		return list;
	}
}