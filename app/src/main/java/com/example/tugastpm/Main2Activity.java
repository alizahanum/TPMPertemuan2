package com.example.tugastpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {
    private Button btnkali;

    private TextView tvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvText = findViewById(R.id.tvText);
        String Text = getIntent().getStringExtra("Text");
        String value = "Hi, "+ Text +"!";
        tvText.setText(value);

        btnkali=findViewById(R.id.btnKali);
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}