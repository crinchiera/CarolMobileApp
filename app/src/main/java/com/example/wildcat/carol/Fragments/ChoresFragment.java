package com.example.wildcat.carol.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wildcat.carol.R;

import roboguice.fragment.RoboFragment;

/**
 * Created by Wildcat on 3/30/2016.
 */
public class ChoresFragment extends RoboFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.chores_fragment, container, false);

        return view;
    }

}
