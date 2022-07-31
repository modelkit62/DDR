package String1_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;

public class App {
    public static int lengthOfLongestSubstring(String s) {
        // if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int max=0;
        for (int i=0; i<s.length(); ++i){
            int counter = 0;
            if (map.containsKey(s.charAt(i))){
                counter = Math.max(counter,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-counter+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abca"));
    }
}
