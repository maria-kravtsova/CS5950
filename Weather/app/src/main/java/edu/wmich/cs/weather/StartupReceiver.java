package edu.wmich.cs.weather;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class StartupReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        PollService.setServiceAlarm(context, true);
    }

}
