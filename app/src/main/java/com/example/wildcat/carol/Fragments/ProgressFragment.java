package com.example.wildcat.carol.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.widget.LinearLayout;

import com.example.wildcat.carol.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

import roboguice.activity.RoboActionBarActivity;
import roboguice.fragment.support.SupportFragmentUtil;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;
import roboguice.fragment.RoboFragment;
import roboguice.inject.ContentView;

/**
 * Created by Wildcat on 4/1/2016.
 */
public class ProgressFragment extends RoboFragment {

    @InjectView(R.id.chart) BarChart barChart;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.progress_fragment, container, false);



        return view;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));

        BarDataSet dataset = new BarDataSet(entries, "Coins");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("Michael");
        labels.add("Danny");
        labels.add("Jeff");
        labels.add("Jeremy");
        labels.add("Matt");

        BarData data = new BarData(labels, dataset);
        barChart.setData(data); // set the data and list of lables into chart

        barChart.setDescription("Housemate Contributions");  // set the description
    }


}
