/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelotasrebotando;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */

public class CBolaFinal extends Thread {
    private JLabel label;
    private int count;
    private int totalPelotasIniciadas = 30;
    private JTextField txtLog;
    private JTextField txtContadorFinal;
    private int tiempo;
    private CRelojDigital reloj;

    public CBolaFinal(JLabel label,  JTextField txtContadorFinal, int tiempo, CRelojDigital reloj) {
        this.label = label;
        this.txtLog = txtLog;
        this.txtContadorFinal = txtContadorFinal;
        this.tiempo = tiempo;
        this.reloj = reloj;
    }

    public void run() {
        label.setVisible(false);
        count = 0;
        while (count <= 29) {
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            txtContadorFinal.setText(String.valueOf(count));
            label.setVisible(!label.isVisible());

            if (count == totalPelotasIniciadas) {
                reloj.stop();
                break;
            }
        }
        label.setVisible(true);
    }
}

