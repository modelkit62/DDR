package z5_SierpinskiTriangle;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class App_1 {

    /*
    Write a Java program to draw Triangle as below.

            drawTriangle(4);

    Output:
               *
              * *
             *   *
            *******
    */

    public static void drawTriangle(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k == 2 * i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for (int i = 0; i < size*2; i++) {
            System.out.print("*");
        }
    }

    /*
    In this program, the first loop (j) is used to print the spaces before the stars to create the triangular shape,
    and the second loop (k) is responsible for printing the '*' for the edges and spaces for the interior of the triangle.
    */

    public static void main(String[] args) {
        drawTriangle(4);
    }

    @Test
    public void testDrawTriangle() {
        // Redirect System.out to capture the printed output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the method with the desired size
        App_1.drawTriangle(4);

        // Reset System.out
        System.setOut(System.out);

        // Verify the output against the expected result
        String expectedOutput = "   *\n  * *\n *   *\n*     *\n********";

        assertEquals(expectedOutput, outputStream.toString());
    }


}
