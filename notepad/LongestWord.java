public class LongestWord {
    public static void main(String[] args) {
        String s = "Dinga is a little boy";
        longestWord(s);
    }

    private static void longestWord(String s) {
      String[] words = s.split(" ");
      String longestWord = "";
      int maxLength = 0;
      
      // Iterate through each word
      for (String word : words) {
          // Check if the current word is longer than the previous longest word
          if (word.length() > maxLength) {
              maxLength = word.length();
              longestWord = word;
          }
      }
      
      // Print the longest word
      System.out.println("Longest word: " + longestWord);
    }
}
