package a0_Recursividad;

public class App {

    static int metodo_recursivo(int numero) {

        /*if(numero == 1){
            return 1;
        } else {
           return numero * metodo_recursivo(numero-1);
        }*/

       /* int resultado = 1;
        while( numero != 1 ){
            resultado = resultado * numero;
            numero--;
        }
        return resultado;*/


        if (numero == 1) {
            return 1;
        } else {
            return numero * metodo_recursivo(numero - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(metodo_recursivo(5));
    }

}

