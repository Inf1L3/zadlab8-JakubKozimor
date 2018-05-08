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
public class Kula extends FiguraPrzestrzenna{
    private int r;
    
    @Override
    public double ObliczObjetosc() {
        return (4/3)*Math.PI*r*r*r;
    }
    
    @Override
    public double ObliczPole() {
        return 4*Math.PI*r*r;
        }

    public Kula(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() +"Kula{" + "r=" + r + '}' + "Pole: " + ObliczPole() + " Objêtoœæ: " + ObliczObjetosc();
    }
}
