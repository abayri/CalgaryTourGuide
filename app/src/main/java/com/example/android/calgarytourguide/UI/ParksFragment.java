package com.example.android.calgarytourguide.UI;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.calgarytourguide.Model.Item;
import com.example.android.calgarytourguide.Model.ItemAdapter;
import com.example.android.calgarytourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {

    private final ArrayList<Item> items = new ArrayList<>();

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Prevents repitition in adding items to ArrayList
        if (items != null) {
            items.clear();
        }

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        items.add(new Item(getContext().getString(R.string.park_activity_1),
                getContext().getString(R.string.park_address_1), R.drawable.fishcreek));
        items.add(new Item(getContext().getString(R.string.park_activity_2),
                getContext().getString(R.string.park_address_2), R.drawable.nosehill));
        items.add(new Item(getContext().getString(R.string.park_activity_3),
                getContext().getString(R.string.park_address_3), R.drawable.bowness));
        items.add(new Item(getContext().getString(R.string.park_activity_4),
                getContext().getString(R.string.park_address_4), R.drawable.princes_island));
        items.add(new Item(getContext().getString(R.string.park_activity_5),
                getContext().getString(R.string.park_address_5), R.drawable.edworthy));
        items.add(new Item(getContext().getString(R.string.park_activity_6),
                getContext().getString(R.string.park_address_6), R.drawable.confederation));
        items.add(new Item(getContext().getString(R.string.park_activity_7),
                getContext().getString(R.string.park_address_7), R.drawable.north_glenmore));
        items.add(new Item(getContext().getString(R.string.park_activity_8),
                getContext().getString(R.string.park_address_8), R.drawable.south_glenmore));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
