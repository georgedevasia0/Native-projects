package com.example.smartvm;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;

public class activity_inner extends AppCompatActivity implements View.OnClickListener{
    public CardView c1,c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner);

        c1=(CardView) findViewById(R.id.c1);
        c2=(CardView) findViewById(R.id.c2);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.c1:
                i=new Intent(this,login1.class);
                startActivity(i);
                break;

            case R.id.c2:
                i=new Intent(this,register1.class);
                startActivity(i);
                break;
        }
    }
}