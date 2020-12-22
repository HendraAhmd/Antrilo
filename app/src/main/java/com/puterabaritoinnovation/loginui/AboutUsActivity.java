package com.puterabaritoinnovation.loginui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        Utils.blackIconStatusBar(AboutUsActivity.this, R.color.light_Background);

    }
}