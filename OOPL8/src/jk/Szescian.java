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
public class Szescian extends FiguraPrzestrzenna{
    private int a;
    
    @Override
    public double ObliczObjetosc() {
        return a*a*a;
    }
    
    @Override
    public double ObliczPole() {
        return 6*a*a;
        }

    public Szescian(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Szescian{" + "a=" + a + '}';
    }
    
}
