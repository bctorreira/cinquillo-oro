
package core;
/**
 * Representa una carta de la baraja, formada por un numero(1..12) y un palo(oros, copas, espadas y bastos) 
 */
public class Carta {
    
    private int valor;
    public static enum palos{OROS,COPAS,ESPADAS,BASTOS};
    private palos palo;
    

    public Carta(int valor, palos palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public palos getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
    public void setPalo(palos palo){
        palo=palo;
    }
    @Override
    public String toString() {
        return '[' + valor + " de " + palo + ']';
    }
}


