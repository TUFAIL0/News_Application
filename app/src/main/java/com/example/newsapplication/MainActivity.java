package com.example.newsapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;

    TabItem mhome;
    TabItem mscience;
    TabItem mhealth;
    TabItem mtech;
    TabItem msport;
    TabItem mentertainment;
    PagerAdapter PagerAdapter;
    Toolbar mtoolbar;


    String api = "b0400680f6fa4a7ab475a4c398a7ce00";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);


        mhome =findViewById(R.id.Home);
        mhealth = findViewById(R.id.Health);
        mtech = findViewById(R.id.Technology);
        msport = findViewById(R.id.Sport);
        mentertainment = findViewById(R.id.Entertainment);
        mscience=findViewById(R.id.Science);

        ViewPager viewPager = findViewById(R.id.fragmentContainer);

        tabLayout = findViewById(R.id.include);


        PagerAdapter =  new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(PagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==5)
                {
                    PagerAdapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));





    }
}