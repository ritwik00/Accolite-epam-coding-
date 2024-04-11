package Demo2;

public class AnnagramString {
    public static void main(String[] args) {
        String s1= "Hitler Woman";
        String s2="Mother in Law";
    //    boolean b = isAnnagram(s1, s2);
    //    if (b) {
    //     System.out.println("Annagram");
    //    }else{
    //     System.out.println("Not Annagram");
    //    }
        System.out.println((isAnnagram(s1, s2)?"Annagram":"NotAnnagram"));
    }

    public static boolean isAnnagram(String a, String b){
        a=removeSpace(a);
        b=removeSpace(b);

        if (a.length() != b.length()) {
            return false;
        }else{
            a=lowerCase(a);
            b=lowerCase(b);
            char[] ch1 = a.toCharArray();
            char[] ch2 = b.toCharArray();
            ch1 = sort(ch1);
            ch2 = sort(ch2);
           for (int i = 0; i < ch2.length; i++) {
             if (ch1[i] != ch2[i]) {
                 return false;
             }
           }
            return true;
        }
       
    }

    public static String removeSpace(String s){
        char[] ch = s.toCharArray();
        String str="";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                str=str+ch[i];
            }
        }
        return str;
    }

    public static String lowerCase(String s){
        char[] ch = s.toCharArray();
        String nstr ="";
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>=65 && ch[i]<=90)
            {
            nstr=nstr+(char)(ch[i]+32);
            }
            
            /*if any alphabet is in upper case convert it
            into lower case*/
            
            else
            {
            nstr=nstr + ch[i];}
        }
        return nstr;
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
