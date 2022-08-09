package a0_DuplicateWithSet;

import java.util.HashSet;
import java.util.Set;

public class App {

    static String isDuplicated(String string){
        char[] chars = string.toCharArray();
        Set<String> set = new HashSet<>();
        /*for(Character c : chars){
            if(!set.add(c.toString())){
                return c.toString();
            }
        }*/
        for (int i = 0; i < chars.length ; i++) {
            if(!set.add(String.valueOf(chars[i]))){
                return String.valueOf(chars[i]);
            }
        }
        return "No se repite ninguna!";
    }

    public static void main(String[] args) {
        System.out.println(isDuplicated("ANA"));
    }
}
