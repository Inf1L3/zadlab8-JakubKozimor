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
public class Kwadrat extends FiguraPlaska{
    private int a;

    @Override
    public double ObliczObwod() {
        return 4*a;
       }

    @Override
    public double ObliczPole() {
        return a*a;
        }

    public Kwadrat(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Kwadrat{" + "a=" + a + '}';
    }

   
    
}
