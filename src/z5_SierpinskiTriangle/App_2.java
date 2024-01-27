package z5_SierpinskiTriangle;

public class App_2 {

    /*
    Implement a Java program to generate and display a Sierpinski Carpet using recursion.
    The provided code gives you a starting point with a function drawSierpinskiCarpet that takes two parameters - order and size.
    The order determines the level of recursion, and size sets the size of the carpet. The program initializes a
    2D char array representing the carpet, fills it with empty spaces, and then populates it with '*'
    characters based on the Sierpinski pattern.

    ###########################
    # ## ## ## ## ## ## ## ## #
    ###########################
    ###   ######   ######   ###
    # #   # ## #   # ## #   # #
    ###   ######   ######   ###
    ###########################
    # ## ## ## ## ## ## ## ## #
    ###########################
    #########         #########
    # ## ## #         # ## ## #
    #########         #########
    ###   ###         ###   ###
    # #   # #         # #   # #
    ###   ###         ###   ###
    #########         #########
    # ## ## #         # ## ## #
    #########         #########
    ###########################
    # ## ## ## ## ## ## ## ## #
    ###########################
    ###   ######   ######   ###
    # #   # ## #   # ## #   # #
    ###   ######   ######   ###
    ###########################
    # ## ## ## ## ## ## ## ## #
    ###########################

    */

    public static boolean inCarpet(long x, long y) {
        while (x!=0 && y!=0) {
            if (x % 3 == 1 && y % 3 == 1)
                return false;
            x /= 3;
            y /= 3;
        }
        return true;
    }

    public static void carpet(final int n) {
        final double power = Math.pow(3,n);
        for(long i = 0; i < power; i++) {
            for(long j = 0; j < power; j++) {
                System.out.print(inCarpet(i, j) ? "*" : " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        carpet(3);
    }

    /*
    This code generates a Sierpinski Carpet pattern by determining whether each point in a grid is inside or outside
    the carpet. The inCarpet method checks if a given point (x, y) is inside the Sierpinski Carpet, and the carpet method
    prints the carpet pattern by iterating through the grid and printing '*' for points inside the carpet
    and ' ' for points outside.

    Let's break down the code:

    inCarpet Method:

    Parameters: long x, long y - the coordinates of a point.
    Return Type: boolean - true if the point is inside the Sierpinski Carpet, false otherwise.
    Explanation:
    The method uses a while loop to iteratively divide the coordinates (x, y) by 3 until one of them becomes zero.
    During each iteration, it checks if the current point (x, y) falls into the center square of the Sierpinski
    Carpet (x % 3 == 1 && y % 3 == 1). If it does, the method returns false because points inside the center
    square are not part of the carpet.

    If the loop completes without returning false, it means the point is not in the center square, and the method
    returns true, indicating that the point is inside the Sierpinski Carpet.
    carpet Method:

    Parameter: final int n - the level of recursion or the size of the Sierpinski Carpet.
    Explanation:
    The method calculates the total number of points in the grid by raising 3 to the power of n (Math.pow(3, n)) and
    stores it in the power variable.

    It then uses nested loops to iterate through all points in the grid (from i = 0 to power - 1 and j = 0 to power - 1).
    For each point, it prints '*' if the inCarpet method returns true (indicating that the point is inside the carpet)
    and ' ' otherwise.
    After printing each row, it moves to the next line.
    In summary, the code uses a simple algorithm to determine whether each point in a grid is inside or outside the
    Sierpinski Carpet and prints the corresponding pattern. The inCarpet method checks the conditions for points
    inside the carpet, and the carpet method iterates through the grid and prints the appropriate characters based on
    the result of inCarpet.
    */


}
