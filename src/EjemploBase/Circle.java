/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author jrozou
 */
public class Circle extends Thread{
    private Turtle tortuga;
    private int radio;

    public Circle(Turtle tortuga, int radio) {
        this.tortuga = tortuga;
        this.radio = radio;
    }
    
    
    @Override
    public void run() {
        
    }
}
