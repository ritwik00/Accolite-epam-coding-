package Demo3;

public class ConvertEveryWordFirstCharacterIntoCapital {
    public static void main(String[] args) {
        String s = "A quick bRown fox";
        System.out.println(convert(s));
    }

    public static String convert(String s){
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' ') {
                if (ch[i] >= 'a' && ch[i]<='z') {
                    ch[i] = (char)(ch[i]-32);
                } 
            }else if(ch[i] >= 'A' && ch[i]<='Z'){
                ch[i] = (char)(ch[i]+32);
            }
        }
        String str =  new String(ch);
        return str;
    }
}
