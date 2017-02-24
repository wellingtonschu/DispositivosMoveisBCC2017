package com.example.welli.project02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela02Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSim = (Button) findViewById(R.id.buttonSim);
        buttonSim.setOnClickListener(clickSim());

        Button buttonNao = (Button) findViewById(R.id.buttonNao);
        buttonNao.setText("Não");
        buttonNao.setOnClickListener(clickNao());

    }

    private View.OnClickListener clickSim(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();

                it.putExtra("msg", "Clicou em sim!!!");

                setResult(1, it);

                finish();
            }
        };
    }

    private View.OnClickListener clickNao(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent();

                it.putExtra("msg", "Clicou em nao!!!");

                setResult(2, it);

                finish();
            }
        };
    }

}
