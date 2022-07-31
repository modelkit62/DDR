package binary1_SumofTwoIntegers;

public class App {
    public static int getSum(int a, int b) {
        int x = a ^ b;
        int y = a & b;
        int z = 5 << 1;

        return b == 0 ? a : getSum(a ^ b, (a & b) << 1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(3,2));
    }
}
