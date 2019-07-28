package com.minhnv.assignmentnetworking.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.minhnv.assignmentnetworking.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutUSFragment extends Fragment {


    public AboutUSFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about_u, container, false);
    }

}
