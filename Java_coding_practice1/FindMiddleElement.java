

class FindMiddleElement{
	public static void main(String[] args){
		String s = "Ritwik";
		System.out.println(middle(s));
	}
	
	public static char middle(String s){
		char[] ch= s.toCharArray();
		
		int mid=ch.length/2;
		return ch[mid];
	}
}