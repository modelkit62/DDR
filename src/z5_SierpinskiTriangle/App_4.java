package z5_SierpinskiTriangle;

public class App_4 {
    public static void printSierpinski(int size) {
        printSierpinskiRecursive(size, size - 1);
    }

    private static void printSierpinskiRecursive(int size, int y) {
        if (y >= 0) {
            printSpaces(size, y);
            printStars(size, y);
            System.out.println();

            printSierpinskiRecursive(size, y - 1);
        }
    }

    private static void printSpaces(int size, int count) {
        if (count > 0) {
            System.out.print(" ");
            printSpaces(size, count - 1);
        }
    }

    private static void printStars(int size, int count) {
        if (count + size < size) {
            System.out.print("* ");
            printStars(size, count + 1);
        }
    }

    public static void main(String[] args) {
        printSierpinski(18); // Adjust the size as needed
    }
}
