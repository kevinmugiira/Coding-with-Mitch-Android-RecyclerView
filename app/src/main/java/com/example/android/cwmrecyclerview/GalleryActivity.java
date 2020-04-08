package com.example.android.cwmrecyclerview;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.appcompat.app.AppCompatActivity;

public class GalleryActivity extends AppCompatActivity {

    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        Log.d(TAG, "onCreate: started");

        getIncomingIntent();

    }


    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents");

        if(getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")) {
            Log.d(TAG, "getIncomingIntent: found intent extras");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");

            setImage(imageUrl, imageName);

        }


    }

    private void setImage(String imageUrl, String imageName) {
        Log.d(TAG, "setImage: setting the image and name to widgets");

        TextView name = findViewById(R.id.image_description);
        name.setText(imageName);


        ImageView picha = findViewById(R.id.image_display);
        Glide.with(this)
                .asBitmap()
                .load(imageUrl)
                .into(picha);


        
    }


}