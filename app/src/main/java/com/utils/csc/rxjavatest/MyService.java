package com.utils.csc.rxjavatest;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        return new DownLoader();
    }
    public class DownLoader extends Binder{
        public void startDownLoad(){

        }
        public void getProgress(){

        }
    }
}
