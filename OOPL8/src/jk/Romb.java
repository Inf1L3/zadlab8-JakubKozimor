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
public class Romb extends FiguraPlaska{
    private int a,h;

    @Override
    public double ObliczObwod() {
        return 4*a;
       }

    @Override
    public double ObliczPole() {
        return a*h;
        }

    public Romb(int h,int a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public String toString() {
        return "Romb{" + "a=" + a + ", h=" + h + '}';
    }
    
    
    
}
