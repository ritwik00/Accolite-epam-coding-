

class FrequebcyOfEachCharacter{
	public static void main(String[] args){
		String s="abcabcdabcde";
		frequencey(s);
	}
	
	public static void frequencey(String s){
		int[] fre= new int[s.length()];
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			fre[i] =1;
			for(int j=i+1;j<ch.length;j++){
				if(ch[i] == ch[j]){
					fre[i]++;
					ch[j]='0';
				}
			}
		}
		
		for(int i=0;i<fre.length;i++){
			if(ch[i] != '0' && ch[i] != ' '){
				System.out.println(ch[i]+"->"+fre[i]);
			}
		}
	}
}