public class SplitSentence1 {
    public static void main(String[] args) {
        String s ="hello I am java";
        splitSentence(s);
    }
    public static void splitSentence(String s) {
       char[] ch = s.toCharArray();
       String str ="";
       for (char c : ch) {
        if (c != ' ') {
            str = str + c;
        } else {
            System.out.println(str);
            str="";
        }
       }
       System.out.println(str);
    }

}
