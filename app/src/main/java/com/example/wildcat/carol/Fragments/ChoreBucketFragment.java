package com.example.wildcat.carol.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.wildcat.carol.Activities.MainActivity;
import com.example.wildcat.carol.Models.UserProfile;
import com.example.wildcat.carol.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import roboguice.fragment.RoboFragment;

/**
 * Created by Wildcat on 4/23/2016.
 */
public class ChoreBucketFragment extends RoboFragment {

    ListView listview;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //  setupRecyclerView();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance) {

        View view = inflater.inflate(R.layout.rowlayout, container, false);


        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        // set a onclick listener for when the button gets clicked
        listview = (ListView) getActivity().findViewById(R.id.list);


        final ArrayList<Object> list = new ArrayList<Object>();
        Set<String> keys = MainActivity.bucket.keySet();
        for(String key: keys){
            list.add(MainActivity.bucket.get(key));
        }
        final StableArrayAdapter adapter = new StableArrayAdapter(this.getContext(),
                android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {
                final String item = (String) parent.getItemAtPosition(position);
                view.animate().setDuration(2000).alpha(0)
                        .withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                list.remove(item);
                                adapter.notifyDataSetChanged();
                                view.setAlpha(1);
                            }
                        });

                Toast.makeText(getActivity().getApplicationContext(), item + " added to your chores", Toast.LENGTH_SHORT).show();

                MainActivity.michael.toDoList.put(item.toString(), item);
                MainActivity.michael.toDO++;
                MainActivity.bucket.remove(item);


            }

        });


    }
    private class StableArrayAdapter extends ArrayAdapter<Object> {

        HashMap<Object, Integer> mIdMap = new HashMap<Object, Integer>();

        public StableArrayAdapter(Context context, int textViewResourceId,
                                  List<Object> objects) {
            super(context, textViewResourceId, objects);
            for (int i = 0; i < objects.size(); ++i) {
                mIdMap.put(objects.get(i), i);
            }
        }

        @Override
        public long getItemId(int position) {
            Object item = getItem(position);
            return mIdMap.get(item);
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

    }
}
