package vn.home.htm.tripdemo.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import vn.home.htm.tripdemo.R;

/**
 * Created by HaiMinhTran on 3/15/2018.
 */

public class BaseActivity extends AppCompatActivity {
    //protected boolean isOnline;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        overridePendingTransition(R.anim.right_center, R.anim.center_left);
    }

    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
        overridePendingTransition(R.anim.right_center, R.anim.center_left);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.left_center, R.anim.center_right);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //isOnline = true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        //isOnline = false;
    }
}
