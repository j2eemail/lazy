package com.lxs.lazy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/6/19.
 */

public class LazyFragment3 extends BaseLazyFragment {

    TextView txt;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item3, container, false);
        txt = (TextView) view.findViewById(R.id.fragment3_txt);
        return view;
    }

    @Override
    public void onFirstUserVisible() {
        Log.d(TAG,"LazyFragment3->onFirstUserVisible");
    }

    @Override
    public void onUserVisible() {
        Log.d(TAG,"LazyFragment3->onUserVisible");
    }

    @Override
    public void onFirstUserInvisible() {
        Log.d(TAG,"LazyFragment3->onFirstUserInvisible");
    }

    @Override
    public void onUserInvisible() {
        Log.d(TAG,"LazyFragment3->onUserInvisible");
    }
}
