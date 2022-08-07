package DynamicProgramming3_LongestIncreasingSubsequence_X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Helper_BinarySearch {

    /*java.util.Collections.binarySearch() method
    is a java.util.Collections class method that returns
    position of an object in a sorted list.*/
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(20);

        // 10 is present at index 3.
        int index = Collections.binarySearch(list, 10);
        System.out.println("Index-10: " +index);

        // 13 is not present. 13 would have been inserted
        // at position 4. So the function returns (-4-1)
        // which is -5.
        index = Collections.binarySearch(list, 13);
        System.out.println("Index-13: " +index);


    }
}
