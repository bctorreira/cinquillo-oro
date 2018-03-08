
package core;

/**
 * Representa la baraja del juego, con 48 cartas (12 de cada palo), desordenadas. 
 * Estructura: Las cartas se guardarán en un array estático.
 * Funcionalidad: Crear la baraja, barajar, quitar una carta, etc  
 */

import core.Carta.palos;
import java.util.Random;

public class Baraja {
    public static Carta[] baraja = new Carta[48];
    
    public Baraja() { //Método constructor
        int pos = 0;
        for (int i = 0; i <= 3; i++) { //Itera palos (0 .. 3)
            for (int j = 0; j <= 11; j++) { //Itera valores (0 .. 11)
                baraja[pos] = new Carta(j+1, palos.values()[i]);
                pos++;
            }
        }
    }

    public void mezcla(Carta[] baraja) {
        Random aleat = new Random();
        for (int i = baraja.length -1; i > 0; i--) {
            int pos = aleat.nextInt(i + 1);
            Carta aux = baraja[pos];
            baraja[pos] = baraja[i];
            baraja[i] = aux;
        }
    }
}

