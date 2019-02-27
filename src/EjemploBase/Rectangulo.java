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
public class Rectangulo extends Thread{
     private Turtle tortuga;
     private int lados1;
     private int lados2;

    public Rectangulo(Turtle tortuga, int lados1, int lados2) {
        this.tortuga = tortuga;
        this.lados1 = lados1;
        this.lados2 = lados2;
    }
    
   
    public void dibujarRectangulo() {
        for (int i = 1; i <= 4; i++) {
            if(i%2==0){
                this.tortuga.forward(this.lados2);
                this.tortuga.right(90);
            }else{
                this.tortuga.forward(this.lados1);
                this.tortuga.right(90);
            }
        }
    }
}
