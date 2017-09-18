package com.example.dan.recycler_view_tarea3;


import android.widget.ImageView;

public class Opciones{

    private String titulo;
    int img;

    public Opciones(String titulo, int img){

        this.titulo = titulo;
        this.img = img;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getImg(){
        return img;
    }
}
