package com.example.group_3.ee_b_group_3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void closeProgram(View view) {
        try {
            ActivityManager am = (ActivityManager) this.getApplicationContext().getSystemService(Context.ACTIVITY_SERVICE);
            am.killBackgroundProcesses(getPackageName());
            System.exit(0);
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void activityDescribe(View view) {
        Intent intent = new Intent(this, activity_describe.class);
        startActivity(intent);
    }
}
