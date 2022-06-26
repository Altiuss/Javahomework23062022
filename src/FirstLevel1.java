//Write a method that takes a String and a two chars.
// As the result it returns the given String,
// where each the first char was replaced by the second char.
// You have to use only length() and charAt() methods of String class.For example:
// “I always do my homework”, ‘a’, ‘A’ -> “I AlwAys do my homework”


public class FirstLevel1 {
    public static void main(String[] args) {
        String str = "I always do my homework";
        swapLetters(str);
        System.out.println(str.length());

    }

    private static String swapLetters(String str) {
        char ch = ' ';
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a') {

                System.out.println(str.charAt(i));
                System.out.println(str.length());
            }
            System.out.println(str);
            return str;
        }
        return null;
    }
}
