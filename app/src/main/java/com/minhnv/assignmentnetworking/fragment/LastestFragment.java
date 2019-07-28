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

import com.minhnv.assignmentnetworking.databinding.FragmentLastestBinding;
import com.minhnv.assignmentnetworking.model.Embedded;
import com.minhnv.assignmentnetworking.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LastestFragment extends Fragment {

    private FragmentLastestBinding binding;
    private List<Embedded> embeddeds;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding = FragmentLastestBinding.inflate(inflater,container,false);

       return binding.getRoot();
    }


}
