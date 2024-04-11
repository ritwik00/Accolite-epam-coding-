package LeetCode;

public class Sorting1 {
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        String s ="";
        for (int i : nums) {
            s = s+String.valueOf(i);
        }
        char[] ch = s.toCharArray();
        //Bubble Sort 
        for (int i = 0; i < ch.length; i++) {
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i] > ch[j]){
                    char t= ch[i];
                    ch[i]=ch[j];
                    ch[j]=t;
                    
                }
            }
        }
        String str = new String(ch);
       StringBuilder sb= new StringBuilder(str);
       sb.reverse();
       System.out.println(sb.toString());
    }
}
