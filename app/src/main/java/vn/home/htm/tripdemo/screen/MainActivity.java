package vn.home.htm.tripdemo.screen;

import android.os.Build;
import android.support.v7.app.AppCompatDelegate;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationAdapter;

import vn.home.htm.tripdemo.R;
import vn.home.htm.tripdemo.base.BaseDataBindActivity;
import vn.home.htm.tripdemo.databinding.ActivityMainBinding;

// this place contains Bottom navigation bar
public class MainActivity extends BaseDataBindActivity<ActivityMainBinding, MainViewModel> {

    private AHBottomNavigation mAhBottomNavigation;
    private AHBottomNavigationAdapter mAhBottomNavigationAdapter;


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        setAHBottomNavigation();
    }

    private void setAHBottomNavigation() {
        //https://github.com/aurelhubert/ahbottomnavigation
        // If you use drawable selector and target API < 21, don't forget to add this:
        // AppCompatDelegate.setCompatVectorFromResourcesEnabled(true); 
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        }
        mAhBottomNavigation = mBinding.bottomNavigation;
        mAhBottomNavigationAdapter = new AHBottomNavigationAdapter(this, R.menu.menu_bottom_navigation);
        mAhBottomNavigationAdapter.setupWithBottomNavigation(mAhBottomNavigation);
        mAhBottomNavigation.setTitleState(AHBottomNavigation.TitleState.ALWAYS_SHOW);
        mAhBottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                return onNavigationBotItemClick(position);
            }
        });
        //mAhBottomNavigation.setCurrentItem(0);
    }

    private void setBadge(int count) {

    }

    private boolean onNavigationBotItemClick(int position) {
        //mAhBottomNavigation.setCurrentItem(position);
        return true;
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

    public interface Tab_Position {
        int TAB_HOME = 0;
        int TAB_PLACE = 1;
        int TAB_NOTIFICATION = 2;
        int TAB_MYPAGE = 3;
    }
}
