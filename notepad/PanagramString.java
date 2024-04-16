
class PanagramString{
	public static void main(String[] args){
		String s = "Malayalam";
		System.out.println((isPanagram(s))?"Pannagram":"Not Pannagram");
	}
	public static boolean isPanagram(String s){
		s=lowercase(s);
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length/2;i++){
			if(ch[i] != ch[ch.length-i-1]){
				return false;
			}
		}
		return true;
	}
	
	public static String lowercase(String s){
		String str="";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A' && ch[i] <='Z'){
				str=str+(char)(ch[i]+32);
			}
			else{
				str=str+ch[i];
			}
		}
		return str;
	}
}