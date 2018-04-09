package vn.home.htm.tripdemo.screen.login;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;

import vn.home.htm.tripdemo.base.BaseViewModel;

/**
 * Created by HaiMinhTran on 3/26/2018.
 */

public class LoginViewModel extends BaseViewModel {

    public LoginViewModel(Context context) {
        super(context);
    }

    public void onClick() {

    }

    private void setNotificationsEnabled(boolean enabled) {
        /*String packageName = mContext.getPackageName();
        NotificationManager notificationManager = (NotificationManager) mContext.getSystemService(Service.NOTIFICATION_SERVICE);
        NotificationManagerService
        try {
           *//* notificationManager.setNotificationsEnabledForPackage(packageName, mContext.getApplicationInfo().uid, enabled);*//*
           notificationManager.setNotificationPolicy();
        } catch (Exception ex) {

        }*/
    }

}
