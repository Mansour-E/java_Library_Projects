package info.emami;

import java.util.*;

public class Main {

    public static void main(String[] args) {



        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');

        List<Card> cardsList = Arrays.asList(cardArray);
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray));

        Card.printDeck(Arrays.asList(cardArray), "Ace of Hearts" , 1);

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size());

        Collections.addAll(cards, cardArray);
        System.out.println(cards);

        Card kingOfClub = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingOfClubs = Collections.nCopies(13, kingOfClub);
        Card.printDeck(kingOfClubs, "King of Clubs", 1);

        Collections.copy(cards, kingOfClubs);
        Card.printDeck(cards, "King Of Clubs", 1);

        cards = List.copyOf(kingOfClubs);
        Card.printDeck(cards,"List Copy of Kings", 1);


        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Collections.shuffle(deck);
        Card.printDeck(deck);

        Collections.reverse(deck);
        Card.printDeck(deck);

        var sortingAlgorithmus = Comparator.comparing(Card::rank).thenComparing(Card::suit);

        deck.sort(sortingAlgorithmus);
        //Collections.sort(deck, sortingAlgorithmus);
        Card.printDeck(deck);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "kings in deck", 1);
        System.out.println("Contains = " + kings.containsAll(kingOfClubs));
        boolean disjoint = Collections.disjoint(kings, kingOfClubs);
        System.out.println("Disjoint = " + disjoint);
        boolean disjoint2 = Collections.disjoint(kings, deck);
        System.out.println("disjoint2 = " + disjoint2);

        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlgorithmus);

        System.out.println("foundIndex = " + foundIndex);
        System.out.println("foundIndex = " + deck.indexOf(tenOfHearts));
        System.out.println(deck.get(foundIndex));

        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tenOfClubs, tenOfHearts);
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        if (Collections.replaceAll(deck, tenOfHearts, tenOfClubs)){
            System.out.println("Tens fo hearts replaced with ten of clubs");
        } else {
            System.out.println("No tens of hearts found in the list");
        }

        System.out.println("Ten of Clubs Cards = " + Collections.frequency(deck, tenOfClubs));
        System.out.println("Best Card = " + Collections.max(deck, sortingAlgorithmus));
        System.out.println("Worst Card = " + Collections.min(deck, sortingAlgorithmus));

        var sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
        deck.sort(sortBySuit);
        Card.printDeck(deck, "Sorted by Suit and Rank", 4);
        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("UnRotated: " + deck.subList(0, 13));
        System.out.println("Rotated: " + 2 + " : " + copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, -2);
        System.out.println("Rotated: " + -2 + " : " + copied);
        System.out.println("UnRotated: " + deck.subList(0, 13));

        copied = new ArrayList<>(deck.subList(0, 13));
        for (int i = 0; i < copied.size()/2; i++){
            Collections.swap(copied, i, copied.size() -1 -i);
        }
        System.out.println("Manual reverse :"+ copied);

        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.reverse(copied);
        System.out.println("Using reverse :" + copied);
    }
}
