package com.example.app_revenueandexpenditure_maste.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.app_revenueandexpenditure_maste.Adapter.TabAdapetr;
import com.example.app_revenueandexpenditure_maste.R;
import com.example.app_revenueandexpenditure_maste.TabFragmnet.Tab_Khoanthu;
import com.example.app_revenueandexpenditure_maste.TabFragmnet.Tab_Loaithu;
import com.google.android.material.tabs.TabLayout;

public class Fragment_thu extends Fragment {
    private TabAdapetr adapter;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thu, container, false);

        viewPager =  view.findViewById(R.id.viewPager);
        tabLayout =  view.findViewById(R.id.tabLayout);

        adapter = new TabAdapetr(getActivity().getSupportFragmentManager());
        adapter.addFragment(new Tab_Khoanthu(), "Khoản thu");
        adapter.addFragment(new Tab_Loaithu(), "Loại thu");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}
