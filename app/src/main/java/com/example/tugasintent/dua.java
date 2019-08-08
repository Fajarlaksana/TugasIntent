package com.example.tugasintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dua extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate (Bundle saveInstanceState){
        Button masuk;
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_register);
        masuk = (Button)findViewById(R.id.masuk);
        masuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.masuk:

                Intent mask = new Intent(dua.this, tiga.class);
                startActivity(mask);
                break;
            default:
                break;
        }

    }
}
