package Intervals3_NonOverlappingIntervals_X;

import java.util.Arrays;

public class App {

    public static int eraseOverlapIntervals(int[][] intervals) {

        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int freeTime=Integer.MIN_VALUE;
        int count=0;

        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<freeTime)
                count++;
            else
                freeTime=intervals[i][1];
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = { {1, 2}, {2, 3}, {3, 4}, {1, 3} };
        System.out.println(eraseOverlapIntervals(intervals));
    }
}

