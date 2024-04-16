

public class RemoveSpace {
    public static void main(String[] args) {
        String s=" Hell o Jav a ";
        String str = remove(s);
        System.out.println(str);
    }

    public static String remove(String s){
        char[] ch = s.toCharArray();
        String str="";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                str=str+ch[i];
            }
        }
        return str;
    }
}
