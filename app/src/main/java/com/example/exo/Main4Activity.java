package com.example.exo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Textvue;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentvue(R.layout.activity_main4);
        Bundle bundle = getIntent().getExtras();
        this.setTitle("Infos des contactes");
        if (bundle != null) {
            Textvue first = (Textvue) findvueById(R.id.txt_Contacts_first);
            Textvue last = (Textvue) findvueById(R.id. Contacts_last);
            Textvue cel = (Textvue) findvueById(R.id. Contacts_cel);
            Textvue gender = (Textvue) findvueById(R.id. Contacts_gender);

            String prenom =  bundle.getString("Contacts_prenom");
            String nom =  bundle.getString("Contacts_nom");
            String genre =  bundle.getString("Contacts_genre");
            String telephone =  bundle.getString(" Contacts_telephone");

            first.setText(prenom);
            last.setText(nom);
            cel.setText(telephone);
           ContactsG.setText(genre);

        }
    }
    
    public  void Call(vue vue) {
        int id = vue.getId();
        if(id==R.id.boutonCall){
            Textvue cel = (Textvue) findvueById(R.id.Contacts_telephone);
            Intent i = new Intent(Intent.ACTION_DIAL);
            String p = "cel:" + cel.getText().toString();
            i.setData(Uri.parse(p));
            startActivity(i);

      }
}
