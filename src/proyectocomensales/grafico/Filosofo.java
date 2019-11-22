/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocomensales.grafico;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.Semaphore;
import javax.swing.ImageIcon;

public class Filosofo extends Thread {

    Comensales ventana = Comensales.getInstancia();
    /**
     */
    private final int idFilosofo;
    private final Semaphore[] palillos_semaforo;
    private final int[][] palillosFilosofo;
    private final int palilloIzquierdo;
    private final int palilloDerecho;
    private final Random tiempoAleatorio = new Random();
    public boolean filosofo1 = false, filosofo2 = false, filosofo3 = false, filosofo4 = false, filosofo5 = false;

    public Filosofo(int idFilosofo, Semaphore[] palillos_semaforo, int[][] palillosFilosofo) {
        this.idFilosofo = idFilosofo;
        this.palillos_semaforo = palillos_semaforo;
         this.palillosFilosofo = palillosFilosofo;
        this.palilloIzquierdo = palillosFilosofo[idFilosofo][0];
        this.palilloDerecho = palillosFilosofo[idFilosofo][1];
    }
//aqui llamo el texto que voy a pasar a los cuadros de texto

    public void mensaje(int i, String m) {
        if (i == 1) {
            ventana.lblMensaje1.setText("Filosofo  " + i + " " + m);
        } else if (i == 2) {
            ventana.lblMensaje2.setText("Filosofo  " + i + " " + m);
        } else if (i == 3) {
            ventana.lblMensaje3.setText("Filosofo  " + i + " " + m);
        } else if (i == 4) {
            ventana.lblMensaje4.setText("Filosofo  " + i + " " + m);
        } else if (i == 5) {
            ventana.lblMensaje5.setText("Filosofo  " + i + " " + m);
        }
    }
//esto se encarga de recibir la imagen y cambiarla dependiedo de la desposicion de los if de abajo

    public void recarga(String i) {
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/" + i + ".png"));
        ImageIcon icono = new ImageIcon(imagen.getImage());
        ventana.lblImagen.setIcon(icono);
        ventana.setLocationRelativeTo(null);
        ventana.lblImagen.setSize(750, 750);
        ventana.setSize(850, 750);
        ventana.setVisible(true);
    }

    protected void comer() {
        if (palillos_semaforo[palilloIzquierdo].tryAcquire()) {
            if (palillos_semaforo[palilloDerecho].tryAcquire()) {

                switch (idFilosofo) {//esto se encarga de verificar que variable de imagen se imprimira 
                    case 0:
                        filosofo1 = true;
                        break;
                    case 1:
                        filosofo2 = true;
                        break;
                    case 2:
                        filosofo3 = true;
                        break;
                    case 3:
                        filosofo4 = true;
                        break;
                    case 4:
                        filosofo5 = true;
                        break;
                }
                if ((filosofo1 == true) && (filosofo4 == false)) {
                    this.recarga("comensal 1 con 3");//aqui se envia la imagen 
                    // this.mensaje((idFilosofo + 1), "comiendo");//y aqui el texto , lo mismo para todas 
                } else if ((filosofo1 == true) && (filosofo3 == false)) {
                    this.recarga("comensal 1 con 4");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo2 == true) && (filosofo5 == false)) {
                    this.recarga("comensal 2 con 4");
                    //  this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo2 == true) && (filosofo4 == false)) {
                    this.recarga("comensal 2 con 5");
                    //  this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo3 == true) && (filosofo1 == false)) {
                    this.recarga("comensal 3 con 5");
                    //  this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo3 == true) && (filosofo5 == false)) {
                    this.recarga("comensal 3 con 1");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo4 == true) && (filosofo2 == false)) {
                    this.recarga("comensal 4 con 1");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo4 == true) && (filosofo1 == false)) {
                    this.recarga("comensal 4 con 2");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo5 == true) && (filosofo3 == false)) {
                    this.recarga("comensal 5 con 2");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if ((filosofo5 == true) && (filosofo2 == false)) {
                    this.recarga("comensal 5 con 3");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if (filosofo1 == true) {
                    this.recarga("comensal 1 solo");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if (filosofo2 == true) {
                    this.recarga("comensal 2 solo");
                    //this.mensaje((idFilosofo + 1), "comiendo");
                } else if (filosofo3 == true) {
                    this.recarga("comensal 3 solo");
                    //this.mensaje((idFilosofo + 1), "comiendo");
                } else if (filosofo4 == true) {
                    this.recarga("comensal 4 solo");
                    // this.mensaje((idFilosofo + 1), "comiendo");
                } else if (filosofo5 == true) {
                    this.recarga("comensal 5 solo");
                }
                this.mensaje((idFilosofo + 1), "comiendo");

                try {
                    sleep(tiempoAleatorio.nextInt(10000) + 500);
                } catch (InterruptedException ex) {
                    System.out.println("Error : " + ex.toString());
                }

                palillos_semaforo[palilloDerecho].release();
            }
// Y libera tambien el semaforo palillo de su izuierda.
            palillos_semaforo[palilloIzquierdo].release();
        } else { // el filÃ³sofo no ha podido coger el pallillo, no puede comer.

            this.mensaje((idFilosofo + 1), "hambriento");
        }
    }

    protected void pensar() {

        switch (idFilosofo) {
            case 0:
                filosofo1 = false;
                // this.mensaje((idFilosofo + 1), "pensando");
                break;
            case 1:
                filosofo2 = false;
                // this.mensaje((idFilosofo + 1), "pensando");
                break;
            case 2:
                filosofo3 = false;
                // this.mensaje((idFilosofo + 1), "pensando");
                break;
            case 3:
                filosofo4 = false;
                //this.mensaje((idFilosofo + 1), "pensando");
                break;
            case 4:
                filosofo5 = false;
                break;
        }
        this.mensaje((idFilosofo + 1), "pensando");

        try {
            Filosofo.sleep(tiempoAleatorio.nextInt(10000) + 100);
        } catch (InterruptedException ex) {
            System.out.println("Error en el metodo pensar(): " + ex.toString());
        }
    }

    @Override
    public void run() {
        while (true) {
            pensar();
            comer();
        }
    }
}
