package com.example.animatedrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
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

        //animation for image
        holder.singleImage.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_transition_animation));


        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_content.setText(mData.get(position).getContent());
        holder.tv_date.setText(mData.get(position).getDate());
        holder.singleImage.setImageResource(mData.get(position).getImage());





    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class RecyclicViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title, tv_content, tv_date;
        ImageView singleImage;

        public RecyclicViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_content = itemView.findViewById(R.id.tv_description);
            tv_date = itemView.findViewById(R.id.tvDate);
            singleImage = itemView.findViewById(R.id.single_image_id);


        }
    }
}
