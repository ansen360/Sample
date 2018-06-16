package com.ansen.sample;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.FrameMetrics;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traditional);
//        setContentView(R.layout.activity_constraintlayout);
        getWindow().addOnFrameMetricsAvailableListener(new Window.OnFrameMetricsAvailableListener() {
            @Override
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int dropCountSinceLastInvocation) {
//                // Layout measure duration in nanoseconds
                long layoutMeasureDurationNs = frameMetrics.getMetric(FrameMetrics.LAYOUT_MEASURE_DURATION);
                Log.d("ansen", "layoutMeasureDurationNs: " + layoutMeasureDurationNs);
            }
        }, new Handler());

    }

}
