/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploBase;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Estudiante
 */
public class Square{
     private Turtle tortuga;

    public Square(Turtle tortuga) {
        this.tortuga = tortuga;
    }
    public void dibujasRectangulo() {
        for (int i = 0; i < 4; i++) {
            this.tortuga.forward(50);
            this.tortuga.right(90);
        }
    }
}
