package com.ansen.sample;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by Ansen on 2018/4/25 14:54.
 *
 * @E-mail: ansen360@126.com
 * @Blog: "http://blog.csdn.net/qq_25804863"
 * @Github: "https://github.com/ansen360"
 * @PROJECT_NAME: Sample
 * @PACKAGE_NAME: com.ansen.sample
 * @Description: TODO
 */
public class MyIntentService extends IntentService {

    public MyIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        // 处理耗时逻辑,处理完自定停止
    }
}
