package Demo2;

public class Frequency {
    public static void main(String[] args) {
        String s ="abcabc";
        int[] fr = new int[s.length()];
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length-1; i++) {
            fr[i]=1;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    fr[i]++;
                    ch[j]='0';
                }   
            }
        }

        for (int i = 0; i < fr.length; i++) {
            if (ch[i] != '0' && ch[i] !=' ') {
                System.out.println(ch[i]+"->"+fr[i]);
            }
        }
    }
}
