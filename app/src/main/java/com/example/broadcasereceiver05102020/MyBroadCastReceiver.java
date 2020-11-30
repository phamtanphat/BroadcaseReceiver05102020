package com.example.broadcasereceiver05102020;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String message = intent.getStringExtra("Message");
        Toast.makeText(context, message , Toast.LENGTH_SHORT).show();
    }
}
