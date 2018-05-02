package com.ansen.sample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LazyFragment extends Fragment {

    private boolean mIsInit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mIsInit = true; // View 控件的初始化
        isLoadData();   // 这里还需满足条件1: 视图对用户可见
        return super.onCreateView(inflater, container, savedInstanceState);


    }

    /**
     * 这个方法是通知Fragment的UI是否可见，当参数isVisibleToUser为true的时候，fragment的UI是可见的，为false的时候为不可见
     */
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        isLoadData();   // 还需满足条件2: 视图已经初始化
    }

    private void isLoadData() {
        if (getUserVisibleHint()) {
            if (mIsInit) {
                // 满足以上两个条件才加载数据
            }

        }
    }
}