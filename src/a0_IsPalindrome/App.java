package a0_IsPalindrome;

public class App {

    static boolean isPalindrome(String string) {
        StringBuilder sb = new StringBuilder();
        String clean = string.replaceAll("\\s+", "").toLowerCase();
        char[] chars = clean.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return (sb.toString().equals(clean));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ANA"));
    }
}
