package info.emami;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck, "deck", 4);
        Collections.shuffle(deck);

        Card.printDeck(deck, "deck", 4);

        List<Card> player1 = new ArrayList<>(deck.subList(0, 5));
        List<Card> player2 = new ArrayList<>(deck.subList(5, 10));

        Card.printDeck(player1, "player1", 1);
        Card.printDeck(player2, "player2", 1);
    }
}
