/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tarea;

/**
 *
 * @author "eliud"
 */
public class Cubica {
    
    public static void dibujar(Plano p){
        for(float x=-10;x<10;x+=.1){
            float y= x*x*x;
            p.dibujarPunto(x, y);
        }
    }

}
