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

    private TextView dealerHand;
    private TextView playerHand;
    private TextView result;
    private Button deal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.dealerHand = findViewById(R.id.dealerHand);
        this.playerHand = findViewById(R.id.playerHand);
        this.result = findViewById(R.id.result);
        this.deal = findViewById(R.id.dealButton);

    }

    public void onButtonClicked(View deal) {

        Player player = new Player("Pete");
        Player dealer = new Player("Dealer");
        Game game = new Game(player, dealer);
        game.deal();
        Integer playerResult = player.getTotalValueOfCards();
        Integer dealerResult = dealer.getTotalValueOfCards();
        dealerHand.setText(dealerResult.toString());
        playerHand.setText(playerResult.toString());
        result.setText(game.getWinner());
    }






}
