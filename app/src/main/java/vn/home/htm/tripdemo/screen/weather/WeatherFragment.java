package vn.home.htm.tripdemo.screen.weather;

import de.markusressel.android.library.pageindicatorview.PageIndicatorView;
import vn.home.htm.tripdemo.R;
import vn.home.htm.tripdemo.base.BaseDataBindActivity;
import vn.home.htm.tripdemo.constants.DValues;
import vn.home.htm.tripdemo.databinding.LayoutWeatherBinding;

/**
 * Created by HaiMinhTran on 3/18/2018.
 */

public class WeatherFragment extends BaseDataBindActivity<LayoutWeatherBinding, WeatherViewModel> {
    private WeatherViewModel mWeatherViewModel;
    private PageIndicatorView mPageIndicatorView;

    @Override
    protected int getLayoutId() {
        return R.layout.layout_weather;
    }

    @Override
    protected void initData() {
        mWeatherViewModel = new WeatherViewModel(this);
        setPageIndicator();
    }

    private void setPageIndicator() {
//        mPageIndicatorView = mBinding.pageIndicator;
//        mPageIndicatorView.setPageCount(DValues.page_count);
//        mPageIndicatorView.setCurrentPage(0, true);   // animated
    }
}
