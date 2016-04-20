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

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BarChart barChart = (BarChart) getView().findViewById(R.id.chart);

        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(4f, 0));
        entries.add(new BarEntry(8f, 1));
        entries.add(new BarEntry(6f, 2));
        entries.add(new BarEntry(12f, 3));
        entries.add(new BarEntry(18f, 4));
        entries.add(new BarEntry(9f, 5));

        BarDataSet dataset = new BarDataSet(entries, "# of Calls");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("User1");
        labels.add("User2");
        labels.add("User3");
        labels.add("User4");
        labels.add("User5");
        labels.add("User6");

        BarData data = new BarData(labels, dataset);
        barChart.setData(data); // set the data and list of lables into chart

        barChart.setDescription("Housemate Contributions");  // set the description
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.progress_fragment, container, false);



        return view;
    }


}
