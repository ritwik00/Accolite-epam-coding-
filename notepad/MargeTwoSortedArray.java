import java.util.*;
class MargeTwoSortedArray{
	public static void main(String[] args){
		int[] a = new int[] {7, -5, 3, 8, -4, 11, -19, 21};
        int[] b = new int[] {6, 13, -7, 0, 11, -4, 3, -5};
		
		int[] merge = mergeArray(a,b);
		for(int n : merge){
			System.out.println(n);
		}
	}
	
	public static int[] mergeArray(int[] a, int[] b){
		Set<Integer> set = new TreeSet<Integer>();
		int i=0,j=0,k=0;
		//copying all the array element in HashSet , because HashSet doesnot accepts duplicate values.
		while(i<a.length){
			set.add(a[i++]);
		}
		while(j<b.length){
			set.add(b[j++]);
		}
		
		// copying all the set value to the new array.
		int[] newArray= new int[set.size()];
		for(int n : set){
			newArray[k++] = n;
		}
		//sort the array
		// Arrays.sort(newArray);
		//return the newArray
		return newArray;
	}
}