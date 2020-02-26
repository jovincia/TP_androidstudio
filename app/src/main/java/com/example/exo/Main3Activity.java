package com.example.exo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import adapter.Adapter;
import models. Contacts;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        this.setTitle("Liste des contacts");

        List< Contacts>  ContactsList = new ArrayList<>();
        ListView listView = (ListView) findViewById(R.id.list Contacts) ;
         ContactsList.add(new  Contacts("MAGENGO", "Toto", 19,"Masculin","66666667"));
         ContactsList.add(new  Contacts("TATA", "Lili", 20,"Féminin","90222221"));
         ContactsList.add(new  Contacts("ALI", "Baba", 50,"Masculin","97989900"));
         ContactsList.add(new  Contacts("BA", "Mariam", 19,"Féminin","67000001"));
         ContactsList.add(new  Contacts("TATI", "Fatima", 35,"Féminin","96979899"));

        listView.setAdapter(new Adapter(this, ContactsList));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Contacts item = ( Contacts) parent.getItemAtPosition(position);
                Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                intent.putExtra(" Contacts_ first", item.get first());
                intent.putExtra(" Contacts_ last", item.get last());
                intent.putExtra(" Contacts_ cel", item.get cel());
                intent.putExtra(" Contacts_sexe", item.getSexe());

                startActivity(intent);
            }
        });
    }
}
