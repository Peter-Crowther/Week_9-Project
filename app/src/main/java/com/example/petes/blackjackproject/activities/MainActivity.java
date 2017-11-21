package com.example.petes.blackjackproject.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.petes.blackjackproject.R;
import com.example.petes.blackjackproject.models.Game;
import com.example.petes.blackjackproject.models.Player;

public class MainActivity extends AppCompatActivity {

    private boolean isRunning;

    private TextView dealerCards;
    private TextView dealerHand;
    private TextView playerCards;
    private TextView playerHand;
    private TextView result;
    private Button deal;
    private Button hit;
    private Button stand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.dealerCards = findViewById(R.id.dealerCards);
        this.dealerHand = findViewById(R.id.dealerHand);
        this.playerCards = findViewById(R.id.playerCards);
        this.playerHand = findViewById(R.id.playerHand);
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
            result.setText(null);
            player.clearHand();
            dealer.clearHand();
            game.deal();
            Integer playerResult = player.getTotalValueOfCards();
            Integer dealerResult = dealer.getTotalValueOfCards();
            dealerCards.setText("Dealer; " + dealer.getHand());
            dealerHand.setText(dealerResult.toString());
            playerCards.setText("Player; " + player.getHand());
            playerHand.setText(playerResult.toString());
            if (player.getTotalValueOfCards() == 21) {
                result.setText("Blackjack!");
                isRunning = false;
            }
    }

    public void onHitButtonClicked(View hit) {
        if (isRunning) {
            game.hit();
            Integer playerResult = player.getTotalValueOfCards();
            playerCards.setText("Player; " + player.getHand());
            playerHand.setText(playerResult.toString());
            //if player busts from hitting
            if (player.getTotalValueOfCards() > 21) {
                game.stand();
                Integer dealerResult = dealer.getTotalValueOfCards();
                dealerCards.setText("Dealer; " + dealer.getHand());
                dealerHand.setText(dealerResult.toString());
                result.setText(game.getWinner());
                isRunning = false;
            }

        }
    }


    public void onStandButtonClicked(View stand) {
        if (isRunning) {

            while (dealer.getTotalValueOfCards() < 17) {
                game.stand();
                Integer dealerResult = dealer.getTotalValueOfCards();
                dealerCards.setText("Dealer; " + dealer.getHand());
                dealerHand.setText(dealerResult.toString());
            }
            result.setText(game.getWinner());
            isRunning = false;
        }
    }







}
