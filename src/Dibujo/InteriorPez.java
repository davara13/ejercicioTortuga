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
        this.joe.right(90);
        this.joe.forward(25);
        this.joe.right(90);
        for (int i = 0; i < 50; i++) {
            this.joe.right(3.6);
            this.joe.forward(0.8);
        }
        this.joe.right(90);
    }
    public void Escamas(int lado1, int lado2,int x, int y){
        this.joe.setPos(x, y);
        this.joe.left(90);
        this.joe.forward(lado2/2);
        this.joe.right(90);
        this.joe.penDown();
        Rectangulo r = new Rectangulo(joe, lado1, lado2);
        r.dibujarRectangulo();   
    }
    public void Aleta(int lado){
        this.joe.setPos(25, -10);
        Triangulo t = new Triangulo(joe, lado);
        t.dibujarTriangulo();
    }
    
    public void Ojo(){
        this.joe.setPos(20, 25);
        for (int i = 0; i < 100; i++) {
            this.joe.right(3.6);
            this.joe.forward(0.2);
        }
        this.joe.setPos(20, 25);
        for (int i = 0; i < 100; i++) {
            this.joe.right(3.6);
            this.joe.forward(0.4);
        }
        this.joe.setPos(20, 15);
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
    }
}
