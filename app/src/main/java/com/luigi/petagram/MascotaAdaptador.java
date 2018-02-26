package com.luigi.petagram;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;

    public MascotaAdaptador(ArrayList<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    public static class MascotaViewHolder extends ViewHolder{

        private ImageView imgMascota;
        private TextView tvNombreMascota;
        private TextView tvRating;
        private ImageButton btnRating;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgMascota = (ImageView) itemView.findViewById(R.id.imgMascota);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvRating = (TextView) itemView.findViewById(R.id.tvRating);
            btnRating  = (ImageButton) itemView.findViewById(R.id.btnRating);
        }
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgMascota.setImageResource(mascota.getImagen());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombre());
        mascotaViewHolder.tvRating.setText( Integer.toString(mascota.getRating()));

        mascotaViewHolder.btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mascota.setRating(mascota.getRating()+1);
                mascotaViewHolder.tvRating.setText( Integer.toString(mascota.getRating()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


}
