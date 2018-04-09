package vn.home.htm.tripdemo.screen.weather.SettingUnitWeather;

import vn.home.htm.tripdemo.R;
import vn.home.htm.tripdemo.base.BaseDataBindActivity;
import vn.home.htm.tripdemo.databinding.ActivitySettingUnitWeatherBinding;
import vn.home.htm.tripdemo.screen.MainActivity;
import vn.home.htm.tripdemo.utils.ActivityUtils;

public class SettingUnitWeatherActivity extends BaseDataBindActivity<ActivitySettingUnitWeatherBinding,SettingUnitWeatherViewModel> implements SettingUnitWeatherNavigate {
    private SettingUnitWeatherViewModel mViewModel;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting_unit_weather;
    }

    @Override
    protected void initData() {
        mViewModel = new SettingUnitWeatherViewModel(this);
        mViewModel.setmNavigator(this);
        mBinding.setViewModel(mViewModel);
    }

    @Override
    public void onBackPress() {
        finish();
    }

    @Override
    public void closeSetting() {
        ActivityUtils.startActivity(this, MainActivity.class);
        finish();
    }
}