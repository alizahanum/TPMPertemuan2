
        package com.example.tugastpm;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.nfc.FormatException;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        public class MainActivity extends AppCompatActivity {

        private EditText name;
        private Button btnkirim;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnkirim = findViewById(R.id.btnSend);
        name = findViewById(R.id.etText);

        btnkirim.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
        try {
        String sText = name.getText().toString();
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("Text", sText);
        startActivity(intent);
        }catch (NumberFormatException nfe){
        Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show();
        }
        }
        });
        }}

