

public class ReverseString {
    public static void main(String[] args) {
        String s="Hello Java";
        String str = reverse(s);
        System.out.println(str);
    }

    public static String reverse(String s){
        char[] ch = s.toCharArray();
        String str="";
        int i=0;
        while (i<ch.length) {
            str= ch[i]+str;
            i++;
        }
        return str;
    }
}
