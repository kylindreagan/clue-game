/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author kylin
 */
public class maingamehelpers {
    public static List<Space> get_available(List<List<Space>> board, int start_row, int start_col, int rows, int cols, int roll, Person player){
        List<Space> possible = new ArrayList<>();
        boolean[][] visited = new boolean[rows][cols];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start_row, start_col, 0}); // {row, col, movesUsed}
        visited[start_row][start_col] = true;
        
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0], c = current[1], moves = current[2];
            if (moves <= roll) {
                possible.add(board.get(r).get(c));
            }
            if (moves == roll) continue; // Stop if max dice moves reached
            

            for (int[] dir : directions) {
                int newRow = r + dir[0];
                int newCol = c + dir[1];
                if (isValidMove(board, newRow, newCol, rows, cols, visited, player)) {
                    queue.add(new int[]{newRow, newCol, moves + 1});
                    visited[newRow][newCol] = true;
                }
            }
            
        }
        
        return possible;
    }
    
    public static int dice_roll() {
        Random random = new Random();

        // 1 will be magnifying glass
        int randomInt = random.nextInt(1,6);
        return randomInt;
    }
    
     private static boolean isValidMove(List<List<Space>> board, int row, int col, int rows, int cols, boolean[][] visited, Person player) {
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            Space curr_space = board.get(row).get(col);
            return !visited[row][col] && curr_space != null && (!curr_space.isOccupied()||curr_space.getOccupant()==player);
        }
        else {
            return false;
        }
    }
     
    public static Space find_closest(List<Space> possible_locations, List<Space> rooms) {
        Space closest = null;
        int minDistance = Integer.MAX_VALUE;
        for (Space p: possible_locations) {
            for (Space s: rooms) {
                if (p == s){
                    return p;
                }
                else{
                    int distance = Math.abs(p.getCol()-s.getCol()) + Math.abs(p.getRow()-s.getRow());
                    if (distance < minDistance) {
                        minDistance = distance;
                        closest = p;
                    }
                }
            }
        }
        return closest;
    }
     
     
}
