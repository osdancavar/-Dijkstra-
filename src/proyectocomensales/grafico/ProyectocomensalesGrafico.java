/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocomensales.grafico;

import java.util.concurrent.Semaphore;

/**
 *
 * @author oscar
 */
public class ProyectocomensalesGrafico {

    /**
     * @param args the command line arguments
     */
    final static int numeroFilosofos = 5;//numero de filosofos, este numero no cambia
    final static int[][] palillosFilosofo = {
{0, 4}, // filosofo 0
{1, 0}, // filosofo 1
{2, 1}, // filosofo 2
{3, 2}, // filosofo 3
{4, 3} // filosofo 4
};
final static Semaphore[] palillos_semaforo = new Semaphore[numeroFilosofos];
    
    public static void main(String[] args) {
        for (int i = 0; i < numeroFilosofos; i++) {
palillos_semaforo[i] = new Semaphore(1);
}
for (int idFilosofo = 0; idFilosofo < numeroFilosofos; idFilosofo++) {
new Filosofo(idFilosofo, palillos_semaforo, palillosFilosofo).start();
}
    }
    
}
