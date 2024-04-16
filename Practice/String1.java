package Practice;

public class String1 {
    public static void main(String[] args) {
        String s = "Hello Java";
        String str= notReversal(s);
        System.out.println(str);
    }
    
    
        public static String notReversal(String input) {
            char[] chars = input.toCharArray();
            int start = 0;
            int end = chars.length - 1;
    
            while (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
    
            return new String(chars);
        }
}
