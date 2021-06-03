package com.example.a10118392uts;
/*
 * Tanggal pengerjaan : 3 Juni 2021
 * Nim                : 10118392
 * Nama               : Raden Arvin Rizky A
 * Kelas              : IF-9
 * */
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {
    private List<dataCatatan> listCatatan;
    private Context context;
    TextView tv_tanggal,tv_judul,tv_kategori,tv_catatan;
    LinearLayout linear;

    public ListViewAdapter(List<dataCatatan> listCatatan, Context context) {
        this.listCatatan = listCatatan;
        this.context = context;

    }

    @Override
    public int getCount() {
        return listCatatan.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_catatan,null);
        tv_tanggal = v.findViewById(R.id.tv_tanggal);
        tv_judul = v.findViewById(R.id.tv_judul);
        tv_kategori = v.findViewById(R.id.tv_kategori);
        tv_catatan = v.findViewById(R.id.tv_catatan);
        linear = v.findViewById(R.id.linear);

        tv_tanggal.setText(listCatatan.get(position).getTANGGAL());
        tv_judul.setText(listCatatan.get(position).getJUDUL());
        tv_kategori.setText(listCatatan.get(position).getJUDUL());
        tv_catatan.setText(listCatatan.get(position).getCATATAN());

        linear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent intent = new Intent(context, EditActivity.class);
                intent.putExtra("ID",listCatatan.get(position).getID());
                intent.putExtra("TANGGAL",listCatatan.get(position).getTANGGAL());
                intent.putExtra("JUDUL",listCatatan.get(position).getJUDUL());
                intent.putExtra("KATEGORI",listCatatan.get(position).getKATEGORI());
                intent.putExtra("CATATAN",listCatatan.get(position).getCATATAN());

                context.startActivity(intent);


                return true;
            }
        });
        return v;
    }
}
