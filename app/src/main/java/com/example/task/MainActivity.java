package com.example.task;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.task.TabLayout.LoginFragment;
import com.example.task.TabLayout.RegFragment;
import com.example.task.databinding.ActivityMain1Binding;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
public class MainActivity extends AppCompatActivity {
    ActivityMain1Binding binding;
    FragmentPagerItemAdapter fragmentPagerItemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main1);
        initTablayout();

    }



    public void initTablayout(){
        fragmentPagerItemAdapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("دخول", LoginFragment.class)
                .add("تسجيل", RegFragment.class)

                .create());


        binding.viewpager.setAdapter(fragmentPagerItemAdapter);
        binding.tabLayout.setViewPager(binding.viewpager);

        binding.viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                binding.viewpager.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }
}
