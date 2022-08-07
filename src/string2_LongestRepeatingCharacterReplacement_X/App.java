package string2_LongestRepeatingCharacterReplacement_X;

public class App {

    public static int characterReplacement(String s, int k) {

        int[] count = new int[26];
        int start = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(i) - 'A']);
            while (i - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("ZAVXXU", 2));
    }

}
