package com.example.wildcat.carol.Adapters;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wildcat.carol.R;

import java.util.ArrayList;

public class ChoreBucketAdapter extends ArrayAdapter<Object> {
    private final Context context;
    private final ArrayList values;
    TextView coin;

    public ChoreBucketAdapter(Context context, ArrayList values) {
        super(context, R.layout.chore_row_layout, values);
        this.context = context;
        this.values = values;
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.chore_row_layout, parent, false);

        coin = (TextView) rowView.findViewById(R.id.coinTextView);

        TextView textView = (TextView) rowView.findViewById(R.id.label);
        textView.setText(values.get(position).toString());
        // Change the icon for Windows and iPhone
        String s = values.get(position).toString();
        if (s == "Do Dishes") {
            coin.setText("4");
        }
        if (s == "Clean Living Room"){
            coin.setText("6");
        }
        if (s == "Take Out Trash"){
            coin.setText("2");
        }
        if (s == "Clean Bathroom"){
            coin.setText("9");
        }
        if (s == "Clean Kitchen"){
            coin.setText("7");
        }


        return rowView;
    }

} 