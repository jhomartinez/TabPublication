package com.codigoj.tabs;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JHON on 20/02/2017.
 */

public class Fragment_Event extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Es la vista para cargar los eventos
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        return view;
    }
}
