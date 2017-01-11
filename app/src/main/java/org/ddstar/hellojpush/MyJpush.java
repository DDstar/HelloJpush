package org.ddstar.hellojpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by DDstar on 2017/1/10.
 */

public class MyJpush extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //此处就是推送过来的消息接收到的地方
        Bundle bundle = intent.getExtras();
        String message = bundle.getString(JPushInterface.EXTRA_MESSAGE);
        if (!TextUtils.isEmpty(message)){
            Log.e("MyJpush", "message = " + message);
            Intent intent1 = new Intent("jpush");
            intent1.putExtra("message",message);
            context.sendBroadcast(intent1);
        }
    }
}
