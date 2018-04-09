package vn.home.htm.tripdemo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by HaiMinhTran on 4/2/2018.
 */

public class ActivityUtils {
    /**
     * Hide soft input keyboard
     *
     * @param activity Current active activity
     */
    public static void hideKeyboard(@NonNull Activity activity) {
        View view = activity.getCurrentFocus();
        if (view == null) {
            return;
        }
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /**
     * Show soft input keyboard
     *
     * @param activity Current active activity
     */
    public static void showKeyboard(@NonNull Activity activity) {
        View view = activity.getCurrentFocus();
        if (view == null) {
            return;
        }
        InputMethodManager inputMethodManager =
                (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.showSoftInput(view, 0);
    }

    public static void startActivity(Activity activity, Class activityClass) {
        Intent intent = new Intent(activity, activityClass);
        activity.startActivity(intent);
    }

    public static void startActivityForResult(Activity activity, Class activityClass, int code) {
        Intent intent = new Intent(activity, activityClass);
        activity.startActivityForResult(intent, code);
    }
}
