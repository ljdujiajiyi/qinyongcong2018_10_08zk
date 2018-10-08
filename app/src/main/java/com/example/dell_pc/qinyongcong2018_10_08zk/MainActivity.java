package com.example.dell_pc.qinyongcong2018_10_08zk;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dell_pc.qinyongcong2018_10_08zk.fragment.Fragmentone;
import com.example.dell_pc.qinyongcong2018_10_08zk.fragment.Fragmentthree;
import com.example.dell_pc.qinyongcong2018_10_08zk.fragment.Fragmenttwo;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//集合
    List<Fragment> list=new ArrayList<>();
    private ViewPager mViewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找控件
        mViewpager =findViewById(R.id.mViewpager);
        Button b1=findViewById(R.id.b1);
        Button b2=findViewById(R.id.b2);
        Button b3=findViewById(R.id.b3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        //添加到集合
        list.add(new Fragmentone());
        list.add(new Fragmenttwo());
        list.add(new Fragmentthree());
        //适配器
        MyAdpater myAdpater=new MyAdpater(getSupportFragmentManager());
        mViewpager.setAdapter(myAdpater);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b1:
                mViewpager.setCurrentItem(0);
                break;
            case R.id.b2:
                mViewpager.setCurrentItem(1);
                break;
            case R.id.b3:
                mViewpager.setCurrentItem(2);
                break;
        }
    }

    class MyAdpater extends FragmentPagerAdapter{

        public MyAdpater(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return list.get(position);
        }

        @Override
        public int getCount() {
            return list.size();
        }
    }
}
