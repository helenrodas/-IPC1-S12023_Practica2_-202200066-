/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelotasrebotando;

import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class CBolaInicial extends Thread {
    private JLabel label;
    private int count;
    private int totalPelotasIniciadas = 30;
    private final int duracionSleep =1000;
    private JTextField txtLog;
    private JTextField txtContadorInicio;
    

    public CBolaInicial(JLabel label, JTextField txtContadorInicio) {
        this.label = label;
        this.txtLog = txtLog;
        this.txtContadorInicio = txtContadorInicio;
        
    }

    public void run() {
        label.setVisible(true);
        count = 1;
        totalPelotasIniciadas = 61;
        while (count <= 60 && totalPelotasIniciadas>-1) {
            try {
                Thread.sleep(500);
                
                count++;
                totalPelotasIniciadas--;
                //txtLog.setText(String.valueOf(count));
                
                txtContadorInicio.setText(String.valueOf(totalPelotasIniciadas/2));
                
                label.setVisible(!label.isVisible());
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        label.setVisible(false);
    }
}
