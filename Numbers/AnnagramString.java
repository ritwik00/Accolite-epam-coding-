package Numbers;
public class AnnagramString {
	public static void main(String[] args)
	{
	String s1 ="Mother in Law";
	String s2 = "Hitler Weman";
		if(isAnnagram(s1,s2))
		{
			System.out.println("Annagram String");
		}
		else
			System.out.println("Not a Annagram String");
	}

	public static boolean isAnnagram(String s1, String s2){
		s1=removeSpace(s1);//s1.replaceAll("\\s","")
		s2=removeSpace(s2);
		if(s1.length() != s2.length()){
			return false;
		}else{
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			ch1= sort(ch1);
			ch2 = sort(ch2);
			for(int i=0;i<ch1.length;i++){
				if(ch1[i] != ch2[i])
					return false;
			}
			return true;
		}
	}

	public static String removeSpace(String s){
		String str ="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) != ' ')
				str = str+s.charAt(i);
		}
		return str;
	}

	public static char[] sort(char[] ch){
		//Bubble sort Algorithmn
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i] > ch[j]){
					char t=ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		return ch;
	}

}
