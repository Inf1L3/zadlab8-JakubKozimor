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
public class Walec extends FiguraPrzestrzenna{
    private int r,H;
    
    @Override
    public double ObliczObjetosc() {
        return Math.PI*r*r*H;
    }
    
    @Override
    public double ObliczPole() {
        return 2*r*H;
        }

    public Walec(int r, int H) {
        this.r = r;
        this.H = H;
    }

    @Override
    public String toString() {
        return "Walec{" + "r=" + r + ", H=" + H + '}';
    }
    
}
