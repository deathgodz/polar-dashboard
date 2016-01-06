package com.afollestad.polar.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.afollestad.polar.R;
import com.afollestad.polar.adapters.AboutAdapter;
import com.afollestad.polar.fragments.base.BaseTabFragment;

import butterknife.ButterKnife;


public class AboutFragment extends BaseTabFragment {

    public AboutFragment() {
    }

    @Override
    public int getTitle() {
        return R.string.about;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview_bare, container, false);
        RecyclerView recyclerView = ButterKnife.findById(v, android.R.id.list);
        recyclerView.setClipToPadding(false);
        LinearLayoutManager lm = new LinearLayoutManager(getActivity());
        AboutAdapter mAdapter = new AboutAdapter(getActivity());
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(mAdapter);
        return v;
    }
}