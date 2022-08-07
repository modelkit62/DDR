package Interval1_InsertInterval_X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static int[][] insert(int[][] intervals, int[] new_interval) {

        // 1. Defino el array de salida
        List<int[]> output_array = new ArrayList<>();
        int pointer = 0;
        int end = intervals.length;

        // El segundo elemento del array 1 tiene que ser menor que el primero del array 2!!!
        // Si es asi lo meto en el array de salida y me corro 1 al pointer
        while(pointer < end && intervals[pointer][1] < new_interval[0]){
            output_array.add(intervals[pointer++]);
        }
        // Mientras que el 1er elemento del array 1 sea menor o igual al del array 2 DEFINO EL NEXT
        // Y corro 1 el pointer
        while (pointer < end && intervals[pointer][0] <= new_interval[1]) {
            new_interval[0] = Math.min(new_interval[0], intervals[pointer][0]);
            new_interval[1] = Math.max(new_interval[1], intervals[pointer][1]);
            pointer++;
        }
        // Lo incluyo en el array
        output_array.add(new_interval);
        // Add the remaining intervals to the list
        while (pointer < end){
            output_array.add(intervals[pointer++]);
        }

        // Realizo la conversion
        return output_array.toArray(new int[output_array.size()][2]);
    }
    public static void main(String[] args) {
        int[][] intervals = { {1, 3}, {6, 9} };
        int[] new_intervals = {2, 5} ;
        print2D(insert(intervals, new_intervals));

    }

    private static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    /*for (int i = 0; i < intervals.length; i ++) {
     *//*1. No overlap and toAdd appears before current interval, add toAdd to result.*//*
            if (intervals[i][0] > new_interval[1]) {
                output_array.add(new_interval);
                new_interval = intervals[i];
            }
            *//*2. Has overlap, update the toAdd to the merged interval.*//*
            else if (intervals[i][1] >= new_interval[0])
                new_interval = new int[] {Math.min(intervals[i][0], new_interval[0]),
                        Math.max(intervals[i][1], new_interval[1]) };
                *//*3. No overlap and toAdd appears after current interval, add current interval to result.*//*
            else output_array.add(intervals[i]);
        }*/
}
