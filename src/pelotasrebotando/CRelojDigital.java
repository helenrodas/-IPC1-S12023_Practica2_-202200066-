/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelotasrebotando;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CRelojDigital extends Observable implements Runnable {
    
private int horas, minutos, segundos;
private boolean isRunning = true;

    public CRelojDigital(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    }
    
    public void stop() {
        isRunning = false;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void run() {

        String tiempo;
        try {
            while (isRunning) {

                tiempo = "";

                if (horas < 10) {
                    tiempo += "0" + horas;
                } else {
                    tiempo += horas;
                }

                tiempo += ":";

                if (minutos < 10) {
                    tiempo += "0" + minutos;
                } else {
                    tiempo += minutos;
                }

                tiempo += ":";

                if (segundos < 10) {
                    tiempo += "0" + segundos;
                } else {
                    tiempo += segundos;
                }

                this.setChanged();
                this.notifyObservers(tiempo);
                this.clearChanged();
                Thread.sleep(1000);

                segundos++;

                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) {
                            horas = 0;
                        }
                    }
                }

            }
        } catch (InterruptedException ex) {
            Logger.getLogger(CRelojDigital.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
