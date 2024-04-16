package Demo2;
import java.util.*;
public class CommonCharacter {
    public static void main(String[] args) {
        String s = "hello java";
        String s1= "Jaha Alo";
       commonCharacter(s,s1);
    }

    private static void commonCharacter(String s, String s1) {
        char[] firstStringToCharArray = s.replaceAll("\\s+", "").toCharArray();
         
        char[] secondStringToCharArray = s1.replaceAll("\\s+", "").toCharArray();
         
        Set<Character> firstStringSet = new HashSet<>();
         
        Set<Character> secondStringSet = new HashSet<>();
         
        for (char c : firstStringToCharArray) 
        {
            firstStringSet.add(c);
        }
         
        for (char c : secondStringToCharArray)
        {
            secondStringSet.add(c);
        }
         
        firstStringSet.retainAll(secondStringSet);
        //OR

        
        // for (char c : first) {
        //     if (second.contains(c)) {
        //         System.out.println(c);
        //     }
        // }
         
        System.out.println("Common characters in alphabetical order : "+firstStringSet);
         
        System.out.println("Count : "+firstStringSet.size());
    }
}
