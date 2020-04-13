package Application;

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
public class Deck extends Dealer {

    private ArrayList<Card> deck;//represents a deck of cards

    Deck(){
        deck = new ArrayList<Card>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                deck.add(new Card(i, j));
            }
        }
    }

    /*
 * Shuffles the deck by changing the indexes of 200 random pairs of cards in the deck.
     */
    public void shuffle() {
        Random random = new Random();
        Card temp;
        for (int i = 0; i < 200; i++) {
            int index1 = random.nextInt(deck.size() - 1);
            int index2 = random.nextInt(deck.size() - 1);
            temp = deck.get(index2);
            deck.set(index2, deck.get(index1));
            deck.set(index1, temp);
        }
    }

    /*
 * Draws a card from the deck.
     */
    public Card drawCard() {
        return deck.remove(0);
    }

    /**
     *
     */
    public void Shuffle() {
        addCards();
        Random random = new Random();
        int randomNumber = 0;
        for (int i = 0; i < 52; i++) {
            randomNumber = random.nextInt(deck.size());
            emptyDeck.add(deck.get(randomNumber));
            deck.remove(randomNumber);
        }
        for (int i = 0; i < 52; i++) {
            deck.add(emptyDeck.get(i));
        }
    }

    private void addCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class deck {

        private static void remove(int randomNumber) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static int size() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public deck() {
        }
    }

    private static class emptyDeck {

        private static void add(Card get) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private static Card get(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public emptyDeck() {
        }
    }

    private static class get {

        public get() {
        }
    }

}
