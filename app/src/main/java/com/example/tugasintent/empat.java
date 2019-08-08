package com.example.tugasintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class empat extends AppCompatActivity implements View.OnClickListener {

    protected void onCreate (Bundle saveInstanceState){
        Button next;
        Button link;
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_isi2);
        next = (Button)findViewById(R.id.next);
        next.setOnClickListener(this);
        link = (Button)findViewById(R.id.link);
        link.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next:

                Intent nex = new Intent(empat.this, lima.class);
                startActivity(nex);
                break;

            case R.id.link:

                Intent ink = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3school.com"));
                startActivity(ink);
                break;

            default:
                break;
        }

    }
}
