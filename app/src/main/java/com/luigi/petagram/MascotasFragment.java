package com.luigi.petagram;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MascotasFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);


        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Micky",2,R.drawable.raton));
        mascotas.add(new Mascota("Patas",4,R.drawable.conejo));
        mascotas.add(new Mascota("Manchas",5,R.drawable.gato));
        mascotas.add(new Mascota("Bigotes",2,R.drawable.hamster));
        mascotas.add(new Mascota("Franky",1,R.drawable.perico));
        mascotas.add(new Mascota("Thor",4,R.drawable.perro));
        mascotas.add(new Mascota("Lazaro",4,R.drawable.pez));
        mascotas.add(new Mascota("Crispin",2,R.drawable.raton_1));
        mascotas.add(new Mascota("Octavio",3,R.drawable.tarantula));
        mascotas.add(new Mascota("Timoty",4,R.drawable.pez_2));
        mascotas.add(new Mascota("Doroteo",4,R.drawable.perico_2));
        mascotas.add(new Mascota("Miguelito",1,R.drawable.raton_2));

    }

}
