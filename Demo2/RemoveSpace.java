package Demo2;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over a lazy dog";
        String str = removeSpace(s);
        System.out.println(str);
    }

    public static String removeSpace(String s){
        char[] ch = s.toCharArray();
        String str ="";
        for (char c : ch) {
            if (c != ' ') {
                str=str+c;
            }
        }
        return str;
    }
}
