package com.azharadyatma.vsga2024;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class MainAdapter extends ArrayAdapter<Kontak> {

    public MainAdapter(@NonNull Context context){
        super(context, 0, new ArrayList<>());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(
                    android.R.layout.simple_list_item_2, parent, false);
        }

        Kontak kontak = getItem(position);

        TextView textView1 = itemView.findViewById(android.R.id.text1);
        textView1.setText(kontak.getAlamat());

        TextView textView2 = itemView.findViewById(android.R.id.text2);
        textView2.setText(kontak.getNama());

        return itemView;
    }
}
