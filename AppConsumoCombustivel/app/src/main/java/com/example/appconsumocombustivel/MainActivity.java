package com.example.appconsumocombustivel;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText nomeVeiculo, numeroPlaca, distancia, consumoMedio, precoCombustivel;
    TextView resultadoCombustivel, resultadoCusto;
    Button botaoCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // conectando componentes
        nomeVeiculo = findViewById(R.id.edtNomeVeiculo);
        numeroPlaca = findViewById(R.id.edtNumeroPlaca);
        distancia = findViewById(R.id.edtDistancia);
        consumoMedio = findViewById(R.id.edtConsumo);
        precoCombustivel = findViewById(R.id.edtPreco);
        resultadoCombustivel = findViewById(R.id.txtQuantCombustivel);
        resultadoCusto = findViewById(R.id.txtCustoViagem);
        botaoCalcular = findViewById(R.id.botaoCalcular);

        botaoCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // valida campos
                if (distancia.getText().toString().isEmpty() ||
                        consumoMedio.getText().toString().isEmpty() ||
                        precoCombustivel.getText().toString().isEmpty()) {
                    resultadoCombustivel.setText("Preencha todos os campos obrigatórios!");
                    return;
                }

                // conversão para números
                double km = Double.parseDouble(distancia.getText().toString());
                double kmPorLitro = Double.parseDouble(consumoMedio.getText().toString());
                double preco = Double.parseDouble(precoCombustivel.getText().toString());

                // cálculo
                double combustivelNecessario = km / kmPorLitro;
                double custoViagem = combustivelNecessario * preco;

                // exibição
                resultadoCombustivel.setText("Total de " + String.format("%.2f", combustivelNecessario) + " litros");
                resultadoCusto.setText("Custo total: R$ " + String.format("%.2f", custoViagem));
            }
        });
    }
}