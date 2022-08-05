package com.sebastianrod.whale_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class WhaleAdapter extends RecyclerView.Adapter<WhaleAdapter.ViewHolder> {

    private ArrayList<WhaleModel> whaleModels;

    public WhaleAdapter(ArrayList<WhaleModel> whaleModels) {
        this.whaleModels = whaleModels;
    }

    @NonNull
    @Override
    public WhaleAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.whale_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull WhaleAdapter.ViewHolder holder, int position) {
        holder.whaleName.setText(whaleModels.get(position).getWhaleName());
        Glide.with(holder.itemView.getContext()).load(whaleModels.get(position).getWhaleImage()).into(holder.whaleImage);
    }

    @Override
    public int getItemCount() {
        return whaleModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView whaleName;
        ImageView whaleImage;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            whaleImage = itemView.findViewById(R.id.whale_image);
            whaleName = itemView.findViewById(R.id.whale_name);
        }
    }
}

