package com.example.android.calgarytourguide.Model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.calgarytourguide.R;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {
    private static final String LOG_TAG = ItemAdapter.class.getSimpleName();

    public ItemAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Item currentItem = getItem(position);

        TextView destinationText = (TextView) listItemView.findViewById(R.id.location_name);
        destinationText.setText(currentItem.getDestination());

        TextView descriptionText = (TextView) listItemView.findViewById(R.id.short_description);

        if (currentItem.hasDescription()) {
            descriptionText.setText(currentItem.getDescription());
            descriptionText.setVisibility(View.VISIBLE);
        } else {
            descriptionText.setVisibility(View.GONE);
        }

        TextView detailsText = (TextView) listItemView.findViewById(R.id.location_details);
        detailsText.setText(currentItem.getDetails());

        TextView phoneText = (TextView) listItemView.findViewById(R.id.phone);

        if (currentItem.hasPhone()) {
            phoneText.setText(currentItem.getPhone());
            phoneText.setVisibility(View.GONE);
        } else {
            phoneText.setVisibility(View.GONE);
        }

        ImageView phoneImage = (ImageView) listItemView.findViewById(R.id.phone_icon);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
            phoneImage.setVisibility(View.GONE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
