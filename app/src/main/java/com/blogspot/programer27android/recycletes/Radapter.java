package com.blogspot.programer27android.recycletes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gery on 12/27/17.
 */

public class Radapter extends RecyclerView.Adapter<Radapter.MyHolder> {
    ArrayList<String>list;

    public Radapter( ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public Radapter.MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listl,parent,false);
        MyHolder h=new MyHolder(v);
        return h;
    }

    @Override
    public void onBindViewHolder(Radapter.MyHolder holder, int position) {
        holder.negara.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView negara;
        public MyHolder(View itemView) {
            super(itemView);
            negara=itemView.findViewById(R.id.nNama);
        }
    }
}
