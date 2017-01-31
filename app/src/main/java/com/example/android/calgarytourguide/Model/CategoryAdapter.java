package com.example.android.calgarytourguide.Model;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.calgarytourguide.R;
import com.example.android.calgarytourguide.UI.GamesFragment;
import com.example.android.calgarytourguide.UI.FoodsFragment;
import com.example.android.calgarytourguide.UI.MuseumsFragment;
import com.example.android.calgarytourguide.UI.ParksFragment;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private static final int NUMBER_OF_TABS = 4;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0:
                return new ParksFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new GamesFragment();
            case 3:
                return new FoodsFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return mContext.getString(R.string.category_parks);
            case 1:
                return mContext.getString(R.string.category_museums);
            case 2:
                return mContext.getString(R.string.category_games);
            case 3:
                return mContext.getString(R.string.category_food_drinks);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_TABS;
    }
}
