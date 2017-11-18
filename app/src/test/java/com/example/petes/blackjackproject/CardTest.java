package com.example.petes.blackjackproject;

import org.junit.Before;

import static com.example.petes.blackjackproject.Suit.HEARTS;

/**
 * Created by petes on 18/11/2017.
 */

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.EIGHT);
    }



}
