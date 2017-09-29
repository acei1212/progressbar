package com.example.student.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar pb,pb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pb = (ProgressBar) findViewById(R.id.progressBar);
        pb2 = (ProgressBar) findViewById(R.id.progressBar2);

    }

    public void click1(View v) {
        pb.setVisibility(View.VISIBLE);

    }

    public void click2(View v) {
        pb.setVisibility(View.INVISIBLE);

    }

    public void click3(View v) {
        {
            pb.setVisibility(View.VISIBLE);
            new Thread() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            pb.setVisibility(View.INVISIBLE);
                        }
                    });
                }
            }.start();
        }}

    public void click4(View v){
        pb2.setProgress(pb2.getProgress()+10);
    }
    public void click5(View v){
        pb2.setProgress(pb2.getProgress()-10);
    }

}
