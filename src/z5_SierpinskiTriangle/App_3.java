package z5_SierpinskiTriangle;

public class App_3 {

    /*
    Steps for Construction :
    1 . Take any equilateral triangle .
    2 . Divide it into 4 smaller congruent triangle and remove the central triangle .
    3 . Repeat step 2 for each of the remaining smaller triangles forever.


    Write a Java program to draw a Sierpinski Triangle Implement the drawSierpinskiTriangle function
    that takes an integer parameter n representing the order of the triangle. The function should draw
    an equilateral triangle of size 2^n - 1 using '*' characters. The triangle should be centered in the console.

    The program should have a main method to demonstrate the function.

           *
          * *
         *   *
        * * * *
       *       *
      * *     * *
     *   *   *   *
    * * * * * * * *

    The printSierpinski method takes an integer n as an input, which represents the height of the Sierpinski Triangle.

    The outer loop (for (int y = n - 1; y >= 0; y--)) iterates over the rows of the triangle, starting from the top and going to the bottom.

    Inside the outer loop, the first inner loop (for (int i = 0; i < y; i++)) prints leading spaces to create
    the indentation for each row.

    The second inner loop (for (int x = 0; x + y < n; x++)) iterates over the columns. The condition (x & y) != 0
    uses bitwise AND to check if the bitwise AND of x and y is non-zero. If true, it prints two spaces; otherwise,
    it prints '* '.

    After completing the row, a newline character (System.out.print("\n");) is printed to move to the next line.

    The main method calls printSierpinski(8) to print a Sierpinski Triangle with a height of 8.
    */



    static void printSierpinski(int size) {
        for (int y = size - 1; y >= 0; y--) {
            // printing space till
            // the value of y
            for (int i = 0; i < y; i++) {
                System.out.print(" ");
            }

            // printing '*'
            for (int x = 0; x + y < size; x++) {
                // printing '*' at the appropriate
                // position is done by the and
                // value of x and y wherever value
                // is 0 we have printed '*'
                if ((x & y) != 0)
                    System.out.print(" " + " ");
                else
                    System.out.print("* ");
            }

            System.out.print("\n");
        }
    }

    // Driver code
    public static void main(String args[]) {
        // Function calling
        printSierpinski(8);
    }
}
