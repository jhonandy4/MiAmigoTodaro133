package com.example.miamigotodaro13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    List<Book> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        lstBook = new ArrayList<>();
        lstBook = new ArrayList<>();
        lstBook.add(new Book("Modelo corazon","Esplacnologia","",R.drawable.book_corazon));
        lstBook.add(new Book("Modelo hematosis","Esplacnologia","",R.drawable.book_hematosis));
        lstBook.add(new Book("Modelo ojo","Neuroanatomía","",R.drawable.book_ojo));
        lstBook.add(new Book("Modelo olfatorio","Neuroanatomía","",R.drawable.book_torax_corazon));
        lstBook.add(new Book("Modelo torax 1","Esplacnologia","",R.drawable.book_torax_corazon2));
        lstBook.add(new Book("Modelo torax 2","Esplacnología","",R.drawable.book_fosapterigo));
        lstBook.add(new Book("Abdomen posterior","Esplacnologia","",R.drawable.book_abdomenposterior));
        lstBook.add(new Book("Cuello","Esplacnologia","",R.drawable.book_cuello));
        lstBook.add(new Book("Dorso","Locomotor","",R.drawable.book_dorso));
        lstBook.add(new Book("Esofago","Esplacnologia","",R.drawable.book_esofago));
        lstBook.add(new Book("Esofago cervical","Esplacnologia","",R.drawable.book_esofagocervical));
        lstBook.add(new Book("Fosa pterigopalatina","Locomotor","",R.drawable.book_fosapterigo));
        lstBook.add(new Book("Hilio pulmonar","Esplacnologia","",R.drawable.book_hilio));
        lstBook.add(new Book("Mandíbula","Locomotor","",R.drawable.book_mandibula));
        lstBook.add(new Book("Genital masculina","Esplacnologia","",R.drawable.book_masculino));
        lstBook.add(new Book("Nervio fosa pterigopalatina","Neuroanatomíak","",R.drawable.book_nervpterigo1));
        lstBook.add(new Book("Hueso palatino","Locomotor","",R.drawable.book_palatino));
        lstBook.add(new Book("Pie - huesos","Locomotor","",R.drawable.book_piehuesos));
        lstBook.add(new Book("Recto","Esplacnologia","",R.drawable.book_recto));
        lstBook.add(new Book("Escroto","Esplacnologia","",R.drawable.book_scroto));
        lstBook.add(new Book("Testiculo","Esplacnologia","",R.drawable.book_testis));
        lstBook.add(new Book("Vasos a nivel de la tráquea","Esplacnologia","",R.drawable.book_traqueaarte));
        lstBook.add(new Book("Triángulos del cuello","Esplacnologia","",R.drawable.book_tricuello));
        lstBook.add(new Book("Tráquea","Esplacnologia","",R.drawable.traquea));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);



    }
}