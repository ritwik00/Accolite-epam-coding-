package Demo2;
public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Java";
       String s = reverse(str);
       System.out.println(s);
    }
    public static String reverse(String s){
        String str ="";
        for (int i = s.length()-1; i>=0;i--) {
            str= str+s.charAt(i);
        }
        return str;
    }
}
