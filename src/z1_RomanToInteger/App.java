package z1_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        int current = map.get(chars[0]);
        int previous = map.get(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            int cursor = map.get(chars[i]);
            if (cursor <= previous) {
                current = current + cursor;
            } else {
                current = current + cursor - 2 * previous;
            }
            previous = cursor;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XIV"));
    }

}
