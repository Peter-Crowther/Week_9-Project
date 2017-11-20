package com.example.petes.blackjackproject.models;

/**
 * Created by petes on 18/11/2017.
 */

public enum Suit {
    CLUBS("of Clubs"),
    SPADES("of Spades"),
    HEARTS("of Hearts"),
    DIAMONDS("of Diamonds");


    private String value;

    Suit(String value){
        this.value = value;
    }

    public String getSuitValue() {
        return value;
    }
}
