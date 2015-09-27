/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week9;

/**
 *
 * @author Student Lab
 */
public class Card { 
    private int rank; 
    private int suit; 
    private static String[] suits = { "hearts", "spades", "diamonds", "clubs" }; 
    private static String[] colors = { "hearts", "spades", "diamonds", "clubs" }; 
    private static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" }; 


 Card(int suit, int rank) 
 { 
  this.rank=rank; 
  this.suit=suit; 
 } 

 public @Override String toString() 
 { 
    return ranks[rank] + " of " + suits[suit]; 
 } 

 public int getRank() { 
   return rank; 
 } 

 public int getSuit() { 
  return suit; 
 } 

}
