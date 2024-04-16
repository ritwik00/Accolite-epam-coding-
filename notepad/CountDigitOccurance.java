import java.util.Scanner;
class CountDigitOccurance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		System.out.println("Enter the digit you want to find occourance");
		int n = sc.nextInt();
		System.out.println(count(number,n));
		
	}
	
	public static int count(int n, int d){
		int count=0;
		while(n!=0){
			int temp = n%10;
			if(temp == d){
				count++;
			}
			n=n/10;
		}
		return count;
	}
}