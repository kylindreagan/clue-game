/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clue;

import javax.swing.JButton;

/**
 *
 * @author kylin
 */
public class ClueCard {
    private String img;
    private String name;
    private String description;
    private CardType type;
    
    public ClueCard(String img, String name, String description, CardType type) {
        this.img = img;
        this.name = name;
        this.description = description;
        this.type = type;
    }
    public String getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CardType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ClueCard{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
