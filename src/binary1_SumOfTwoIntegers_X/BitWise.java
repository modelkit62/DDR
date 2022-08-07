package binary1_SumOfTwoIntegers_X;

public class BitWise {

    // Java program to illustrate
// bitwise operators
    public static void main(String[] args) {
        // Initial values
        int a = 5;
        int b = 7;

        // bitwise AND: if both bits are 1, it gives 1, else it shows 0.
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise OR: if either of the bits is 1, it gives 1, else it shows 0.
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        // bitwise XOR This operator is a binary operator, denoted by ‘^.’
        // It returns bit by bit XOR of input values, i.e.,
        // if corresponding bits are different, it gives 1, else it shows 0.
        // 0101 ^ 0111=0010 = 2
        System.out.println("a^b = " + (a ^ b));

        // bitwise NOT: with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
        // will give 1's complement (32 bit) of 5 = -6
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}

