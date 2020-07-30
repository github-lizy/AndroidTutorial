package com.gangan.imageloader;

import android.os.Bundle;
import android.util.Log;

import com.gangan.imageloader.activity.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            Log.d("ANR-TEST","sleep start");
            Thread.sleep(10*1000);
            Log.e("ANR-TEST","sleep end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
