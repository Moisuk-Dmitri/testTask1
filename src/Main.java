public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("123321"));
        System.out.println(isPalindrome("123321as"));
        System.out.println(isPalindrome("1234321"));
        System.out.println(isPalindrome("123321asd"));
        System.out.println(isPalindrome("abccba"));
    }

    public static boolean isPalindrome(String str) {
        for(int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(str.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
