package com.example.wildcat.carol.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wildcat.carol.R;

import roboguice.fragment.RoboFragment;

/**
 * Created by Wildcat on 4/20/2016.
 */
public class ChoresFragment2 extends RoboFragment {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //  setupRecyclerView();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.chores2_fragment, container, false);



        return view;
    }
}
