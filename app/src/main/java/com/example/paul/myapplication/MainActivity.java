package com.example.paul.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowsView;
    private Button clickMeButton;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        windowsView = findViewById(R.id.windowViewId);

        colors = new int[]{Color.RED,Color.YELLOW,Color.GREEN,Color.BLUE,Color.MAGENTA,
            Color.BLACK, Color.WHITE};

        clickMeButton = findViewById(R.id.clickMeButton);
        clickMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int arrayLength = colors.length;

                Random random = new Random();
                int randomNum = random.nextInt(arrayLength);

                windowsView.setBackgroundColor(colors[randomNum]);
            }
        });
    }
}
