/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author jrozou
 */
public class Triangulo{
    private Turtle tortuga;
    private int lado;

    public Triangulo(Turtle tortuga, int lado) {
        this.tortuga = tortuga;
        this.lado = lado;
    }
    
    public void dibujarTriangulo() {
        for (int i = 0; i < 3; i++) {
            this.tortuga.forward(this.lado);
            this.tortuga.right(120);
        }
    }
}
