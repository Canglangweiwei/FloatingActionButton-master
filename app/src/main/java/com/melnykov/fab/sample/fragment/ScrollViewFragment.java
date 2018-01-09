package com.melnykov.fab.sample.fragment;

import android.widget.LinearLayout;
import android.widget.TextView;

import com.melnykov.fab.FloatingActionButton;
import com.melnykov.fab.ObservableScrollView;
import com.melnykov.fab.sample.R;
import com.melnykov.fab.sample.base.BaseFragment;

import butterknife.Bind;

public class ScrollViewFragment extends BaseFragment {

    @Bind(R.id.scroll_view)
    ObservableScrollView scrollView;
    @Bind(R.id.list)
    LinearLayout list;
    @Bind(R.id.fab)
    FloatingActionButton fab;

    public static ScrollViewFragment getInstance() {
        return new ScrollViewFragment();
    }

    @Override
    public int initContentView() {
        return R.layout.fragment_scrollview;
    }

    @Override
    protected void initUi() {

    }

    @Override
    protected void initDatas() {
        String[] countries = getResources().getStringArray(R.array.countries);
        for (String country : countries) {
            TextView textView = (TextView) mRootInflater.inflate(R.layout.list_item, mRootViewGroupContainer, false);
            String[] values = country.split(",");
            String countryName = values[0];
            int flagResId = getResources().getIdentifier(values[1], "drawable", getActivity().getPackageName());
            textView.setText(countryName);
            textView.setCompoundDrawablesWithIntrinsicBounds(flagResId, 0, 0, 0);

            list.addView(textView);
        }
        fab.attachToScrollView(scrollView);
    }

    @Override
    protected void initListener() {

    }
}
