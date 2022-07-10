package com.example.newsapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class PagerAdapter extends FragmentPagerAdapter {
    int tabcount;
       public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0 :
                return new HomeFragment();

            case 1 :
                return new Sport();
            case 2:
                return new Health();

            case 3:
                return new Science();

            case 4:
                return new Technology();

            case 5 :
                return new Entertainment();

            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
