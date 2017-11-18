package com.example.petes.blackjackproject;

import com.example.petes.blackjackproject.models.Card;
import com.example.petes.blackjackproject.models.Player;
import com.example.petes.blackjackproject.models.Rank;
import com.example.petes.blackjackproject.models.Suit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by petes on 18/11/2017.
 */

public class PlayerTest {


    Player player;
    Card card;

    @Before
    public void setup() {
        player = new Player("Peter");
        card = new Card(Suit.HEARTS, Rank.NINE);
    }

    @Test
    public void playerCanGetTotalValue() {
        Card otherCard = new Card(Suit.CLUBS, Rank.FIVE);
        player.takeCard(otherCard);
        player.takeCard(card);

        assertEquals(14, player.getTotalValueOfCards());
    }

    @Test
    public void canGetName() {
        assertEquals("Peter", player.getName());
    }

    @Test
    public void playerStartsWithZeroCards() {
        assertEquals(0, player.getNumberOfCards());
    }

    @Test
    public void canTakeCard() {
        player.takeCard(card);
        assertEquals(1, player.getNumberOfCards());
    }
}
