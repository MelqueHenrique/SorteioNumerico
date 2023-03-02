package com.example.sorteionumerico;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SortearNumero(View view){

        TextView textoResultado = findViewById(R.id.textoResultado);
        int numeroAleatorio = new Random().nextInt(11);
        textoResultado.setText("Numero sorteado foi: "+ numeroAleatorio);

    }
}
