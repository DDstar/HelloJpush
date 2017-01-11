package org.ddstar.hellojpush;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by DDstar on 2017/1/10.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.init(this);
        JPushInterface.setDebugMode(true);
    }
}
