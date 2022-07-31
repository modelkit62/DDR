package a0_aBitWise;

public class App {

/*  The bitwise logical operators are AND(&), OR(|), XOR(^), and NOT(~).

    3=00000011
    4=00000100
    |
    is bitwise
    OR operator
    when you
    OR two
    numbers,
    you take
    the binary
    representation and
    the OR
    result is 1IFF for
    that column
    at least
    one column
    is set true(1)

    So
    00000011 = 3
    00000100 = 4
    --------
    00000111 = 7

    then,
    columns tell
    you the
    value at
    that position:

    128,64,32,16,8,4,2,1*/

    public static void main(String[] args) {
        System.out.println(3 | 4); // 7
    }

}
