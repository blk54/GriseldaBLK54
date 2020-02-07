package com.blk54.griseldablk54;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GriseldaMemeber BennyTheButcher = new GriseldaMemeber();
        GriseldaMemeber ConwayTheMachine = new GriseldaMemeber();
        GriseldaMemeber WestsideGunn = new GriseldaMemeber();
    }
}
