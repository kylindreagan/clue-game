/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clue;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author kylin
 */
public class Space {
    private boolean occupied;
    private Person occupant;
    private JButton button;
    private boolean isRoomSpace;
    private int col;
    private int row;
    
public Space(JButton button, boolean isRoomSpace, int row, int col) {
        this.occupied = false;
        this.occupant = null;
        this.button = button;
        this.isRoomSpace = isRoomSpace;
        this.row = row;
        this.col = col;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
        if (this.occupant != null && occupied) {
            if (this.occupant.getOccupantColor() == Color.red) {
                this.button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/redpeg.png")));
            }
        }
        if (!occupied) {
            this.button.setIcon(null);
        }
    }

    public Person getOccupant() {
        return this.occupant;
    }

    public void setOccupant(Person occupant) {
        this.occupant = occupant;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public boolean isRoomSpace() {
        return isRoomSpace;
    }

    public void setRoomSpace(boolean isRoomSpace) {
        this.isRoomSpace = isRoomSpace;
    }
    
    public int getRow(){
        return this.row;
    }
    
    public int getCol(){
        return this.col;
    }
    
    @Override
    public String toString() {
        return "(" + Integer.toString(this.col) + "," + Integer.toString(this.row) + ")";
    }
}
