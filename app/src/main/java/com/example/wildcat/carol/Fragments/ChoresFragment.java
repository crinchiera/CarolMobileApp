package com.example.wildcat.carol.Fragments;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wildcat.carol.Activities.MainActivity;
import com.example.wildcat.carol.R;
import com.mingle.sweetpick.RecyclerViewDelegate;
import com.mingle.sweetpick.SweetSheet;

import roboguice.fragment.RoboFragment;
import roboguice.inject.InjectView;

/**
 * Created by Wildcat on 3/30/2016.
 */
public class ChoresFragment extends RoboFragment {

    @InjectView(R.id.chores_todo_textview)
    TextView choresToDo;
    @InjectView(R.id.chores_completed_textview)
    TextView choresCompleted;
    @InjectView(R.id.coinTextView) TextView coinTextView;

    String michaelToDo, michaelCompleted, coins;


    private SweetSheet mSweetSheet;
    private RecyclerViewDelegate recyclerViewDelegate;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setupRecyclerView();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.chores_fragment, container, false);




        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        // set a onclick listener for when the button gets clicked

        choresToDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("toDo");
                fragmentTransaction.replace(R.id.frame_layout, new ChoresToDoFragment());
                fragmentTransaction.commit();


            }
        });

        choresCompleted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack("Completed");
                fragmentTransaction.replace(R.id.frame_layout, new ChoresCompletedFragment());
                fragmentTransaction.commit();
            }
        });

        michaelToDo = Integer.toString(MainActivity.michael.toDO);
        michaelCompleted = Integer.toString(MainActivity.michael.completed);
        coins = Integer.toString(MainActivity.michael.coins);

        choresToDo.setText(michaelToDo);
        choresCompleted.setText(michaelCompleted);
        coinTextView.setText(coins);


    }

}




