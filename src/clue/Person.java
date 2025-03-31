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
    
    public Person(Color occupantColor, String Name, Space CurrSpace) {
        this.occupantColor =  occupantColor;
        this.Name = Name;
        this.CurrSpace = CurrSpace;
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
}
