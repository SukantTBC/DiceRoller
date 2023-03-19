package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button);
        TextView resultTextView = findViewById(R.id.textView);


        rollButton.setOnClickListener(
                view -> {
                    Toast DiceRollToast = Toast.makeText(MainActivity.this, "Dice Rolled!", Toast.LENGTH_SHORT);
                    DiceRollToast.show();
                    int number = new Random().nextInt(6);
                    number+=1;
                    resultTextView.setText("6");
                    resultTextView.setText(String.valueOf(number));
                }
        );

    }
}