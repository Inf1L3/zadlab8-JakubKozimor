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
public class Trapez extends FiguraPlaska{
    private int a,b,h,c,d;

    @Override
    public double ObliczObwod() {
        return a+b+c+d;
       }

    @Override
    public double ObliczPole() {
        return ((a+b)*h)/2;
        }

    public Trapez(int a, int b, int h, int c, int d) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Trapez{" + "a=" + a + ", b=" + b + ", h=" + h + ", c=" + c + ", d=" + d + '}';
    }

    

    
    
}
