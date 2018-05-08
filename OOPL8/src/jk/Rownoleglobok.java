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
public class Rownoleglobok extends FiguraPlaska{
    private int a,b,h;

    @Override
    public double ObliczObwod() {
        return 2*(a+b);
       }

    @Override
    public double ObliczPole() {
        return a*h;
        }

    public Rownoleglobok(int a,int b,int h) {
        this.b = b;
        this.a = a;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rownoleglobok{" + "a=" + a + ", b=" + b + ", h=" + h + '}';
    }

    
}
