package z6_HannoiTowers;

public class App {

    /*
    Tower of Hanoi is a mathematical puzzle where we have three rods and n disks.
    The objective of the puzzle is to move the entire stack to another rod,
    obeying the following simple rules: 1) Only one disk can be moved at a time.

    2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another
    stack i.e. a disk can only be moved if it is the uppermost disk on a stack. 3) No disk may be
    placed on top of a smaller disk.
    */

    public static void move(int n, int startPole, int endPole) {
        if (n== 0){
            return;
        }
        int intermediatePole = 6 - startPole - endPole;
        move(n-1, startPole, intermediatePole);
        System.out.println("Move " +n + " from " + startPole + " to " +endPole);
        move(n-1, intermediatePole, endPole);
    }

    public static void main(String[] args) {
        move(5, 1, 3);
    }
}
