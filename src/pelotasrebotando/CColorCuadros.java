/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelotasrebotando;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;

public class CColorCuadros extends Thread{
 private final ArrayList<JPanel> listaCuadrados; 
 int indice = 0;
 int delayEnMilis = 0; //tiempo en milisegundos que tarda en tarea anterior
 Color color;
              

    public CColorCuadros(ArrayList<JPanel> listaCuadrados, int delayEnMilis, Color color) {
        this.listaCuadrados = listaCuadrados;
        this.delayEnMilis=delayEnMilis;
        this.color = color;
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(delayEnMilis); 
                
                listaCuadrados.get(indice).setBackground(color);
                indice++;
            
                if( indice >= listaCuadrados.size()){
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } 
     }
  }
    
