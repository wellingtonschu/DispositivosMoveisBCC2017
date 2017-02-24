package com.example.welli.project02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

        Button button = (Button) findViewById(R.id.idTela02Button);
        button.setOnClickListener(abrirTela02());

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT);
    }

    private View.OnClickListener abrirTela02() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Tela02Activity.class);
                startActivity(it);
            }
        };
    }

    protected void onActivityResult(int codigo, int resultado, Intent it){
        if (codigo == 1){
            Bundle params = it != null ? it.getExtras(): null;

            if (params != null){

                String msg = params.getString("msg");

                switch (resultado){
                    case 1:
                        Toast.makeText(this,"Escolheu sim: " + msg, Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(this,"Escolheu não: " + msg, Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(this,"Não definido: " + msg, Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    private View.OnClickListener passarParametro(){
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                EditText etName = (EditText) findViewById(R.id.idSubmitText02);

                String nome = etName.getText().toString();
                bundle.putString("Nome", nome);

                Intent it = new Intent(getApplicationContext(), RecebeParametroActivity.class);

                it.putExtras(bundle);

                startActivity(it);
            }
        };
    }
}
