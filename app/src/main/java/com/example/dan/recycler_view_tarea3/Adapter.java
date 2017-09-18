package com.example.dan.recycler_view_tarea3;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{


    private List<Opciones> lista;

    public Adapter(List<Opciones> lista){

        this.lista = lista;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo;
        private ImageView img;

        public ViewHolder(View itemView){
            super(itemView);

            titulo = (TextView)itemView.findViewById(R.id.txtTitulo);
            img = (ImageView)itemView.findViewById(R.id.item_img);
        }
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycler, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {

        holder.titulo.setText(lista.get(position).getTitulo());
        holder.img.setImageResource(lista.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }
}
