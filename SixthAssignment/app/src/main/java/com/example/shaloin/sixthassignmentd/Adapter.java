package com.example.shaloin.sixthassignmentd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by shaloin on 8/11/16.
 */

public class Adapter extends FragmentPagerAdapter {
    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                return new Audio();
            case 1:
                return new Video();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
