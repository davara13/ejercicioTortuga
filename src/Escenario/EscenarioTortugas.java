/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escenario;

import Dibujo.InteriorPez;
import ch.aplu.turtle.Turtle;
import ch.aplu.turtle.TurtleFrame;
import java.awt.Color;
import java.awt.Rectangle;

/**
 *
 * @author Estudiante
 */
public class EscenarioTortugas extends TurtleFrame{
    Turtle tortuga1 = null;
    Turtle tortuga2 = null;
    
    public EscenarioTortugas() {
      tortuga1 = new Turtle(this);
      
    }
    
    public void iniciar(){
       InteriorPez hilo1 = new InteriorPez(tortuga1);
       hilo1.run();
       
    }
    
    
    public static void main(String[] args) {
        EscenarioTortugas escenario = new EscenarioTortugas();
        escenario.iniciar();
        
    }
}
