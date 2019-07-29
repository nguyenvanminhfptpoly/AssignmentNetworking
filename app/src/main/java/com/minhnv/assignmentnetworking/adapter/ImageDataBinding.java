package com.minhnv.assignmentnetworking.adapter;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.minhnv.assignmentnetworking.R;
import com.squareup.picasso.Picasso;

public class ImageDataBinding {
    @BindingAdapter("android:srcCompat")
    public static void setImageUrl(ImageView view, String url) {
        Picasso.with(view.getContext()).
                load(url).
                placeholder(R.drawable.ic_launcher_background).
                into(view);
    }
}
