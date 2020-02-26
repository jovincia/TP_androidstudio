package com.example.exo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.setTitle(R.string.page_calculator);
    }

    public void Click(View view) {
        Button bouton = (Button) view;
        String donnee = (String) bouton.getText();
        TextView ecran = (TextView) findViewById(R.id.txt_ecran) ;
        String valeur = ecran.getText().toString();
        if (isNumeric(donnee)){
            ecran.setText(ecran.getText()+donnee);
        }else {
            switch (donnee){
                case "AC":
                    ecran.setText("");
                    break;
                case "+":
                    ecran.setText(ecran.getText()+"+");
                    break;
                case "-":
                    ecran.setText(ecran.getText()+"-");
                    break;
                case "*":
                    ecran.setText(ecran.getText()+"*");
                    break;
                case "/":
                    ecran.setText(ecran.getText()+"/");
                    break;
                case "+/-":
                    ecran.setText(ecran.getText()+"(-");
                    break;
                case "=":
                    String[] plus= stringtoarray(valeur,"+");
                    String[] moins= stringtoarray(valeur,"-");
                    String[] fois= stringtoarray(valeur,"*");
                    String[] division= stringtoarray(valeur,"/");
                    String[] modulo= stringtoarray(valeur,"%");
                    int i=0;
                            double reponse=0;
                    if(plus.length > 1){
                        for (String str : plus){
                            reponse+=Integer.parseInt(str.trim());
                        }
                        ecran.setText(String.donneeOf(reponse));

                    }else if(moins.length > 1){

                        for (i = 0; i<moins.length; i++){
                            if (i==0){
                                reponse=Integer.parseInt(moins[i].trim());
                            }else {
                                reponse-=Integer.parseInt(moins[i].trim());
                            }
                        }
                        ecran.setText(String.donneeOf(reponse));

                    }else if (fois.length > 1){

                        reponse = 1;
                        for (String str : fois){
                            reponse*=Integer.parseInt(str.trim());
                        }
                        ecran.setText(String.donneeOf(reponse));


                    }else if (division.length > 1){

                        for (i = 0; i< division.length; i++){
                            if (i==0){
                                reponse=Integer.parseInt(division[i].trim());
                            }else {
                                reponse/=Integer.parseInt(division[i].trim());
                            }
                        }
                        ecran.setText(String.donneeOf(reponse));

                    }else if (modulo.length > 1){

                        for (i = 0; i< modulo.length; i++){
                            if (i==0){
                                reponse=Integer.parseInt(modulo[i].trim());
                            }else {
                                reponse%=Integer.parseInt(modulo[i].trim());
                            }
                        }
                        ecran.setText(String.donneeOf(reponse));
                    }
                    break;
                case "%":
                    ecran.setText(ecran.getText()+"%");
                    break;

            }
        }

    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static String[] stringtoarray (String str, String signe){
       return str.split(Pattern.quote(signe));
    }
}
