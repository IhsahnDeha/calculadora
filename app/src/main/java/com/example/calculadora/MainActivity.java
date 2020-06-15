package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public EditText captura;
    public double Nu1, Nu2, resultado;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        captura=(EditText)findViewById(R.id.screen);
    }
    public void n0 (View v){
        String reg = captura.getText().toString();
        reg = reg + "0";
        captura.setText(reg);
    }
    public void n1 (View v){
        String reg = captura.getText().toString();
        reg = reg + "1";
        captura.setText(reg);
    }
    public void n2 (View v){
        String reg = captura.getText().toString();
        reg = reg + "2";
        captura.setText(reg);
    }
    public void n3 (View v){
        String reg = captura.getText().toString();
        reg = reg + "3";
        captura.setText(reg);
    }
    public void n4 (View v){
        String reg = captura.getText().toString();
        reg = reg + "4";
        captura.setText(reg);
    }
    public void n5 (View v){
        String reg = captura.getText().toString();
        reg = reg + "5";
        captura.setText(reg);
    }
    public void n6 (View v){
        String reg = captura.getText().toString();
        reg = reg + "6";
        captura.setText(reg);
    }
    public void n7 (View v){
        String reg = captura.getText().toString();
        reg = reg + "7";
        captura.setText(reg);
    }
    public void n8 (View v){
        String reg = captura.getText().toString();
        reg = reg + "8";
        captura.setText(reg);
    }
    public void n9 (View v){
        String reg = captura.getText().toString();
        reg = reg + "9";
        captura.setText(reg);
    }
    public void punto (View v){
        String reg = captura.getText().toString();
        reg = reg + ".";
        captura.setText(reg);
    }
    public void SUMA (View v){
        try{
            String aux = captura.getText().toString();
            Nu1 = Double.parseDouble(aux);
            Nu2 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        captura.setText("");
        operacion = 1;
    }
    public void RESTA (View v){
        try{
            String aux = captura.getText().toString();
            Nu1 = Double.parseDouble(aux);
            Nu2 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        captura.setText("");
        operacion = 2;
    }
    public void MULT (View v){
        try{
            String aux = captura.getText().toString();
            Nu1 = Double.parseDouble(aux);
            Nu2 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        captura.setText("");
        operacion = 3;
    }
    public void DIVI (View v){
        try{
            String aux = captura.getText().toString();
            Nu1 = Double.parseDouble(aux);
            Nu2 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){}
        captura.setText("");
        operacion = 4;
    }
    public void IGUAL (View v){
        try{String aux = captura.getText().toString();
            Nu1 = Double.parseDouble(aux);
        } catch (NumberFormatException nfe){
        }
        captura.setText("");
        if(operacion == 1){resultado = Nu1 + Nu2;}
        else if (operacion == 2 ){resultado = Nu1 - Nu2;}
        else if (operacion == 3 ){resultado = Nu1 * Nu2;}
        else if (operacion == 4 ){resultado = Nu1 / Nu2;}
        captura.setText(""+ resultado);
        Nu1 = resultado;
    }

}



