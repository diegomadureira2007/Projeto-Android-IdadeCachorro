package com.studio.idadedecachorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.caixaTextoId);
        botaoIdade = findViewById(R.id.botaoIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar o que foi Digitado
              String textoDigitado = caixaTexto.getText().toString();

              if ( textoDigitado.isEmpty() ){
                  resultadoIdade.setText("Nenhum Número Digitado ");

              }else{
                  int valorDigitado = Integer.parseInt(textoDigitado );
                  int valorResultadoFinal = valorDigitado * 7;

                  resultadoIdade.setText("A Idade do Cachorro em Anos Humano é: " +valorResultadoFinal + " Anos");

              }
            }
        });

    }
}
