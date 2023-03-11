/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luismendoza_lab7p2;

import java.io.Serializable;
import javax.swing.JProgressBar;

/**
 *
 * @author luiscarlomendoza
 */
public class adminBarra extends Thread implements Serializable {
    private JProgressBar barra;
    private boolean vivo;
    private boolean avanzar;
    private double size;

    public adminBarra(JProgressBar barra,double size) {
        this.barra = barra;
        vivo = true;
        avanzar = true;
        this.size = size;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    public void run(){
        while(vivo){
            if(avanzar){
                barra.setValue(barra.getValue() + 10);
                if(barra.getValue()== 100000000){
                    vivo=false;
                }                
            }
            
            
//FIN IF
            
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
        
        
    }
    
    
    
    
    
    
}
