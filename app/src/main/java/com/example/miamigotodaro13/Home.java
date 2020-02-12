package com.example.miamigotodaro13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity implements View.OnClickListener {

    private CardView bankCard,ideasCard,addCard,linksCard,wifiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bankCard = (CardView) findViewById(R.id.bankcardId);
        ideasCard = (CardView) findViewById(R.id.ideas_card);
        addCard = (CardView) findViewById(R.id.add_card);
        linksCard = (CardView)findViewById(R.id.links_card);
        wifiCard = (CardView)findViewById(R.id.wifi_card);
        //Añadimos click listener
        bankCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        linksCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.bankcardId: i = new Intent(this, notas .class); startActivity(i);break;
            case R.id.ideas_card: i = new Intent(this, Main3Activity .class); startActivity(i);break;
            case R.id.add_card: i = new Intent(this, creditos .class); startActivity(i);break;
            case R.id.links_card: i = new Intent(this, programa .class); startActivity(i);break;
            case R.id.wifi_card: i = new Intent(this, videos .class); startActivity(i);break;
            default:break;

        }


    }
}
