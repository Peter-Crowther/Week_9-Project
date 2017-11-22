package com.example.petes.blackjackproject.models;

import java.util.ArrayList;

import static com.example.petes.blackjackproject.models.Rank.ACE;

/**
 * Created by petes on 18/11/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> cards;

    public Player(String name) {
        this.name = name;
        this.cards = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public int getTotalValueOfCards() {
        int value = 0;
        boolean ace = false;

        for (Card card: this.cards) {
            int cardValue = card.getValue();
            if (cardValue == 1) {
                ace = true;
            }
            value = value + cardValue;
        }

        if (ace  &&  value + 10 <= 21)
            value = value + 10;

        return value;
    }

    public int getNumberOfCards() {
        return this.cards.size();
    }

    public void takeCard(Card card){
        this.cards.add(card);
    }


    public String getHand() {
        String handCard = "";

        for (Card card : this.cards) {
            String value = card.getRank().toString() + " ";
            String suit = card.getSuitValue() + "; \n";
            handCard += value + suit;
        }
        return handCard;
    }



    public void clearHand() {
        this.cards.clear();
    }






}
