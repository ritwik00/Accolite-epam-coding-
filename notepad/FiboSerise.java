
class FiboSerise{
	public static void main(String[] args){
		int a=0,b=1,c=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<=10;i++){
			c=a+b;
			if(c<=10){
				System.out.print(c+" ");
				a=b;
				b=c;
			}
		}
	}
}