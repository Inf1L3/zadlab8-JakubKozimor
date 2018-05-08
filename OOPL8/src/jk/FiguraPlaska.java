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
public abstract class FiguraPlaska extends FiguraGeometryczna{
    public FiguraPlaska() {
    }
    
    
    
    @Override
     abstract double ObliczPole();
    
     abstract double ObliczObwod();

   @Override
    public String toString() {
        return "Obliczanie parametrów figury p³askiej: ";
}
}
