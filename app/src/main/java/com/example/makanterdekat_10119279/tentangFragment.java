package com.example.makanterdekat_10119279;

/**
 * NIM      : 10119279
 * Nama     : Martua Febrianto
 * Kelas    : IF-7
 */


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class tentangFragment extends Fragment {

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_tentang, container, false);

        viewPager = root.findViewById(R.id.pager);

        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        List<Fragment> list = new ArrayList<>();
        list.add(new firstTentangFragment());
        list.add(new secondTentangFragment());

        pagerAdapter = new tentangViewModel(requireActivity().getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
    }
}