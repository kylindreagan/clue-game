/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clue;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kylin
 */
public class AIPlayer {
    private Person character;
    private Set<ClueCard> cards;
    private Set<ClueCard> unseen;
    
    
    public AIPlayer(Person character, Set<ClueCard> cards, Set<ClueCard> unseen){
        this.character = character;
        this.cards = cards;
        this.unseen = unseen;
        this.unseen.removeAll(cards);
    }
    
    public Person getCharacter() {
        return this.character;
    }
    
    public Space getLocation() {
        return this.character.getCurrSpace();
    }
    
    public void addSeenCard(ClueCard card){
        this.unseen.remove(card);
    }
    
    public void removeCardFromHand(ClueCard card) {
        //only use if card "laid face up on table"
        this.cards.remove(card);
    }
    
    public Space makeMove(List<List<Space>> board, List<Space> rooms, int num_rolls) {
        Space curr_space = this.getLocation()
;        if (!curr_space.isRoomSpace()){
            int roll = maingamehelpers.dice_roll();
            List<Space> possible = maingamehelpers.get_available(board, curr_space.getRow(), curr_space.getCol(), board.size(), board.getFirst().size(), roll, this.character);
            Space closest = maingamehelpers.find_closest(possible, rooms);
            return closest;
        }
        else {
            return this.character.getCurrSpace();
        }
    }
    
    @Override
    public String toString() {
        return this.character.getName();
    }
}
