package com.example.dan.recycler_view_tarea3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.RV_opciones);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getList()));
    }

    private List<Opciones> getList() {

        List<Opciones> lista = new ArrayList<>();

        lista.add(new Opciones("HELP", R.drawable.help));
        lista.add(new Opciones("FAVORITE", R.drawable.rating_favorite));
        lista.add(new Opciones("IMPORTANT", R.drawable.rating_important));
        lista.add(new Opciones("GOOD", R.drawable.rating_good));
        lista.add(new Opciones("CLOUD", R.drawable.collections_cloud));
        lista.add(new Opciones("DISCARD", R.drawable.content_discard));


        return lista;
    }
}
