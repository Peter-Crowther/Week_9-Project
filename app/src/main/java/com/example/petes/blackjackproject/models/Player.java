package com.example.petes.blackjackproject.models;

import java.util.ArrayList;

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

}
