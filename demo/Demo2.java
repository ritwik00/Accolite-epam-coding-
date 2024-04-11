package demo;

public class Demo2 {
    public static void main(String[] args) {
        String str = "hello";
        boolean b = isPalindrom(str);
        if (b == true) {
            System.out.println("palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }

    private static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(str.length()-i+1)){
                    return false;
            }
        }

      return true;
    }
}
