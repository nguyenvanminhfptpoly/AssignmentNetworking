package com.minhnv.assignmentnetworking.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhnv.assignmentnetworking.R;
import com.minhnv.assignmentnetworking.databinding.ItemPostsBinding;
import com.minhnv.assignmentnetworking.model.MediaDetails;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter_Posts extends RecyclerView.Adapter<Adapter_Posts.Viewhodel> {
    private List<MediaDetails> list;
    private Context context;


    public Adapter_Posts(List<MediaDetails> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewhodel onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        ItemPostsBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_posts,viewGroup,false);
        return new Viewhodel(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewhodel viewhodel, int i) {
        MediaDetails mediaDetails = list.get(i);
//        Picasso.with(context).load(mediaDetails.getSizes().getMedium().getSourceUrl()).into(viewhodel.binding.imageView2);

        viewhodel.binding.textView2.setText(mediaDetails.getWidth()+"");
        viewhodel.binding.textView3.setText(mediaDetails.getHeight()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class Viewhodel extends RecyclerView.ViewHolder{
    ItemPostsBinding binding;
        public Viewhodel(@NonNull ItemPostsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

        }
    }
}
