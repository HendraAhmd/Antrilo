package com.puterabaritoinnovation.loginui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class LoginaActivity extends AppCompatActivity {

    Spinner spinner;
    private CardView cardView;
    private Animation animation_fadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logina);

        Utils.blackIconStatusBar(LoginaActivity.this, R.color.light_Background);

        cardView = findViewById(R.id.cv);
        spinner = findViewById(R.id.choosebank);

        animation_fadein = AnimationUtils.loadAnimation(LoginaActivity.this, R.anim.fadein);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                cardView.setVisibility(View.VISIBLE);
                cardView.setAnimation(animation_fadein);
            }
        }, 2000);

        String[] value = {"Bank BRI Simpang Pelajar", "Bank BRI Simpang DPR"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(value));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.style_spinner, arrayList);
        spinner.setAdapter(arrayAdapter);

    }
}