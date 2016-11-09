package br.com.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText idadeCachorro;
    private TextView idadeHumano;
    private Button btnGerarIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeCachorro = (EditText) findViewById(R.id.edIdadeCachorro);
        idadeHumano = (TextView) findViewById(R.id.tvIdadeConvertida);
        btnGerarIdade = (Button) findViewById(R.id.btnGerar);

        btnGerarIdade.setOnClickListener((View view) -> {
            final String valorDigitado = idadeCachorro.getText().toString();

            if (valorDigitado.isEmpty()) {
                Toast toast = Toast.makeText(this, "Idade do cachorro é obrigatorio", Toast.LENGTH_SHORT);
                toast.show();
            } else {
                int idadeCachorro = Integer.valueOf(valorDigitado);
                int idadeHum = idadeCachorro * 7;
                idadeHumano.setText("A idade do cachorro em anos humanos é : " + idadeHum);
            }
        });

    }
}
