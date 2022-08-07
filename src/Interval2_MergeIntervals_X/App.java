package Interval2_MergeIntervals_X;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class App {

    public static int[][] mergeIntervals(int[][] intervals) {
        // ================= TERCER ALGORITMO MAS FACILITO

        // ORDEMO MI ARRAY
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // CREO LA SALIDA
        List<int[]> output_list = new LinkedList<>();

        int[] current_interval = intervals[0];
        output_list.add(current_interval);

        for(int[] interval : intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];

            if(current_end >= next_begin){
                current_interval[1] = Math.max(current_end, next_end);
            } else {
                current_interval = interval;
                output_list.add(current_interval);
            }
        }
        return output_list.toArray(new int[output_list.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {8, 10}, {15, 18}, {2, 6} };
        print2D(mergeIntervals(intervals));

    }

    private static void print2D(int mat[][]) {
        // Loop through all rows
        for (int[] row : mat)
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
        /*
        // Comparo los arrays que sean de menor a mayor
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0],arr2[0]));
        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Defino mi array de salida y lo hago asi porque no se la
        // extension del array de salida
        ArrayList<int[]> output_array = new ArrayList<>();

        // Este es el algoritmo
        // Cojo el array 2D y lo ITERO
        // Cojo el primer elemento y si el array de salida = 0 entonces lo meto
        // SI NO LO ES -> ALGORITMO QUE TE CRIO!
        // Me cojes el ultimo elemento del array de salida y me lo comparas con el
        // primer elemento del array que recibes
            // Si es mayor el recibido lo incluyes en el array de salida
            // Si no, last[1] = Math.max(last[1], interval[1])
        for (int[] interval : intervals) {
            if (output_array.size() == 0) {
                output_array.add(interval);
            } else {
                int[] last = output_array.get(output_array.size() - 1);
                if (interval[0] > last[1]) {
                    output_array.add(interval);
                } else {
                    last[1] = Math.max(last[1], interval[1]);
                }
            }
        }

        // Retorno my array de salida convertido
        return output_array.toArray(new int[output_array.size()][2]);
        */

    // ================= SEGUNDO ALGORITMO MAS FACILITO

        /*
        // ORDEMO MI ARRAY
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // CREO LA SALIDA
        List<int[]> output_list = new LinkedList<>();
        // INCLUYO EL PRIMERO Y LO TOMO COMO REFERENCIA
        int[] temporal = intervals[0];
        output_list.add(temporal);

        // ITERO; ALGORITMO!!!
        for (int[] interval: intervals) {
            // COMPARO EL TEMORAL DE 1 CON EL INTERVAL DE 0 >=
            if (temporal[1] >= interval[0]) {
                // MATH MAX DEL TEMPORAL DE 1 CON EL INTERVAL DE 1
                temporal[1] = Math.max(temporal[1], interval[1]);
            }
            else {
                // TEMPORAL - INTERVAL
                temporal = interval;
                // OUTPUT: TEMPORAL
                output_list.add(temporal);
            }
        }
        // ESTUDIAR ESTE ALGORITMO!!!
        return output_list.toArray(new int[output_list.size()][]);*/


}
