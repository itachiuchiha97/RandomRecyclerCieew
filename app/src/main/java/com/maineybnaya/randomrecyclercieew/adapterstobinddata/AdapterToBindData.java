package com.maineybnaya.randomrecyclercieew.adapterstobinddata;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.maineybnaya.randomrecyclercieew.R;
import com.maineybnaya.randomrecyclercieew.modelsorsaydataset.models;

import java.util.List;
import java.util.zip.Inflater;
/*
Need an Adapter, to set the data
and
Need a ViewHolder to set the VIew or say layout
 */

public class AdapterToBindData extends RecyclerView.Adapter<AdapterToBindData.meraViewHolder> {

    List<models> mereItems;
    Context randomcontext;

    public AdapterToBindData(List<models> mereItems, Context randomcontext) {
        this.mereItems = mereItems;
        this.randomcontext = randomcontext;
    }

    @Override
    public meraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li = LayoutInflater.from(randomcontext);
        View mview = li.inflate(R.layout.recyclerview_items,null);
        return new meraViewHolder(mview);

    }

    @Override
    public void onBindViewHolder(meraViewHolder holder, int position) {
        models mereModelSeFetchedItems = mereItems.get(position);
        holder.tvName.setText(mereModelSeFetchedItems.getChatName());
        holder.tvChat.setText(mereModelSeFetchedItems.getActualChat());
    }

    @Override
    public int getItemCount() {
        return mereItems.size();
    }

    public class meraViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvChat;

        public meraViewHolder(View kaisaDikhega) {
            super(kaisaDikhega);

            tvName = kaisaDikhega.findViewById(R.id.tvName);
            tvChat = kaisaDikhega.findViewById(R.id.tvChat);

        }
    }
}
