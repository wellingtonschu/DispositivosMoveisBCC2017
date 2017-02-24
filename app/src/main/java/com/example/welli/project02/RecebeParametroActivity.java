package com.example.welli.project02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecebeParametroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_parametro);

        Intent it = getIntent();

        Bundle backBundle = it.getExtras();

        String nome = backBundle.getString("Nome").toString();

        TextView tvNome = (TextView) findViewById(R.id.textView2);

        tvNome.setText(nome);
    }
}
