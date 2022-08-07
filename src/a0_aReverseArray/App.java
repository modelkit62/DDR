package a0_aReverseArray;

public class App {

    public static Object[] reverse(Object[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            Object temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] fruits = {"apples", "tomatoes", "bananas", "guavas", "pineapples"};
        for (Object s : reverse(fruits)) {
            System.out.println(s.toString());
        }
    }


}
