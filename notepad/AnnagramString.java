
class AnnagramString{
	public static void main(String[] args){
		String s1 = "Mother n Law";
		String s2 = "Hitler Woman";
		
		System.out.println((isAnnagram(s1,s2)?"Annagram":"Not Annagram"));
	}
	
	public static boolean isAnnagram(String a, String b){
		a=removeSpace(a);
		b= removeSpace(b);
		if(a.length() != b.length()){
			return false;
		}else{
			a=lowerCase(a);
			b=lowerCase(b);
			a=sort(a);
			b=sort(b);
			for(int i=0;i<a.length();i++){
				if(a.charAt(i) != b.charAt(i)){
					return false;
				}
			}
		}
		return true;
	}
	
	public static String lowerCase(String s){
		String str="";
		char[] ch = s.toCharArray();
		for(int i=0;i< ch.length;i++){
			if(ch[i]>='A' && ch[i] <='Z'){
				str=str+(char)(ch[i]+32);
			}else{
				str=str+ch[i];
			}
		}
		return str;
	}
	
	public static String removeSpace(String s){
		char[] ch = s.toCharArray();
		String str ="";
		for(int i=0;i<ch.length;i++){
			if(ch[i] != ' '){
				str= str+ch[i];
			}
		}
		return str;
	}
	public static String sort(String s){
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i] > ch[j]){
					char t=ch[i];
					ch[i]=ch[j];
					ch[j] =t;
				}
			}
		}
		return new String(ch);
	}
}