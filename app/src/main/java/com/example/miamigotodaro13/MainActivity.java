package com.example.miamigotodaro13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_imag, btn_menu, btn_notes, btn_quiz;

    private EditText et_nombre;
    private ImageView iv_personaje;
    private TextView tv_BestScore;
    private MediaPlayer mp, mp_presionarbotonverrespuesta;

    int num_aleatorio = (int) (Math.random() * 21);


    @Override
    public void onPause() {
        super.onPause();
        mp.pause();
    }

    @Override
    public void onResume() {
        super.onResume();
        mp.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_imag=(Button)findViewById(R.id.btn_imagenes);
        btn_menu=(Button)findViewById(R.id.btn_otromenu);
        btn_notes=(Button)findViewById(R.id.btn_notas);
        btn_quiz=(Button)findViewById(R.id.btn_quizbanderas);






        btn_imag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina2= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(pagina2);

            }
        });

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina4= new Intent(MainActivity.this,nemote.class);
                startActivity(pagina4);
            }
        });

        btn_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina4= new Intent(MainActivity.this,notas.class);
                startActivity(pagina4);
            }
        });

        btn_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina4= new Intent(MainActivity.this,Banderita.class);
                startActivity(pagina4);
            }
        });


        et_nombre = (EditText)findViewById(R.id.txt_nombre);
        iv_personaje = (ImageView)findViewById(R.id.imagView_personaje);
        tv_BestScore = (TextView)findViewById(R.id.textView_BestScore);

        int id;
        if(num_aleatorio == 0 || num_aleatorio == 21){
            id = getResources().getIdentifier("houseloco", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 1 || num_aleatorio == 20){
            id = getResources().getIdentifier("docotrsimpson3", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 2 || num_aleatorio == 19){
            id = getResources().getIdentifier("doctorsimpson1", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 3 || num_aleatorio == 18){
            id = getResources().getIdentifier("doctorsimpson2", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 4 || num_aleatorio == 17){
            id = getResources().getIdentifier("fransword", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 5 || num_aleatorio == 16){
            id = getResources().getIdentifier("gooddoctor", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 6 || num_aleatorio == 15){
            id = getResources().getIdentifier("graysanatomy", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 7 || num_aleatorio == 14){
            id = getResources().getIdentifier("houselatrece", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 8 || num_aleatorio == 13){
            id = getResources().getIdentifier("rickpepino", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 9 || num_aleatorio == 12){
            id = getResources().getIdentifier("scrubs", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } else if(num_aleatorio == 10){
            id = getResources().getIdentifier("rickbailando", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        } if(num_aleatorio == 11){
            id = getResources().getIdentifier("zoidberg", "drawable", getPackageName());
            iv_personaje.setImageResource(id);

        }

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"BD", null, 1);
        SQLiteDatabase BD = admin.getWritableDatabase();

        Cursor consulta = BD.rawQuery(
                "select * from puntaje where score = (select max(score) from puntaje)", null);
        if (consulta.moveToFirst()){
            String temp_nombre = consulta.getString(0);
            String temp_score =  consulta.getString(1);
            tv_BestScore.setText("Record: " + temp_score + " de  " + temp_nombre);
            BD.close();

        } else {
            BD.close();
        }

        mp = MediaPlayer.create(this, R.raw.futurama_intro);
        mp_presionarbotonverrespuesta = MediaPlayer.create(this, R.raw.presionarbotonverrespuesta);
        mp.start();
        mp.setLooping(true);
    }

    public void Jugar (View view){
        String nombre = et_nombre.getText().toString();

        if (!nombre.equals("")){
            mp_presionarbotonverrespuesta.start();
            mp.stop();
            mp.release();


            Intent intent = new Intent(this, Main2Activity_Nivel1.class);

            intent.putExtra("jugador", nombre);

            startActivity(intent);
            finish();

        } else {
            Toast.makeText(this, "Primero debes escribir tu nombre", Toast.LENGTH_SHORT).show();

            et_nombre.requestFocus();
            InputMethodManager imm = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);
            imm.showSoftInput(et_nombre, InputMethodManager.SHOW_IMPLICIT);

        }

    }

    @Override
    public  void onBackPressed(){

    }

}
