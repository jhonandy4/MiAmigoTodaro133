package com.example.miamigotodaro13;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Banderita extends AppCompatActivity {


    Button b_answers1, b_answers2, b_answers3, b_answers4;

    ImageView iv_flags;

    List<BanderaCountryItem> list;

    Random r;
    int turn = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bandera_activity_main);

        r = new Random();

        iv_flags = (ImageView)findViewById(R.id.iv_flags);

        b_answers1 = (Button)findViewById(R.id.btn_2);
        b_answers2 = (Button)findViewById(R.id.btn_3);
        b_answers3 = (Button)findViewById(R.id.btn_1);
        b_answers4 = (Button)findViewById(R.id.btn_4);

        list = new ArrayList<>();

        //add all flags and names to the list
        for (int i = 0; i < new BanderasDatabase().answers.length; i++){
            list.add(new BanderaCountryItem(new BanderasDatabase().answers[i], new BanderasDatabase().flags[i]));

        }

        //shuffle the countries
        Collections.shuffle(list);

        newQuestion(turn);

        b_answers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if the answer is correct
                if(b_answers1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(Banderita.this, "Correct", Toast.LENGTH_SHORT).show();

                    //check if the last question
                    if (turn < list.size()){
                        turn++;
                        newQuestion(turn);

                    } else {
                        Toast.makeText(Banderita.this, "You finished the game", Toast.LENGTH_SHORT).show();

                    }

                } else {
                    Toast.makeText(Banderita.this, "Wrong", Toast.LENGTH_SHORT).show();

                    //Toast.makeText(Banderita.this, "You ost the game", Toast.LENGTH_SHORT).show();
                    //Intent intent=new Intent(getApplicationContext(),Banderita.class);
                    //startActivity(intent);
                    //finish();


                }

            }
        });


        b_answers2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//check if the answer is correct
                if(b_answers2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(Banderita.this, "Correct", Toast.LENGTH_SHORT).show();

                    //check if the last question
                    if (turn < list.size()){
                        turn++;
                        newQuestion(turn);

                    } else {
                        Toast.makeText(Banderita.this, "You finished the game", Toast.LENGTH_SHORT).show();

                    }

                } else {
                    Toast.makeText(Banderita.this, "Wrong", Toast.LENGTH_SHORT).show();


                }
            }
        });

        b_answers3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//check if the answer is correct
                if(b_answers3.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(Banderita.this, "Correct", Toast.LENGTH_SHORT).show();

                    //check if the last question
                    if (turn < list.size()){
                        turn++;
                        newQuestion(turn);

                    } else {
                        Toast.makeText(Banderita.this, "You finished the game", Toast.LENGTH_SHORT).show();

                    }

                } else {
                    Toast.makeText(Banderita.this, "Wrong", Toast.LENGTH_SHORT).show();


                }
            }
        });
        b_answers4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//check if the answer is correct
                if(b_answers4.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())){
                    Toast.makeText(Banderita.this, "Correct", Toast.LENGTH_SHORT).show();

                    //check if the last question
                    if (turn < list.size()){
                        turn++;
                        newQuestion(turn);

                    } else {
                        Toast.makeText(Banderita.this, "You finished the game", Toast.LENGTH_SHORT).show();

                    }

                } else {
                    Toast.makeText(Banderita.this, "Wrong", Toast.LENGTH_SHORT).show();


                }
            }
        });

    }

    private  void newQuestion(int number){
        //set flag image to the screnn
        iv_flags.setImageResource(list.get(number-1).getImage());

        //decide on which buttom to place the correct answers
        int correct_answer = r.nextInt(4)+1;

        int firstButtom = number - 1;
        int secondButtom;
        int thirdButtom;
        int forthButtom;

        switch (correct_answer){
            case 1:
                b_answers1.setText(list.get(firstButtom).getName());


                do {
                    secondButtom = r.nextInt(list.size());

                }while (secondButtom == firstButtom);

                do {
                    thirdButtom = r.nextInt(list.size());

                }while (thirdButtom == firstButtom || thirdButtom == secondButtom);

                do {
                    forthButtom= r.nextInt(list.size());

                }while (forthButtom == firstButtom || forthButtom == secondButtom || forthButtom == thirdButtom);

                b_answers2.setText(list.get(secondButtom).getName());
                b_answers3.setText(list.get(thirdButtom).getName());
                b_answers4.setText(list.get(forthButtom).getName());

                break;
            case 2:
                b_answers2.setText(list.get(firstButtom).getName());


                do {
                    secondButtom = r.nextInt(list.size());

                }while (secondButtom == firstButtom);

                do {
                    thirdButtom = r.nextInt(list.size());

                }while (thirdButtom == firstButtom || thirdButtom == secondButtom);

                do {
                    forthButtom= r.nextInt(list.size());

                }
                while (forthButtom == firstButtom || forthButtom == secondButtom || forthButtom == thirdButtom);

                b_answers1.setText(list.get(secondButtom).getName());
                b_answers3.setText(list.get(thirdButtom).getName());
                b_answers4.setText(list.get(forthButtom).getName());


                break;
            case 3:

                b_answers3.setText(list.get(firstButtom).getName());


                do {
                    secondButtom = r.nextInt(list.size());

                }while (secondButtom == firstButtom);

                do {
                    thirdButtom = r.nextInt(list.size());

                }while (thirdButtom == firstButtom || thirdButtom == secondButtom);

                do {
                    forthButtom= r.nextInt(list.size());

                }while (forthButtom == firstButtom || forthButtom == secondButtom || forthButtom == thirdButtom);

                b_answers2.setText(list.get(secondButtom).getName());
                b_answers1.setText(list.get(thirdButtom).getName());
                b_answers4.setText(list.get(forthButtom).getName());
                break;
            case 4:

                b_answers4.setText(list.get(firstButtom).getName());


                do {
                    secondButtom = r.nextInt(list.size());

                }while (secondButtom == firstButtom);

                do {
                    thirdButtom = r.nextInt(list.size());

                }while (thirdButtom == firstButtom || thirdButtom == secondButtom);

                do {
                    forthButtom= r.nextInt(list.size());

                }while (forthButtom == firstButtom || forthButtom == secondButtom || forthButtom == thirdButtom);

                b_answers2.setText(list.get(secondButtom).getName());
                b_answers3.setText(list.get(thirdButtom).getName());
                b_answers1.setText(list.get(forthButtom).getName());
                break;
        }



    }
}
