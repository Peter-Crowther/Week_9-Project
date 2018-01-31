package com.example.petes.blackjackproject.models;

/**
 * Created by petes on 22/11/2017.
 */

public class GameResult {
   private String playerHands;
   private String playerTotal;
   private boolean isGameOver;
   private String gameText;
   private String dealerHands;
   private String dealerTotal;


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

    public void setPlayerHands(String playerHands) {
        this.playerHands = playerHands;
    }

    public void setPlayerTotal(String playerTotal) {
        this.playerTotal = playerTotal;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public void setGameText(String gameText) {
        this.gameText = gameText;
    }

    public void setDealerHands(String dealerHands) {
        this.dealerHands = dealerHands;
    }

    public void setDealerTotal(String dealerTotal) {
        this.dealerTotal = dealerTotal;
    }
}
