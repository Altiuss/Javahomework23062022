//Write method that checks whether a given string is a palindrome.
// A palindrome is a phrase that reads the same from the front and the back.


public class SecondLevel {
    public static void main(String[] args) {
        System.out.println(isPalindrom("1234321"));
        System.out.println(isPalindrom("1234567"));


    }
    private static boolean isPalindrom(String str){
        for (int i = 0; i < str.length() / 2; i++){
            char leftChar = str.charAt(i);
            char reightChar = str.charAt(str.length() - i - 1);
            if (leftChar != reightChar){
                return false;
            }
        }
        return true;
    }
}
