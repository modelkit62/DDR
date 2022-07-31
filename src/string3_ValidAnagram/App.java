package string3_ValidAnagram;

public class App {

    public static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a'] --;
        }
        for (int counter : alphabet) {
            if (counter != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("lapo", "palo"));
    }
}
