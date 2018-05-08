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
public class Prostokat extends FiguraPlaska{
    private int a,b;

    @Override
    public double ObliczObwod() {
        return 2*(a+b);
       }

    @Override
    public double ObliczPole() {
        return a*b;
        }

    public Prostokat(int a,int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Prostokat{" + "a=" + a + ", b=" + b + '}';
    }

    
    
}
