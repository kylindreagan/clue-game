/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clue;

import java.awt.Color;

/**
 *
 * @author kylin
 */
public class Person {
     private Color occupantColor;
     private String Name;
     private Space CurrSpace;
     private boolean player;
     private boolean inGame;
    
    public Person(Color occupantColor, String Name, Space CurrSpace, boolean player, boolean game) {
        this.occupantColor =  occupantColor;
        this.Name = Name;
        this.CurrSpace = CurrSpace;
        this.player = player;
        this.inGame = game;
    }
     
     
    public Color getOccupantColor() {
        return occupantColor;
    }

    public void setOccupantColor(Color occupantColor) {
        this.occupantColor = occupantColor;
    }
    
    public String getName() {
        return this.Name;
    }
    
    public void setName(String name) {
        this.Name = name;
    }
    
    public Space getCurrSpace() {
        return this.CurrSpace;
    }
    
    public void setCurrSpace(Space space) {
        this.CurrSpace = space;
    }
    
    public void personKiller(){
        //for wrong guesses
        this.inGame = false;
    }
    
    public boolean isActive() {
        return this.inGame;
    }
    
    public boolean isPlayer() {
        return this.player;
    }
    
    @Override
    public String toString() {
        return this.Name;
    }
}
