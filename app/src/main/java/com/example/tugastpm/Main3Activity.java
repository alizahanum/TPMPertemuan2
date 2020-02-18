package com.example.tugastpm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private Button btnhitung;
    private TextView tvhasil;
    private EditText etangka1,etangka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnhitung=findViewById(R.id.btnKali);
        tvhasil=findViewById(R.id.tvHasil);
        etangka1=findViewById(R.id.etAngka1);
        etangka2=findViewById(R.id.etAngka2);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sangka1 = etangka1.getText().toString();
                    String sangka2 = etangka2.getText().toString();

                    double angka1 = Double.parseDouble(sangka1);
                    double angka2 = Double.parseDouble(sangka2);

                    double hasil = angka1 * angka2;
                    String shasil = String.valueOf(hasil);
                    tvhasil.setText(shasil);
                }
                catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}