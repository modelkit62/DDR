package a0_aReverseVowels;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class App {

    public String reverseVowels(String string) {

        Logger logger = Logger.getLogger(App.class.getName());

        List<Integer> posiciones = new ArrayList<>();

        for(int counter = 0; counter < string.length(); counter++){
            logger.info(String.valueOf("aeiou".indexOf(string.charAt(counter))));
            if("aeiou".indexOf(string.charAt(counter)) != -1) {
                posiciones.add(counter);
            }
        }

        int primero = 0;
        int ultimo = posiciones.size()-1;
        char[] letras = string.toCharArray();
        while(primero < ultimo){
            char vocal_1 = letras[posiciones.get(primero)];
            char vocal_2 = letras[posiciones.get(ultimo)];

            letras[posiciones.get(primero)] = vocal_2;
            letras[posiciones.get(ultimo)] = vocal_1;

            primero++;
            ultimo--;
        }
        return String.valueOf(letras);
    }

    @Test
    public void test(){
        App app = new App();
        assertEquals("holle", app.reverseVowels("hello"));
    }
}
