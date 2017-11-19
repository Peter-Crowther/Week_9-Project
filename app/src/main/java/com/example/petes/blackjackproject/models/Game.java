package com.example.petes.blackjackproject.models;


import java.util.ArrayList;

/**
 * Created by petes on 18/11/2017.
 */

public class Game {

    public ArrayList<Player> players;


    public Game() {
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(String name) {
        Player player = new Player(name);
        this.players.add(player);
    }

    public void addDealer(String name) {
        Player dealer = new Player(name);
        this.players.add(dealer);
    }

    public String getWinner() {
        Player highestHand  = players.get(0);

        for (Player player : players) {
            if (player.getTotalValueOfCards() > highestHand.getTotalValueOfCards()) {
                highestHand = player;
            }
        }
        return highestHand.getName();
    }









}
