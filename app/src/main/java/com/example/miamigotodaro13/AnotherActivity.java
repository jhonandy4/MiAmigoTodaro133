package com.example.miamigotodaro13;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    TextView mTitleTv, mDescTV;
    ImageView mImageIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();

        mTitleTv = findViewById(R.id.titleAnother);
        mDescTV = findViewById(R.id.descriptionAnother);
        mImageIv = findViewById(R.id.imageViewAnother);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDescription = intent.getStringExtra("iDesc");

        byte[] mBytes= getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);

        mTitleTv.setText(mTitle);
        mDescTV.setText(mDescription);
        mImageIv.setImageBitmap(bitmap);



    }
}
