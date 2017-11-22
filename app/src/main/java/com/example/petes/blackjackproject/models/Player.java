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
        int totalValue = 0;

        for(Card card : this.cards) {
            totalValue += card.getValue();
        }

        return totalValue;
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

    public boolean hasAce() {
        for (Card card : cards) {
            if (card.getRank() == ACE){
            }
        }
        return true;
    }




}
