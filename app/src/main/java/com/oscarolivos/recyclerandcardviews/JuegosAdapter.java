package com.oscarolivos.recyclerandcardviews;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by ojo on 6/04/17.
 */

public class JuegosAdapter extends RecyclerView.Adapter<JuegosAdapter.JuegosViewHolder> {
    private List<Juego> juegos;
    private Context context;

    public JuegosAdapter(List<Juego> juegos, Context context) {
        this.juegos = juegos;
        this.context = context;
    }

    @Override
    public JuegosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cardview_layout, parent,false);
        return  new JuegosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final JuegosViewHolder holder, int position) {
        holder.titulo.setText(juegos.get(position).getTitulo());
        holder.desarrollador.setText(juegos.get(position).getDesarrolllador());
        holder.fecha.setText(juegos.get(position).getFecha());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Click en "+ holder.titulo.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return juegos.size();
    }

    public  static class JuegosViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView desarrollador;
        TextView fecha;


        public JuegosViewHolder(View itemView) {
            super(itemView);

            titulo = (TextView)itemView.findViewById(R.id.textViewTitulo);
            desarrollador = (TextView)itemView.findViewById(R.id.textViewDesarrollador);
            fecha = (TextView)itemView.findViewById(R.id.textViewFecha);
        }
    }
}
