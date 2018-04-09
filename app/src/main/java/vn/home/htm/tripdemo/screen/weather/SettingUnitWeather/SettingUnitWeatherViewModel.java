package vn.home.htm.tripdemo.screen.weather.SettingUnitWeather;

import android.content.Context;
import android.databinding.ObservableField;

import vn.home.htm.tripdemo.base.BaseViewModel;
import vn.home.htm.tripdemo.constants.Constant;
import vn.home.htm.tripdemo.data.source.local.SharedPreferenceApi;

/**
 * Created by HaiMinhTran on 3/18/2018.
 */

public class SettingUnitWeatherViewModel extends BaseViewModel {
    public ObservableField<Boolean> isTemperatureF = new ObservableField<>(true);
    public ObservableField<Boolean> isTimeA = new ObservableField<>(true);
    public ObservableField<Boolean> isNotification = new ObservableField<>(true);
    public ObservableField<Boolean> isStatus = new ObservableField<>(true);
    private SharedPreferenceApi mSharedPreferenceApi;

    public SettingUnitWeatherViewModel(Context context) {
        super(context);
        mSharedPreferenceApi = SharedPreferenceApi.getInstance(context);
        getUnit();
    }

    public void listenerDone() {
        saveUnit();
        ((SettingUnitWeatherNavigate) mNavigator).closeSetting();
    }

    private void saveUnit() {
        mSharedPreferenceApi.clear();
        mSharedPreferenceApi.put(Constant.IS_NOTIFICATION, isNotification.get());
        mSharedPreferenceApi.put(Constant.IS_SHARE_TEMPERATURE, isTemperatureF);
        mSharedPreferenceApi.put(Constant.IS_SHARE_TIME, isTimeA);
        mSharedPreferenceApi.put(Constant.IS_STATUS, isStatus);
    }

    private void getUnit() {
        isTemperatureF.set(mSharedPreferenceApi.get(Constant.IS_SHARE_TEMPERATURE, Boolean.class, true));
        isNotification.set(mSharedPreferenceApi.get(Constant.IS_NOTIFICATION, Boolean.class, true));
        isStatus.set(mSharedPreferenceApi.get(Constant.IS_STATUS, Boolean.class, false));
        isTimeA.set(mSharedPreferenceApi.get(Constant.IS_SHARE_TIME, Boolean.class, false));
    }

    public void onClickTemp(){

    }

    public void onClickTime(){

    }

    public void onClickNotification(boolean isTurnOn){
        isNotification.set(isTurnOn);
    }

    public void onClickStatus(boolean isTurnOn){
        isStatus.set(isTurnOn);
    }
}
