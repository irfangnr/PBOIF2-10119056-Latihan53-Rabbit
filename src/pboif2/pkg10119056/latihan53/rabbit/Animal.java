/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan53.rabbit;

/**
 *
 * @author ACER
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    int noOfLegs;
    
    Animal(boolean vegeratian, String food, int legs){
        this.vegetarian=vegetarian;
        this.noOfLegs=legs;
        this.eats=food;
    }
    boolean isVegetarian(){
        return true;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }
    
    
}
