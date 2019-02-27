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
public class Interior extends Thread{
    private Turtle joe;

    public Interior(Turtle joe) {
        this.joe = joe;
    }
    
    public void Boca(){
        this.joe.penUp();
        //this.joe.right(90);
        this.joe.forward(50);
        
        
    }
    public void Escamas(int l, int l2){
        this.joe.left(90);
        this.joe.forward(l2/2);
        this.joe.right(90);
        this.joe.penDown();
        Rectangulo r = new Rectangulo(joe, l, l2);
        r.dibujarRectangulo();
        this.joe.right(90);
        this.joe.penUp();
        this.joe.forward(l2/2);
        this.joe.left(90);
        this.joe.penUp();
        this.joe.forward(5);
        
    }
    public void Aleta(int l){
        this.joe.setPos(55, -10);
        this.joe.right(180);
    }
    @Override
    public void run() {
        this.joe.right(90);
        Boca();       
        Escamas(3,30);
        Escamas(3,20);
        Escamas(3,10);
        
    }
}
