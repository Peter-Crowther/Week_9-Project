package com.example.petes.blackjackproject.models;


import java.util.ArrayList;

/**
 * Created by petes on 18/11/2017.
 */

public class Game {

//    public ArrayList<Player> players;
    Deck deck;
    Player player;
    Player dealer;



    public Game(Player player, Player dealer) {
//        this.players = new ArrayList<Player>();
        this.deck = new Deck();
        this.player = player;
        this.dealer = dealer;


    }

//    public void addPlayer(String name) {
//        Player player1 = new Player(name);
//        this.players.add(player1);
//    }
//
//    public void addDealer(String name) {
//        Player dealer = new Player(name);
//        this.players.add(dealer);
//    }

    public void setUp() {
        deck.generateDeck();
        deck.shuffle();
//        players.add(player);
//        players.add(dealer);
    }

    public void deal() {
        Game.this.setUp();
        for (int i = 0; i < 2; i++) {
            Card card = deck.removeCard();
            this.player.takeCard(card);
//            Card card2 = deck.removeCard();
//            this.dealer.takeCard(card2);
        }
        Card card = deck.removeCard();
        this.dealer.takeCard(card);
    }

    public void hit() {
        Card card = deck.removeCard();
        this.player.takeCard(card);
    }



//    public String getWinner() {
//        Player highestHand  = players.get(0);
//
//        for (Player player : players) {
//            if (player.getTotalValueOfCards() > highestHand.getTotalValueOfCards()) {
//                highestHand = player;
//            }
//        }
//        return highestHand.getName();
//    }

    public String getWinner() {
        if (player.getTotalValueOfCards() > dealer.getTotalValueOfCards()) {
            return("You Win!");
        }
        else if (player.getTotalValueOfCards() > 21) {
            return "Dealer Wins";
        }
        else if (dealer.getTotalValueOfCards() > 21) {
            return "You Win";
        }
        else if (player.getTotalValueOfCards() < dealer.getTotalValueOfCards()) {
            return("Dealer Wins!");
        }
        else return("Draw");
    }








}
