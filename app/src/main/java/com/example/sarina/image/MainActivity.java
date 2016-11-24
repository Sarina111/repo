package com.example.sarina.image;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View view) {
        if

    }

    public void init(){
        ImageView img=(ImageView) findViewById(R.id.image1);

        Button btn=(Button) findViewById(R.id.btn1);
        btn.setOnClickListener(this);

    }


}
