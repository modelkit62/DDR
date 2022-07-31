package String5_ValidPalindrome;

public class App {
    public static boolean isPalindrome(String s) {
        /* if (s.isEmpty()) {
            return true;
        }*/

        /* ==> SOLUCION LENTA
        String sorted = "";

        for (Character c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sorted += c;
            }
        }
        sorted = sorted.toLowerCase();

        int pointer_a = 0;
        int pointer_b = sorted.length() - 1;

        while (pointer_a <= pointer_b) {
            if (sorted.charAt(pointer_a) != sorted.charAt(pointer_b)) {
                return false;
            }
            pointer_a += 1;
            pointer_b -= 1;
        }
        return true;*/

        int head = 0;
        int tail = s.length() - 1;
        char cHead;
        char cTail;

        while(head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if(!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}



