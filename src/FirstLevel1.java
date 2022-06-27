//Write a method that takes a String and a two chars.
// As the result it returns the given String,
// where each the first char was replaced by the second char.
// You have to use only length() and charAt() methods of String class.For example:
// “I always do my homework”, ‘a’, ‘A’ -> “I AlwAys do my homework”


public class FirstLevel1 {
    public static void main(String[] args) {
        String oldstr = "I always do my homework";

        System.out.println(swapLetters(oldstr,'a', 'A'));

    }

    private static String swapLetters(String oldstr, char oldChar, char newchar) {
        String s = " ";
        for (int i = 0; i < oldstr.length() ; i++) {
            char c = oldstr.charAt(i);
            if (c == oldChar) {
                s = s + newchar;
            } else {
                s = s + c;
            }
        }
        return s;
    }
}
