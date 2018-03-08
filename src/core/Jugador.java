
package core;

/**
 * Representa a un jugador de la partida, identificado por el nombre, las cartas de la mano y puntos acumulados 
 * Funcionalidad: recibir las 12 cartas, de entre las cartas posibles a colocar selecciona una, consultar/modificar puntos, etc
 */
public class Jugador {
    private String nombre;
    private Mano mano;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = mano;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mano getMano() {
        return mano;
    }

    public int getPuntos() {
        return puntos;
    }

    public void sumaPuntos(int puntos) {
        this.puntos += puntos;
    }
    
    
    /**
    * Representa las cartas de cada jugador en cada momento de la partida. 
    * Estructura: se almacenarán en un array estático.
    * Funcionalidad: añadir una carta, quitar una carta, devolver cartas posibles, visualizar, etc 
    */
   public class Mano {
        private Carta[] cartas;
        private int numCartas;
        
        private Mano() {
            this.cartas = new Carta[12];
            this.numCartas = 0;
        }

        public Carta[] getCartas() {
            return cartas;
        }

        public int getNumCartas() {
            return numCartas;
        }
        
        public void cogeCarta(Carta nuevacarta) {
            if (numCartas >= 12) {
                System.err.println("No caben más cartas.");
            }
            else {
                cartas[numCartas++] = nuevacarta;
            }
        }
        
        public void dejaCarta(Carta micarta) {
            if (numCartas == 0) {
                System.err.println("No hay cartas.");
            }
            else {
                int i = 0;
                while (i++ < numCartas) {
                    if (this.cartas[i] == micarta && i != numCartas - 1) {
                        for (int j = i; j < numCartas; j++) {
                            cartas[j] = cartas [j+1];
                        }
                    }
                    else if (cartas[i] == micarta && i == numCartas - 1) {
                        cartas[i] = null;
                    }
                }
            }
        }
        
        public String toString() {
            StringBuilder toret = new StringBuilder();
            for (int i = 0; i < numCartas; i++) {
                toret.append(cartas[i].toString()).append(", ");
            }
            return toret.toString();
        }
    }
}

