/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pelotasrebotando;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PelotasRebotando extends JFrame {
     public static void main(String args[]) {

        //java.awt.EventQueue.invokeLater(new Runnable() {
         //  public void run() {
            EventQueue.invokeLater(() -> {
            
                JFrame ex = new FrmMenuInicial();
                ex.setVisible(true);
                });
           
           }        
        
        
        
       // });
    
     
     
     
     
     }

//    public static void main(String[] args) {
//        Circulo circulo = new Circulo();
//    }
//
//    public static class Circulo extends Frame {
//
//        public Circulo() {
//            setSize(200, 200); // establece el tamaño del frame
//            setVisible(true); // muestra el frame
//        }
//
//        public void paint(Graphics g) {
//            g.setColor(Color.RED);
//
//            // Calcula las coordenadas para el centro del círculo
//            int x = getWidth() / 2 - 50;
//            int y = getHeight() / 2 - 50;
//
//            // Dibuja el círculo
//            g.fillOval(x, y, 47, 47);
//        }
//    }
//}







    