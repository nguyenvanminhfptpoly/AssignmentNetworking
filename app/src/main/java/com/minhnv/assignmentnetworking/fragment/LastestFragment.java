package com.minhnv.assignmentnetworking.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.minhnv.assignmentnetworking.Ultil.APIUltil;

import com.minhnv.assignmentnetworking.adapter.Adapter_Posts;
import com.minhnv.assignmentnetworking.databinding.FragmentLastestBinding;
import com.minhnv.assignmentnetworking.model.Embedded;
import com.minhnv.assignmentnetworking.model.MediaDetails;
import com.minhnv.assignmentnetworking.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LastestFragment extends Fragment {

    private FragmentLastestBinding binding;
    private List<MediaDetails> embeddeds;
    private Adapter_Posts adapter_posts;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding = FragmentLastestBinding.inflate(inflater,container,false);
        GetPost();
       return binding.getRoot();
    }
    private void GetPost(){
        binding.rycLastest.setHasFixedSize(true);
        binding.rycLastest.setLayoutManager(new GridLayoutManager(getActivity(), 2));

     APIUltil.getData().GetPost("").enqueue(new Callback<Post>() {
         @Override
         public void onResponse(Call<Post> call, Response<Post> response) {
             Log.d("///", response.body()+"");
         }

         @Override
         public void onFailure(Call<Post> call, Throwable t) {

         }
     });
    }

}
