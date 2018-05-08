/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jk;

/**
 *
 * @author Jakub
 */
public class Stozek extends FiguraPrzestrzenna{
    private int r,h,l;
    
    @Override
    public double ObliczObjetosc() {
        return (1/3)*Math.PI*r*h;
    }
    
    @Override
    public double ObliczPole() {
        return Math.PI*2*Math.PI*l;
        }

    public Stozek(int r, int h, int l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    @Override
    public String toString() {
        return "Stozek{" + "r=" + r + ", h=" + h + ", l=" + l + '}';
    }
    
}
