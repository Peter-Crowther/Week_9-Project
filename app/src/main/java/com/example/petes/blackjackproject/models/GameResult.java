package com.example.petes.blackjackproject.models;

/**
 * Created by petes on 22/11/2017.
 */

public class GameResult {
    String playerHands;
    String playerTotal;
    boolean isGameOver;
    String gameText;
    String dealerHands;
    String dealerTotal;


    public GameResult() {
        this.playerHands = playerHands;
        this.playerTotal = playerTotal;
        this.isGameOver = isGameOver;
        this.gameText = gameText;
        this.dealerHands = dealerHands;
        this.dealerTotal = dealerTotal;
    }

    public String getPlayerHands() {
        return playerHands;
    }

    public String getPlayerTotal() {
        return playerTotal;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public String getGameText() {
        return gameText;
    }

    public String getDealerHands() {
        return dealerHands;
    }

    public String getDealerTotal() {
        return dealerTotal;
    }
}
