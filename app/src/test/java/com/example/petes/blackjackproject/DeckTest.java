package com.example.petes.blackjackproject;

import com.example.petes.blackjackproject.models.Card;
import com.example.petes.blackjackproject.models.Deck;
import com.example.petes.blackjackproject.models.Rank;
import com.example.petes.blackjackproject.models.Suit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by petes on 18/11/2017.
 */

public class DeckTest {

    Deck deck;

    @Before
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void canGenerateDeck(){
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canGetCard(){
        Card card = deck.removeCard();
        assertEquals(Suit.CLUBS, card.getSuit());
        assertEquals(Rank.KING, card.getRank());
    }

}
