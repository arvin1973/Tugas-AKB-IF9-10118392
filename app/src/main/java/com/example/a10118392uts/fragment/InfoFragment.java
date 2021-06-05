package com.example.a10118392uts.fragment;
/*
 * Tanggal pengerjaan : 4 Juni 2021
 * Nim                : 10118392
 * Nama               : Raden Arvin Rizky A
 * Kelas              : IF-9
 * */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.a10118392uts.R;
import com.example.a10118392uts.adapter.SliderPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class InfoFragment extends Fragment {

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info,container,false);

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());

        pager = view.findViewById(R.id.pager);

        pagerAdapter = new SliderPagerAdapter(getActivity().getSupportFragmentManager(), list);

                pager.setAdapter(pagerAdapter);

        return view;
    }
}
