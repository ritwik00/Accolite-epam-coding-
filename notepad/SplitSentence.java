public class SplitSentence {
    public static void main(String[] args) {
        String s ="hello I am java";
        splitSentence(s);
    }
    public static void splitSentence(String sentence) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c != ' ') {
                word.append(c);
            } else {
                System.out.println(word);
                word.setLength(0);
            }
        }
        // Print the last word
        System.out.println(word);
    }
}
