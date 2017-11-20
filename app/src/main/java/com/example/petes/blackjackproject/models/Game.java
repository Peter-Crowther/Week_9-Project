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



    public Game() {
//        this.players = new ArrayList<Player>();
        this.deck = new Deck();
        this.player = new Player();
        this.dealer = new Player();


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
            player.takeCard(card);
            dealer.takeCard(card);
        }

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










}
