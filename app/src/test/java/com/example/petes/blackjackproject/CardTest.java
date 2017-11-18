package com.example.petes.blackjackproject;

import com.example.petes.blackjackproject.models.Card;
import com.example.petes.blackjackproject.models.Rank;
import com.example.petes.blackjackproject.models.Suit;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by petes on 18/11/2017.
 */

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.EIGHT);
    }

    @Test
    public void testCardValue() {
        assertEquals(8, card.getValue());
    }



}
