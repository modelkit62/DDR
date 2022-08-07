package binary5_ReverseBits;

public class App {

    public static int reverseBits(int number) {
        int result = 0;
        int index = 32;

        while(index > 0){
            result = (result << 1) | (number & 1);
            number >>= 1;
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(2));
    }


}
