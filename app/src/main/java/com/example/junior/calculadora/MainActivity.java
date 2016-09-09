package com.example.junior.calculadora;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,ponto,igual,mais,menos,mult,div,limpar;
    public EditText tela, concatenar;
    public double numero1, numero2, resultado;
    public String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        limpar = (Button) findViewById(R.id.limpar);
        num0 = (Button) findViewById(R.id.num0);
        num1 = (Button) findViewById(R.id.num1);
        num2 = (Button) findViewById(R.id.num2);
        num3 = (Button) findViewById(R.id.num3);
        num4 = (Button) findViewById(R.id.num4);
        num5 = (Button) findViewById(R.id.num5);
        num6 = (Button) findViewById(R.id.num6);
        num7 = (Button) findViewById(R.id.num7);
        num8 = (Button) findViewById(R.id.num8);
        num9 = (Button) findViewById(R.id.num9);
        ponto = (Button) findViewById(R.id.ponto);
        igual = (Button) findViewById(R.id.igual);
        mais = (Button) findViewById(R.id.mais);
        menos = (Button) findViewById(R.id.menos);
        mult = (Button) findViewById(R.id.mult);
        div = (Button) findViewById(R.id.div);
        tela = (EditText) findViewById(R.id.tela);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + "9");
            }
        });

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                tela.setText(concatenar.getText().toString() + ".");
            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                concatenar = (EditText) findViewById(R.id.tela);
                numero2 = Double.parseDouble(concatenar.getText().toString());

                if (operador.equals("+")){
                    tela.setText("");
                    resultado = numero1 + numero2;
                }
                if (operador.equals("-")){
                    tela.setText("");
                    resultado = numero1 - numero2;
                }
                if (operador.equals("*")){
                    tela.setText("");
                    resultado = numero1 * numero2;
                }
                if (operador.equals("/")){
                    tela.setText("");
                    if (numero2 != 0){
                        resultado = numero1 / numero2;
                    }else {
                        tela.setText("----");
                    }
                }
                tela.setText(String.valueOf(resultado));

            }
        });

        mais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "+";
                concatenar = (EditText) findViewById(R.id.tela);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                tela.setText("");
            }
        });

        menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "-";
                concatenar = (EditText) findViewById(R.id.tela);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                tela.setText("");
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "*";
                concatenar = (EditText) findViewById(R.id.tela);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                tela.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operador = "/";
                concatenar = (EditText) findViewById(R.id.tela);
                numero1 = Double.parseDouble(concatenar.getText().toString());
                tela.setText("");
            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1 = 0;
                numero2 = 0;
                tela.setText("");
            }
        });




    }
}
