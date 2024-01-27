package a0_aReverseArray;

public class App2 {

    public static void main(String[] args) {
        String cadena = "Lorem";
        System.out.println(cadena);
        char[] chars = cadena.toCharArray();
        System.out.println();
        System.out.println("a".indexOf('a') + " como son iguales da zero");
        System.out.println();
        System.out.print("This one " + chars[0]);
        System.out.println(" going to change by " + chars[4]);
        System.out.println();
        char strawVowel = chars[4];
        chars[0] = strawVowel;
        System.out.println(String.valueOf(chars));
    }

}
