package Practice;

public class ReverseSentence {
    public static void main(String[] args) {
        String s ="Hello Java";

        String str =reverse(s);
        System.out.println(str);
    }

    public static String reverse(String s){
        char[] ch = s.toCharArray();
        String str ="";
        for (int i = ch.length-1;i>=0; i--) {
            int k=i;
            while (i>=0 && ch[i] != ' ') {
                i--;
            }
            int j=i+1;
            while (j <= k) {
                str = str+ch[j];
                j++;
            }
            str = str+' ';
        }
        return str;
    }
}
