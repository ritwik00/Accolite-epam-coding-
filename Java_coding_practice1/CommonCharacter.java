
import java.util.*;
class CommonCharacter{
	public static void main(String[] args){
		 String s = "mother";
        String s1= "sister ";
       commonCharacter(s,s1);
	}
	
	public static void commonCharacter(String a, String b){
		Set<Character> first = new HashSet<Character>();
		Set<Character> second = new HashSet<Character>();
		char[] ch1 = a.replaceAll("\\s","").toCharArray();
		char[] ch2 = b.replaceAll("\\s","").toCharArray();
		for(Character c: ch1){
			first.add(c);
		}
		for(Character c: ch2){
			second.add(c);
		}

		//show only the common character 
        first.retainAll(second);
        System.out.println(first);
		
		// for (char c : first) {
        //     if (second.contains(c)) {
        //         System.out.println(c);
        //     }
        // }

	}
}