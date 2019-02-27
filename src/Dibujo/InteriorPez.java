/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dibujo;

import Figuras.Rectangulo;
import Figuras.Triangulo;
import ch.aplu.turtle.Turtle;
import java.awt.Color;

/**
 *
 * @author jrozou
 */
public class InteriorPez extends Thread{
    private Turtle joe;

    public InteriorPez(Turtle joe) {
        this.joe = joe;
    }
    
    public void Boca(){
        double j;
        this.joe.right(90);
        this.joe.forward(25);
        this.joe.right(90);
        this.joe.penUp();
        this.joe.setPos(50.5, 12.5);
        for (int i = 0; i < 50; i++) {
            j=3.6*i;
            if(j>45 && j< 135){
                this.joe.penDown();
            }else{
                this.joe.penUp();
            }
            this.joe.right(3.6);
            this.joe.forward(1.11);
        }
        this.joe.right(90);
    }
    public void Escamas(int lado1, int lado2,int x, int y){
        this.joe.setPos(x+20, y);
        this.joe.left(90);
        this.joe.forward(lado2/2);
        this.joe.right(90);
        this.joe.penDown();
        Rectangulo r = new Rectangulo(joe, lado1, lado2);
        r.dibujarRectangulo();   
    }
    public void Aleta(int lado){
        this.joe.setPos(25+25, -10);
        Triangulo t = new Triangulo(joe, lado);
        t.dibujarTriangulo();
    }
    
    public void Ojo(){
        this.joe.setPos(20+30, 15);
        for (int i = 0; i < 100; i++) {
            this.joe.right(3.6);
            this.joe.forward(0.2);
        }
        this.joe.setPos(20+30, 15);
        for (int i = 0; i < 100; i++) {
            this.joe.right(3.6);
            this.joe.forward(0.4);
        }
        this.joe.setPos(20+30, 5);
        this.joe.fill();
    }
    @Override
    public void run() {
        Boca();     
        Escamas(3,30,50,0);
        Escamas(3,20,55,0);
        Escamas(3,10,60,0);
        Aleta(16);
        Ojo();
        this.joe.setPos(0, 0);
        joe.hideTurtle();
    }
}
