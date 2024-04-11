package Demo2;

public class PalindromString {
    public static void main(String[] args) {
        String s ="Muum";
        s=s.toLowerCase();
       if(isPlaindrom(s)){
        System.out.println("Palindrom");
       }else{
        System.out.println("Not Palindrom");
       }
    }

    public static boolean isPlaindrom(String s){
        char[] ch = s.toCharArray();

        for (int i = 0; i < s.length()/2; i++) {
            if (ch[i] != ch[ch.length-i-1]) {
                return false;
            }
        }
        return true;
    }
}
