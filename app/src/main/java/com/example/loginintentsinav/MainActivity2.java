package com.example.loginintentsinav;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    TextView isim;



        @SuppressLint("MissingInflatedId")
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            button=findViewById(R.id.button);
            isim=findViewById(R.id.isim);
            Intent intent = getIntent();
            String kullaniciAdi = intent.getStringExtra("kullaniciAdi");
            isim.setText("Hoşgeldin "+ kullaniciAdi);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent y=new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(y);


                }
            });

    }
}
