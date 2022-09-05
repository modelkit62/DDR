package a0_Array2D;

public class App {

    public static String[] joiner(String[][] array) {

        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    sb.append("The Capitol of ");
                } else {
                    sb.append(" is ");
                }
                sb.append(array[i][j]);
                result[i] = sb.toString();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] array = new String[4][2];
        array[0][0] = "Spain";
        array[0][1] = "Madrid";
        array[1][0] = "France";
        array[1][1] = "Paris";
        array[2][0] = "England";
        array[2][1] = "London";
        array[3][0] = "Russia";
        array[3][1] = "Moscow";

        String[] joiner = joiner(array);
        for (String s : joiner) {
            System.out.println(s);
        }
    }
}



