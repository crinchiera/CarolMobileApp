package com.example.wildcat.carol.Fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.wildcat.carol.R;

import roboguice.fragment.RoboFragment;
import roboguice.inject.InjectView;

/**
 * Created by Wildcat on 4/1/2016.
 */
public class HouseFragment extends RoboFragment {

    @InjectView(R.id.jeremy)
    ImageView jeremy;
    @InjectView(R.id.matt)
    ImageView matt;
    @InjectView(R.id.jeff)
    ImageView jeff;
    @InjectView(R.id.danny)
    ImageView danny;
    @InjectView(R.id.michael)
    ImageView michael;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.house_fragment, container, false);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        // set a onclick listener for when the button gets clicked

        michael.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("chores");
                fragmentTransaction.replace(R.id.frame_layout, new ChoresFragment());
                fragmentTransaction.commit();
            }
        });
        jeremy.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("chores2");
                fragmentTransaction.replace(R.id.frame_layout, new ChoresFragment2());
                fragmentTransaction.commit();
            }
        });

        matt.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("chores3");
                fragmentTransaction.replace(R.id.frame_layout, new ChoresFragment3());
                fragmentTransaction.commit();
            }
        });

        jeff.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("chores4");
                fragmentTransaction.replace(R.id.frame_layout, new ChoresFragment4());
                fragmentTransaction.commit();
            }
        });

        danny.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("chores5");
                fragmentTransaction.replace(R.id.frame_layout, new ChoresFragment5());
                fragmentTransaction.commit();
            }
        });
    }


}
