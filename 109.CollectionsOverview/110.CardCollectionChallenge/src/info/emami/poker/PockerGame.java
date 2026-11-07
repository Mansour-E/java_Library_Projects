package info.emami.poker;

import info.emami.Card;

import java.util.*;
import java.util.function.Consumer;

import static java.lang.Math.random;

public class PockerGame {

    private List<Card> deck = Card.getStandardDeck();
    private List<PockerHand> pockerHands;
    private int playerCount;
    private int cardInHand;
    private List<Card> remainingCards;

    public PockerGame(int playerCount, int cardInHand){
        this.playerCount = playerCount;
        this.cardInHand = cardInHand;
        pockerHands = new ArrayList<>(cardInHand);
    }

    public void startPlay(){
        Collections.shuffle(deck);
        Card.printDeck(deck);
        int randomMiddle = new Random().nextInt(15, 26);
        Collections.rotate(deck, 26);
        Card.printDeck(deck);

        deal();
        System.out.println("-----------------------------");
        Consumer<PockerHand> checkHand = PockerHand::evalHand;
        pockerHands.forEach(checkHand.andThen(System.out::println));

        int cardsDealt = playerCount * cardInHand;
        int cardsRemaining = deck.size() - cardsDealt;

        remainingCards = new ArrayList<>(deck.subList(cardsDealt, deck.size()));
        //remainingCards = new ArrayList<>(cardsRemaining);
        //remainingCards = new ArrayList<>(Collections.nCopies(cardsRemaining, null));
        //remainingCards.replaceAll(c -> deck.get(cardsDealt + remainingCards.indexOf(c)));
        Card.printDeck(remainingCards, "Remaining Cards", 2);

    }

    private void deal(){

        Card[][] hands = new Card[playerCount][cardInHand];
        for(int deckIndex = 0, i=0; i<cardInHand; i++){
            for (int j=0; j<playerCount; j++){
                hands[j][i] = deck.get(deckIndex++);
            }
        }

        int playerNo = 1;
        for (Card[] hand: hands){
            pockerHands.add(new PockerHand(playerNo++, Arrays.asList(hand)));
        }


    }




}
