package com.example.petes.blackjackproject.models;


import java.nio.channels.AlreadyConnectedException;
import java.util.ArrayList;

import static com.example.petes.blackjackproject.models.Rank.ACE;

/**
 * Created by petes on 18/11/2017.
 */

public class Game {

    Deck deck;
    Player player;
    Player dealer;




    public Game(Player player, Player dealer) {
        this.deck = new Deck();
        this.player = player;
        this.dealer = dealer;
    }

    private void setUp() {
        this.deck = new Deck();
        this.deck.generateDeck();
        this.deck.shuffle();
    }

    public void deal() {
        this.setUp();
        for (int i = 0; i < 2; i++) {
            Card card = deck.removeCard();
            this.player.takeCard(card);

        }
        Card card = deck.removeCard();
        this.dealer.takeCard(card);
    }


    public void hit() {
        Card card = deck.removeCard();
        this.player.takeCard(card);
    }

    public void stand() {
        Card card = deck.removeCard();
        this.dealer.takeCard(card);
    }


    public String getWinner() {

         if (player.getTotalValueOfCards() > 21) {
            return("Dealer Wins");
        }
        else if (dealer.getTotalValueOfCards() > 21) {
            return "You Win!";
        }
        else if (player.getTotalValueOfCards() < dealer.getTotalValueOfCards()) {
            return("Dealer Wins!");
        }
        else if (player.getTotalValueOfCards() > dealer.getTotalValueOfCards()) {
            return ("You Win!");
        }
        else return("Push");
    }











}
