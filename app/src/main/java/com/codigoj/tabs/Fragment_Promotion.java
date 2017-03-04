package com.codigoj.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JHON on 20/02/2017.
 */

public class Fragment_Promotion extends Fragment {
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Es la vista para cargar los eventos
        View view = inflater.inflate(R.layout.fragment_promotion, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        //Mejora el rendimiento siempre y cuando el TAMAÑO NO CAMBIE
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layout = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layout);
        //Utilizo el adaptador para el recyclerView
        List lista = new ArrayList();
        //Lista prueba
        lista.add(new Publication("001","nombre","descripcion", Publication.TYPE_EVENT, 0, "25/02/2017"));
        PublicationAdapter adapter = new PublicationAdapter(lista);

        return view;
    }
}
