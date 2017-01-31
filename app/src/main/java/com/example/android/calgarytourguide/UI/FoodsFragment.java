package com.example.android.calgarytourguide.UI;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.calgarytourguide.Model.Item;
import com.example.android.calgarytourguide.Model.ItemAdapter;
import com.example.android.calgarytourguide.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodsFragment extends Fragment {

    private ArrayList<Item> items = new ArrayList<>();

    public FoodsFragment() {
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

        items.add(new Item(getContext().getString(R.string.food_activity_1),
                getContext().getString(R.string.food_description_1),
                getContext().getString(R.string.food_address_1),
                getContext().getString(R.string.food_phone_1)));
        items.add(new Item(getContext().getString(R.string.food_activity_2),
                getContext().getString(R.string.food_description_2),
                getContext().getString(R.string.food_address_2),
                getContext().getString(R.string.food_phone_2)));
        items.add(new Item(getContext().getString(R.string.food_activity_3),
                getContext().getString(R.string.food_description_3),
                getContext().getString(R.string.food_address_3),
                getContext().getString(R.string.food_phone_3)));
        items.add(new Item(getContext().getString(R.string.food_activity_4),
                getContext().getString(R.string.food_description_4),
                getContext().getString(R.string.food_address_4),
                getContext().getString(R.string.food_phone_4)));
        items.add(new Item(getContext().getString(R.string.food_activity_5),
                getContext().getString(R.string.food_description_5),
                getContext().getString(R.string.food_address_5),
                getContext().getString(R.string.food_phone_5)));
        items.add(new Item(getContext().getString(R.string.food_activity_6),
                getContext().getString(R.string.food_description_6),
                getContext().getString(R.string.food_address_6),
                getContext().getString(R.string.food_phone_6)));
        items.add(new Item(getContext().getString(R.string.food_activity_7),
                getContext().getString(R.string.food_description_7),
                getContext().getString(R.string.food_address_7),
                getContext().getString(R.string.food_phone_7)));
        items.add(new Item(getContext().getString(R.string.food_activity_8),
                getContext().getString(R.string.food_description_8),
                getContext().getString(R.string.food_address_8),
                getContext().getString(R.string.food_phone_8)));

        ItemAdapter itemAdapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long d) {
                Item currentItem = items.get(position);
                Uri number = Uri.parse("tel:" + currentItem.getPhone());
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });

        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();
    }
}
