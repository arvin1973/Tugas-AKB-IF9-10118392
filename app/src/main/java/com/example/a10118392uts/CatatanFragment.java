package com.example.a10118392uts;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
/*
 * Tanggal pengerjaan : 2 Juni 2021
 * Nim                : 10118392
 * Nama               : Raden Arvin Rizky A
 * Kelas              : IF-9
 * */
public class CatatanFragment extends Fragment {

    FloatingActionButton fab;
    private ListView listView;
    private ListViewAdapter adapter;
    private ArrayList<dataCatatan> listCatatan = new ArrayList<>();
    private SQLiteHelper helper;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_catatan,container,false);

        fab = (FloatingActionButton) view.findViewById(R.id.fab);
        listView = (ListView)view.findViewById(R.id.list_view);

        helper = new SQLiteHelper(this.getActivity());

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), InputActivity.class));
            }
        });
        menampilkanData();
        return view;
    }

    private void menampilkanData(){
        listCatatan.clear();
        Cursor res = helper.getDataAll();
        while (res.moveToNext()){
            String id = res.getString(0);
            String tanggal = res.getString(1);
            String judul = res.getString(2);
            String kategori = res.getString(3);
            String catatan = res.getString(4);


            listCatatan.add(new dataCatatan(id,
                    tanggal,
                    judul,
                    kategori,
                    catatan));
        }
        adapter = new ListViewAdapter(listCatatan, getActivity());
        listView.setAdapter(adapter);

    }

}
