package com.example.loginintentsinav;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText kullaniciadi, sifre;
    RadioGroup radioGroup;
    RadioButton muhasebe, ybs;
    String kullanici1, kullanici2;
    String sifre1, sifre2;
    Integer girishak=0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        kullaniciadi=findViewById(R.id.kullaniciadi);
        sifre=findViewById(R.id.sifre);
        radioGroup=findViewById(R.id.radioGroup);
        muhasebe=findViewById(R.id.muhasebe);
        ybs=findViewById(R.id.ybs);

        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                kullanici1=kullaniciadi.getText().toString();
                sifre1=sifre.getText().toString();
                kullanici2=kullaniciadi.getText().toString();
                sifre2=sifre.getText().toString();


                if (muhasebe.isChecked()){
                  if ( kullanici1.equals("Ahmet")|| kullanici1.equals("Esra") && sifre1.equals("123")){
                          Intent x=new Intent(MainActivity.this,MainActivity2.class);
                         x.putExtra("kullaniciAdi", kullanici1);
                          startActivity(x);


                  }
                  else{
                      Toast.makeText(MainActivity.this, "Kullanici adi veya şifre hatalı.", Toast.LENGTH_SHORT).show();
                      girishak++;
                  }



                }

                if (ybs.isChecked()){
                    if (kullanici2.equals("Ali") || kullanici2.equals("Seda") && sifre2.equals("456")){

                        Intent y=new Intent(MainActivity.this,MainActivty3.class);
                        y.putExtra("kullaniciAdi", kullanici2);
                            startActivity(y);



                    } else{
                        Toast.makeText(MainActivity.this, "Kullanici adi veya şifre hatalı.", Toast.LENGTH_SHORT).show();
                        girishak++;
                    }

                }

                if (radioGroup.getCheckedRadioButtonId()== -1){
                    Toast.makeText(MainActivity.this, "Lütfen bir seçenek seçin.", Toast.LENGTH_SHORT).show();
                }
                if (girishak>3){
                    finish();
                }
            }
        });

    }
}