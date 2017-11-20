package com.example.petes.blackjackproject;

import com.example.petes.blackjackproject.models.Card;
import com.example.petes.blackjackproject.models.Game;
import com.example.petes.blackjackproject.models.Player;
import com.example.petes.blackjackproject.models.Rank;

import org.junit.Before;
import org.junit.Test;

import static com.example.petes.blackjackproject.models.Suit.DIAMONDS;
import static com.example.petes.blackjackproject.models.Suit.HEARTS;
import static com.example.petes.blackjackproject.models.Suit.SPADES;
import static junit.framework.Assert.assertEquals;

/**
 * Created by petes on 19/11/2017.
 */

public class GameTest {

    Game game;
    Card card1;
    Card card2;
    Card card3;
    Card card4;

    @Before
    public void before(){
        game = new Game();
        card1 = new Card(HEARTS, Rank.FIVE );
        card2 = new Card(DIAMONDS, Rank.NINE);
        card3 = new Card(HEARTS, Rank.FOUR);
        card4 = new Card(SPADES, Rank.SIX);
    }

    @Test
    public void testAddPlayer() {
        game.addPlayer("Peter");
        assertEquals(1, game.players.size());
    }

    @Test
    public void testAddDealer() {
        game.addDealer("Dealer");
        assertEquals(1, game.players.size());
    }


    @Test
    public void testWinner() {
        Player player1 = new Player("Peter");
        Player player2 = new Player("Dealer");
        game.addPlayer("Peter");
        game.addPlayer("Dealer");
        player1.takeCard(card1);
        player1.takeCard(card2);
        player2.takeCard(card3);
        player2.takeCard(card4);

        assertEquals("Peter", game.getWinner());
    }
}
