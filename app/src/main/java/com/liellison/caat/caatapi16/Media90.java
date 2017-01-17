package com.liellison.caat.caatapi16;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by liellison on 16/01/17.
 */
public class Media90 extends AppCompatActivity implements View.OnClickListener{
    EditText nota1, nota2, nota3;
    Button btCalc90;
    TextView text90;
    double n1, n2, n3, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_90horas);

        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);
        nota3 = (EditText) findViewById(R.id.nota3);
        btCalc90 = (Button) findViewById(R.id.btCalc90);
        text90 = (TextView) findViewById(R.id.text90);
        btCalc90.setOnClickListener(this);
        setupToolbar();
    }

    private void setupToolbar()
    {
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);

        AppCompatActivity activity = Media90.this;
        activity.setSupportActionBar(toolbar);

        final ActionBar bar = activity.getSupportActionBar();
        if (bar != null)
        {
            bar.setTitle(activity.getString(R.string.app_name));
        }
    }

    @Override
    public void onClick(View view) {
        if (nota3.getText().toString().equals(null)) {
            n1 = Double.parseDouble(nota1.getText().toString());
            n2 = Double.parseDouble(nota2.getText().toString());
            n3 = Double.parseDouble(nota3.getText().toString());
            resultado = ((n1 * 4) + (n2 * 5) + (n3 * 6)) / 15;
            text90.setText(String.valueOf(resultado));
        }else if (!nota3.getText().toString().equals(null)){
            n1 = Double.parseDouble(nota1.getText().toString());
            n2 = Double.parseDouble(nota2.getText().toString());
            resultado = (((n1 * 4) + (n2 * 5))-105)/-6;
            text90.setText("Voce precisa tirar " + String.valueOf(resultado)+" na 3° prova");
        }

    }
}