
class SumArrayElementUsingAbastraction extends Sum{
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		SumArrayElementUsingAbastraction sb = new SumArrayElementUsingAbastraction();
		int n = sb.sumEven(array);
		System.out.println(n);
	}
}

interface EvenSum{
	int sumEven(int[] a);
}


abstract class Sum implements EvenSum{
	public int sumEven(int[] a){
		int sum=0;
		for(int n : a){
			if(n%2 == 0){
				sum += n;
			}
		}
		return sum;
	}
}
