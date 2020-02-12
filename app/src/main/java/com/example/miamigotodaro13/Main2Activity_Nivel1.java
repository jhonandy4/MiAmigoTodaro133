package com.example.miamigotodaro13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.Inflater;


public class Main2Activity_Nivel1 extends AppCompatActivity {

    Button btn_regre;

    private TextView tv_nombre, tv_score;
    private ImageView iv_huesitos;
    private EditText et_respuesta;
    private MediaPlayer mp, mp_baia_baia, mp_ohperdon;

    private int ids_respuestas[] ={
            R.id.respuesta1, R.id.respuesta2, R.id.respuesta3, R.id.respuesta4
    };


    int score, resultado, huesitos = 3;
    String nombre_jugador, string_score, string_huesitos;

    private int respuesta_correcta;
    private int pregunta_actual;
    private String[] todas_preguntas;
    private TextView tv_pregunta;
    private RadioGroup group;

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
        setContentView(R.layout.activity_main2__nivel1);

        btn_regre=(Button)findViewById(R.id.btn_regresar);


        btn_regre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pagina2= new Intent(Main2Activity_Nivel1.this,MainActivity.class);
                startActivity(pagina2);

            }
        });


        Toast.makeText(this, "Nivel 1 - Cosas grandes", Toast.LENGTH_LONG).show();

        tv_nombre = (TextView)findViewById(R.id.textView_nombre);
        tv_score = (TextView)findViewById(R.id.textView_score);
        iv_huesitos = (ImageView)findViewById(R.id.imageView_vidas);

        nombre_jugador = getIntent().getStringExtra("jugador");
        tv_nombre.setText("Jugador: " + nombre_jugador);


        mp = MediaPlayer.create(this, R.raw.goats);
        mp.start();
        mp.setLooping(true);

        mp_baia_baia = MediaPlayer.create(this, R.raw.baia_baia);
        mp_ohperdon = MediaPlayer.create(this, R.raw.ohperdon);



        tv_pregunta = (TextView)findViewById(R.id.tv_pregunta);
        group = (RadioGroup)findViewById(R.id.grupo_respuestas);
        Button button_check = (Button)findViewById(R.id.button_check);



        pregunta_actual = 0;
        mostrarpregunta();



        // TODO: Cuando clickean al boton deberia pasar a la siguiente pregunta

        // TODO: trtaremos de poner efecto de de laout emergente y correct and incorrect

        button_check.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int id = group.getCheckedRadioButtonId();
                int respuesta = -1;
                for (int i = 0; i < ids_respuestas.length; i++) {
                    if (ids_respuestas[i] == id) {
                        respuesta = i;
                    }
                }
                if (respuesta == respuesta_correcta) {
                    showToast();
                    mp_baia_baia.start();
                    score++;
                    tv_score.setText("Score: " + score);
                    Basededatos();

                } else{
                    showToast2();
                    mp_ohperdon.start();
                    huesitos--;
                    Basededatos();

                    switch (huesitos){
                        case 3:
                            iv_huesitos.setImageResource(R.drawable.craneo3);
                            break;
                        case 2:
                            iv_huesitos.setImageResource(R.drawable.craneo2);
                            break;
                        case 1:
                            iv_huesitos.setImageResource(R.drawable.craneo1);
                            break;
                        case 0:
                            Intent intent = new Intent(view.getContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                            mp.stop();
                            mp.release();

                            break;
                    }

                }

                if (pregunta_actual < todas_preguntas.length-1){
                    pregunta_actual++;
                    mostrarpregunta();
                }


            }
        });


        // TODO: Molaria tener un boton que pase al anterior
    }
    public void showToast(){
        LayoutInflater inflater =getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout_correct,(ViewGroup)findViewById(R.id.textViewToast));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(layout);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }

    public void showToast2(){
        LayoutInflater inflater =getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout_incorrect,(ViewGroup)findViewById(R.id.textViewToast2));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(layout);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);

        toast.show();
    }






    private void mostrarpregunta() {
        todas_preguntas = getResources().getStringArray(R.array.todas_preguntas);
        List<String> preguntasDesordenadas = Arrays.asList(todas_preguntas);
        Collections.shuffle(preguntasDesordenadas);

        String p = preguntasDesordenadas.get(pregunta_actual);
        String[] partes = p.split(";");

        group.clearCheck();
        tv_pregunta.setText(partes[0]);
        for (int i = 0; i < ids_respuestas.length; i++){
            RadioButton rb = (RadioButton)findViewById(ids_respuestas[i]);
            String respuesta = partes[i+1];
            if(respuesta.charAt(0) == '*') {
                respuesta_correcta = i;
                respuesta = respuesta.substring(1);
            }
            rb.setText(respuesta);
        }
    }
    public void Basededatos(){
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "BD", null, 1);
        SQLiteDatabase BD = admin.getReadableDatabase();

        Cursor consulta = BD.rawQuery("select * from puntaje where score = (select max(score) from puntaje)", null);
        if(consulta.moveToFirst()){
            String temp_nombre = consulta.getString(0);
            String temp_score = consulta.getString(1);

            int bestScore = Integer.parseInt(temp_score);

            if (score > bestScore){
                ContentValues modificacion = new ContentValues();
                modificacion.put("nombre", nombre_jugador);
                modificacion.put("score", score);

                BD.update("puntaje", modificacion, "score=" + bestScore, null);

            }

            BD.close();

        }else {
            ContentValues insertar = new ContentValues();

            insertar.put("nombre", nombre_jugador);
            insertar.put("score", score);

            BD.insert("puntaje", null, insertar);
            BD.close();


        }
    }

    @Override
    public void onBackPressed(){

    }
}