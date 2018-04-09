package vn.home.htm.tripdemo.screen.weather.SettingUnitWeather;

import android.content.Context;

import vn.home.htm.tripdemo.base.BaseViewModel;

/**
 * Created by HaiMinhTran on 3/18/2018.
 */

public class SettingUnitWeatherViewModel extends BaseViewModel  {

    public SettingUnitWeatherViewModel(Context context) {
        super(context);
    }

    public void listenerDone() {
        ((SettingUnitWeatherNavigate) mNavigator).closeSetting();
    }
}
