package com.example.iem.tp_git;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Button createButton;
    public Button listButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createButton = (Button) findViewById(R.id.createButton);
        listButton = (Button) findViewById(R.id.listButton);
        createButton.setOnClickListener(this);
        listButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            if(view.getId() == createButton.getId())
            {
                // Create button
            }
            if(view.getId() == listButton.getId())
            {
                // Show recherche Activity
            }
    }
}
