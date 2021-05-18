// Taha Afzal
// tafzal18@ole.augie.edu
// DeckOfCards.java

package deckofcards;
import java.util.Random;
import java.util.Scanner;
public class DeckOfCards
{
    private String[] rank;
    private String[] suit;
    private int top;
    
    /* Description: No-argument constructor initializes this DeckOfCards to a 
                    new deck.
       Post       : This DeckOfCards initialized to a new deck; the cards are
                    ordered from AceSpace to KingDiamond as in a new deck; top
                    initialized to 0. */
    public DeckOfCards()
    {
        rank = new String[52];
        suit = new String[52];
        top = 0;
        
        for (int j = 0; j < 4; j++)
        {
            rank[0 + 13*j] = "Ace";
            rank[1 + 13*j] = "Two";
            rank[2 + 13*j] = "Three";
            rank[3 + 13*j] = "Four";
            rank[4 + 13*j] = "Five";
            rank[5 + 13*j] = "Six";
            rank[6 + 13*j] = "Seven";
            rank[7 + 13*j] = "Eight";
            rank[8 + 13*j] = "Nine";
            rank[9 + 13*j] = "Ten";
            rank[10 + 13*j] = "Jack";
            rank[11 + 13*j] = "Queen";
            rank[12 + 13*j] = "King";
        }
        
        for (int j = 0; j < 13; j++)
            suit[j] = "Spade";
        for (int j = 13; j < 26; j++)
            suit[j] = "Heart";
        for (int j = 26; j < 39; j++)
            suit[j] = "Diamond";
        for (int j = 39; j < 52; j++)
            suit[j] = "Club";
    }
    
    /* Description: This DeckOfCards is randomly and thoroughly shuffled.
       Post       : This DeckOfCards thoroughly shuffled; top set to 0. */
    public void shuffle()
    {
        Random r = new Random();
        top = 0;
        
        for (int j = 0; j < 10000; j++)
        {
            int x = r.nextInt(52);
            int y = r.nextInt(52);
            
            String temp = rank[x];
            rank [x] = rank[y];
            rank[y] = temp;
            
            temp = suit[x];
            suit[x]= suit[y];
            suit[y] = temp;
        }
    }
    
    /* Description: This method deals the top card.
       Post       : Top incremented by 1.
       Return     : The top card of this DeckOfCards as a String such as 
                    "AceHeart", "TwoSpade", "TenDiamond", "KingClub". 
                    If top >= 52, "NoMoreCard" is returned. */
    public String deal()
    {
        String card;
        
        if (top < 52)
            card = rank[top] + suit[top];
        else
            card = "NoMoreCard";
        
        top++;
        
        return card;
    }
}