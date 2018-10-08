package com.example.dell_pc.qinyongcong2018_10_08zk.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.dell_pc.qinyongcong2018_10_08zk.R;
import com.example.dell_pc.qinyongcong2018_10_08zk.Weaterview;

/*
 * 作者：秦永聪
 *日期：2018/10/8
 * */public class Fragmentone extends Fragment {
   private Weaterview weaterview;
    private ImageView img;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentone, container, false);
       img=view.findViewById(R.id.img);
       weaterview=view.findViewById(R.id.Weaterview);
        return view;
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        final RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) img.getLayoutParams();
//        weaterview.anmio(new Weaterview.Animalister() {
//            @Override
//            public void anmio(float f) {
//                params.setMargins(0,0,0, (int) f);
//                img.setLayoutParams(params);
//            }
//        });
//    }
}
