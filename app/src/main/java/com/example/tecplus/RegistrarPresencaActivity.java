package com.example.tecplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

class RegistrarPresencaActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_registra_presenca) ;

            Button botaoSalvar = (Button) findViewById(R.id.presenca_salvar);
            botaoSalvar.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    Toast.makeText(RegistrarPresencaActivity.this, "Presença salva!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            });
        }
}
