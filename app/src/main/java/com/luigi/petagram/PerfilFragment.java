package com.luigi.petagram;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvPerfilMascota);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        listaMascotas.setLayoutManager(glm);
        //LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        //llm.setOrientation(LinearLayoutManager.VERTICAL);
        //listaMascotas.setLayoutManager(llm);

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

        mascotas.add(new Mascota("Octavio",1,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",2,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",4,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",6,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",3,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",4,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",2,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",1,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",5,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",1,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",2,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",4,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",6,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",3,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",4,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",2,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",1,R.drawable.tarantula));
        mascotas.add(new Mascota("Octavio",5,R.drawable.tarantula));


    }

}
