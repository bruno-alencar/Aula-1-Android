package com.example.fic.aula01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView txtMensagem;
    private Button btnTrocar;
    private ImageView imgFoto;
    private RadioButton radio_sol;
    private RadioButton radio_lua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMensagem = (TextView) findViewById(R.id.txtTexto);
        btnTrocar = (Button) findViewById(R.id.btnTrocar);


        imgFoto = (ImageView) findViewById(R.id.foto);

        radio_sol = (RadioButton) findViewById(R.id.radio_sol);
        radio_lua = (RadioButton) findViewById(R.id.radio_lua);

        /*
        btnTrocar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMensagem.setText("Mr Robot will atack again!!");
            }
        });
        */
    }

    public void trocarClick(View view){
        txtMensagem.setText("Mr robot will atack again!!");
        btnTrocar.setVisibility(View.INVISIBLE);
    }

    public void trocarImagemClick(View view){

        if(radio_sol.isChecked()){
            imgFoto.setImageResource(R.drawable.sol);
            Toast.makeText(this, "O dia está claro!", Toast.LENGTH_SHORT).show();

        }else{
            imgFoto.setImageResource(R.drawable.lua);
            Toast.makeText(this, "O dia está escuro!", Toast.LENGTH_SHORT).show();
        }
    }
}
