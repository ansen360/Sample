package com.ansen.sample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LazyFragment extends Fragment {
    String isLoad = "没有被加载";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //开启线程，加载数据成功
        String isLoad = "被加载了";

        return super.onCreateView(inflater, container, savedInstanceState);


    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) { //当然使用getUserVisibleHint()代替isVisibleToUser也可以，看上面的源码就知道，getUserVisibleHint()获取到的就是isVisibleToUser
            /** 这里仅仅只是个伪代码*/
            if (!isLoad.equals("被加载了")) {
                //加载数据
            }
        }
    }
}