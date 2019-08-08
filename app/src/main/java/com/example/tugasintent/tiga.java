package com.example.tugasintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class tiga extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate (Bundle saveInstanceState){
        Button awan;
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_isi1);
        awan = (Button)findViewById(R.id.awan);
        awan.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.awan:

                Intent aw = new Intent(tiga.this, empat.class);
                startActivity(aw);
                break;
            default:
                break;
        }

    }

}
