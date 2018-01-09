package com.melnykov.fab.sample.fragment;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.melnykov.fab.FloatingActionButton;
import com.melnykov.fab.sample.R;
import com.melnykov.fab.sample.adapter.RecyclerViewAdapter;
import com.melnykov.fab.sample.base.BaseFragment;
import com.melnykov.fab.sample.widget.DividerItemDecoration;

import butterknife.Bind;

public class RecyclerViewFragment extends BaseFragment {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    public static RecyclerViewFragment getInstance() {
        return new RecyclerViewFragment();
    }

    @Override
    public int initContentView() {
        return R.layout.fragment_recyclerview;
    }

    @Override
    protected void initUi() {
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL_LIST));

        fab.attachToRecyclerView(recyclerView);
    }

    @Override
    protected void initDatas() {
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getActivity(), getResources()
                .getStringArray(R.array.countries));
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initListener() {

    }
}
