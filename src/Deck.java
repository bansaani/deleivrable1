/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Random;
/*
 * Creates and shuffles a deck of 52 playing cards.
 */
/**
 *
 * @author anish
 */
public class Deck {
    private ArrayList<Card> deck;//represents a deck of cards
Deck()
{
    deck = new ArrayList<Card>();
    for(int i=0; i<4; i++)
    {
        for(int j=1; j<=13; j++)
        {
            deck.add(new Card(i,j));
        }
    }
}
/*
 * Shuffles the deck by changing the indexes of 200 random pairs of cards in the deck.
 */
public void shuffle()
{
    Random random = new Random();
    Card temp;
     for(int i=0; i<200; i++)
    {
        int index1 = random.nextInt(deck.size()-1);
        int index2 = random.nextInt(deck.size()-1);
        temp = deck.get(index2);
        deck.set(index2, deck.get(index1));
        deck.set(index1, temp);
    }
}
/*
 * Draws a card from the deck.
 */
public Card drawCard()
{
    return deck.remove(0);
}
}
