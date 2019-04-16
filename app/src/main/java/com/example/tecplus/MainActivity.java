package com.example.tecplus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button novaPresenca = (Button) findViewById(R.id.nova_presenca);
        novaPresenca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiPraPresenca = new Intent(MainActivity.this, RegistrarPresencaActivity.class);
                startActivity(intentVaiPraPresenca);
            }
        });

        Button botaoCsv = (Button) findViewById(R.id.csv);
        botaoCsv.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v) {
                Toast.makeText(MainActivity.this, "Exportação CSV indisponível", Toast.LENGTH_SHORT).show();

            }
        });

    }

}
