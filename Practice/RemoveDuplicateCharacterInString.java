import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class RemoveDuplicateCharacterInString {
    public static void main(String[] args) {
        String s = "Hello Java";
       String str =  removeDuplicate(s);
        System.out.println(str);
    }

    // public static String removeDuplicate(String s){
    //     char[] ch = s.toCharArray();
    //     Set<Character> set = new HashSet<>();
    //     StringBuilder sb = new StringBuilder();
    //     for (Character c : ch) {
    //         if (set.add(c)) {
    //             sb.append(c);
    //         }
    //     }
    //     return sb.toString();
    // }

    public static String removeDuplicate(String str) {
        // Create a HashMap to store characters as keys
        HashMap<Character, Boolean> map = new LinkedHashMap<>();
        StringBuilder result = new StringBuilder();

        // Iterate through each character of the string
        for (Character ch : str.toCharArray()) {  
            // If the character is not already in the map, append it to the result
            if (!map.containsKey(ch)) {
                map.put(ch, true);
                result.append(ch);
            }
        }

        // Convert the StringBuilder to a String and return
        return result.toString();
    }
}
