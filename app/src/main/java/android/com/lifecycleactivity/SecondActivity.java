package android.com.lifecycleactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    private static String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG, "onCreate second: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart Second: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume Second: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause second: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop second: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart second: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy second: ");
    }

    public void stopSecondActivity(View view){
        finish();
    }

}
