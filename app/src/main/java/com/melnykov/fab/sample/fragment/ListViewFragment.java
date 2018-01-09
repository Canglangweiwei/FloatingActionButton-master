package com.melnykov.fab.sample.fragment;

import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;
import com.melnykov.fab.sample.R;
import com.melnykov.fab.sample.adapter.ListViewAdapter;
import com.melnykov.fab.sample.base.BaseFragment;

import butterknife.Bind;

public class ListViewFragment extends BaseFragment {

    @Bind(R.id.list)
    ListView list;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    public static ListViewFragment getInstance() {
        return new ListViewFragment();
    }

    @Override
    public int initContentView() {
        return R.layout.fragment_listview;
    }

    @Override
    protected void initUi() {

    }

    @Override
    protected void initDatas() {
        ListViewAdapter listAdapter = new ListViewAdapter(getActivity(),
                getResources().getStringArray(R.array.countries));
        list.setAdapter(listAdapter);
        fab.attachToListView(list);
    }

    @Override
    protected void initListener() {

    }
}