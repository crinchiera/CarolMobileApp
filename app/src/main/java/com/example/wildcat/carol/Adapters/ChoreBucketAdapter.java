//package com.example.wildcat.carol.Adapters;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.example.wildcat.carol.R;
//
///**
// * Created by Wildcat on 4/23/2016.
// */
//public class ChoreBucketAdapter extends ArrayAdapter<String> {
//    private final Context context;
//    private final String[] values;
//
//    public ChoreBucketAdapter(Context context, String[] values) {
//        super(context, -1, values);
//        this.context = context;
//        this.values = values;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View rowView = inflater.inflate(R.layout.chore_bucket_fragment, parent, false);
//        TextView textView = (TextView) rowView.findViewById(R.id.label);
//        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
//        textView.setText(values[position]);
//        // change the icon for Windows and iPhone
//        String s = values[position];
//        if (s.startsWith("iPhone")) {
//            imageView.setImageResource(R.drawable.jeff_icon);
//        } else {
//            imageView.setImageResource(R.drawable.jeremy_icon);
//        }
//
//        return rowView;
//    }
//}
