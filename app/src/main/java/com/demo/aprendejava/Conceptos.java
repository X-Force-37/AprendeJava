package com.demo.aprendejava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Conceptos extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conceptos);
        listView = (ListView)findViewById(R.id.indice);

        String[] Temas = {
                "Lenguajes de Programacion",
                "Programa",
                "Paradigma de programacion",
                "Compiladores e interpretes",
                "IDE",
                "Ejecutables"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, Temas);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if( position == 0 ) {
                    Intent intent = new Intent(view.getContext(), Conceptos1Definicion.class);
                    startActivity(intent);
                }
                if( position == 1 ) {
                    Intent intent = new Intent(view.getContext(), Conceptos2Definicion.class);
                    startActivity(intent);
                }
            }
        });


    }
}
