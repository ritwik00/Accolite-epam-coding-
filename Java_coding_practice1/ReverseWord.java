

class ReverseWord{
	public static void main(String[] args){
		String s = "Hello Java" ;
		System.out.println(reverse(s));
	}
	
	public static String reverse(String s){
		char[] ch = s.toCharArray();
		String str ="";
		
		for(int i=0;i<ch.length;i++){
			int k = i;
			while(i<ch.length && ch[i] != ' '){
				i++;
			}
			int j=i-1;
			while(j >= k){
				str = str+ch[j];
				j--;
			}
			str=str+' ';
		}
		return str;
	}
}