package com.example.petes.blackjackproject.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.petes.blackjackproject.R;
import com.example.petes.blackjackproject.models.Game;
import com.example.petes.blackjackproject.models.GameResult;
import com.example.petes.blackjackproject.models.Player;


public class MainActivity extends AppCompatActivity {

    private boolean isRunning;

    private TextView howToPlay;
    private TextView rules;
    private TextView dealerCards;
    private TextView dealerHand;
    private TextView dealerScore;
    private TextView playerCards;
    private TextView playerHand;
    private TextView playerScore;
    private TextView result;
    private Button deal;
    private Button hit;
    private Button stand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.howToPlay = findViewById(R.id.howToPlay);
        this.rules = findViewById(R.id.rules);
        this.dealerCards = findViewById(R.id.dealerCards);
        this.dealerHand = findViewById(R.id.dealerHand);
        this.dealerScore = findViewById(R.id.dealerScore);
        this.playerCards = findViewById(R.id.playerCards);
        this.playerHand = findViewById(R.id.playerHand);
        this.playerScore = findViewById(R.id.playerScore);
        this.result = findViewById(R.id.result);
        this.deal = findViewById(R.id.dealButton);
        this.hit = findViewById(R.id.hit);
        this.stand = findViewById(R.id.stand);
        isRunning = true;

    }

    Player player = new Player("Pete");
    Player dealer = new Player("Dealer");
    Game game = new Game(player, dealer);



    public void onButtonClicked(View deal) {
            isRunning = true;
            howToPlay.setText(null);
            rules.setText(null);
            result.setText(null);
            playerCards.setText(null);
            dealerCards.setText(null);
            dealerHand.setText(null);
            playerHand.setText(null);
            player.clearHand();
            dealer.clearHand();
            GameResult gameResult = game.deal();
            final Integer playerResult = player.getTotalValueOfCards();
            final Integer dealerResult = dealer.getTotalValueOfCards();
            dealerCards.postDelayed(new Runnable() {
                @Override
                public void run() {
                    dealerCards.setText(dealer.getHand());
                }
            },1000);
            dealerHand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    dealerHand.setText(dealerResult.toString());
                }
            },1100);
            dealerScore.setText("Dealer Score");
            playerCards.postDelayed(new Runnable() {
                @Override
                public void run() {
                    playerCards.setText(player.getHand());
                }
            }, 500);
            playerHand.postDelayed(new Runnable() {
                @Override
                public void run() {
                    playerHand.setText(playerResult.toString());
                }
            }, 600);
            playerScore.setText("Your score");

        if(gameResult.isGameOver()) {
                isRunning = false;
                result.setText(gameResult.getGameText());

             }
    }

    public void onHitButtonClicked(View hit) {

        if (isRunning) {
            GameResult gameResult = game.hit();

            playerCards.setText(gameResult.getPlayerHands());
            playerHand.setText(gameResult.getPlayerTotal());

            dealerCards.setText(gameResult.getDealerHands());
            dealerHand.setText(gameResult.getDealerTotal());

            if(gameResult.isGameOver()) {
                isRunning = false;
                result.setText(gameResult.getGameText());
            }
        }
    }


    public void onStandButtonClicked(View stand) {

        if (isRunning) {
            GameResult gameResult = game.stand();

            playerCards.setText(gameResult.getPlayerHands());
            playerHand.setText(gameResult.getPlayerTotal());

            dealerCards.setText(gameResult.getDealerHands());
            dealerHand.setText(gameResult.getDealerTotal());

            if (gameResult.isGameOver()) {
                isRunning = false;
                result.setText(gameResult.getGameText());
            }
        }
    }
}
