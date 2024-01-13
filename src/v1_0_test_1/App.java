package v1_0_test_1;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class App {

    @Test
    public void listReversals() {
        final List<Integer> givenList = Arrays.asList(1, 2, 3, 4, 5);
        final List<Integer> expectedList = Arrays.asList(5, 4, 3, 2, 1);
        assertEquals(expectedList.size(), reverseRecursive(givenList).size());
        assertEquals(expectedList.size(), reverseIterative(givenList).size());
    }
    private List<Integer> reverseRecursive(List<Integer> list) {
        if (list.size() <= 1) { return list; }
        else {
            List<Integer> reversed = new ArrayList<>();
            reversed.add(list.get(list.size() - 1));
            reversed.addAll(reverseRecursive(list.subList(0, list.size() - 1)));
            return reversed;
        }
    }
    private List<Integer> reverseIterative(final List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            final int tmp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, tmp);
        }
        return list;
    }


















    int[] array1 = {1,2,3};
    int[] array2 = new int[4];

    static int number;

    public static void main(String[] args) {
        Integer integer = Integer.valueOf(number);
        int i = Integer.parseInt("22");
        String s = integer.toString(integer);
        //System.out.println(number);

        int a = 1;
        try {
            a = 2 / 1;
            System.out.println("OSTIAS");
        } catch (Exception e) {
            System.out.println("HOLA");

        } finally {
            System.out.println("CARACULO");
        }
        System.out.println(a);
    }


    public static String reverse(final String s) {
        final StringBuilder builder = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
    public String reverseString(String string) {
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = chars.length-1; i >= 0; i--){
            sb.append(chars[i]);
        }
        System.out.println(Integer.MAX_VALUE);
        return sb.toString();
    }


    @Test
    public void testReverseString(){
        App app = new App();
        String String = app.reverseString("Hello");
        assertEquals("olleH", String);
    }


    @Test(expected = NullPointerException.class)
    public void expectNullPointerExceptionToBeThrown() {
        String s = null;
        s.length();
       
    }

}


