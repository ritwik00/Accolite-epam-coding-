
/**
 * MaxOccouringCharacter
 */
public class MaxOccouringCharacter {

    public static void main(String[] args) {
        String s = "HelloJAva";
       maxOccour(s);
        // System.out.println(c);
    }

    public static void maxOccour(String s){
        char[] ch = s.toCharArray();
        int[] fr = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            fr[i]=1;
            for (int j = i+1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    fr[i]++;
                    ch[j]='0';
                }
            }
        }
        int max= 0;
        char c =' ';
        for (int i = 0; i < fr.length; i++) {
            // int max= 0;
            if (ch[i] != ' ' && ch[i] != '0') {
                System.out.println(ch[i] + "-> "+fr[i]);
            }
        }
    }
}