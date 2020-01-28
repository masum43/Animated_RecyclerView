package com.example.animatedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclicViewHolder> {


    Context context;
    List<RecyclerItem> mData;

    public RecyclerAdapter(Context context, List<RecyclerItem> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layout;
        layout = LayoutInflater.from(context).inflate(R.layout.single_item,parent,false);
        return new RecyclicViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclicViewHolder holder, int position) {

        //binding data here
        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_content.setText(mData.get(position).getCOntent());
        holder.tv_date.setText(mData.get(position).getDate());




    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class RecyclicViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title, tv_content, tv_date;

        public RecyclicViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_content = itemView.findViewById(R.id.tv_description);
            tv_date = itemView.findViewById(R.id.tvDate);


        }
    }
}
