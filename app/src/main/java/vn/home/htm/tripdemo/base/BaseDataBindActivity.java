package vn.home.htm.tripdemo.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

/**
 * Created by HaiMinhTran on 3/15/2018.
 */

public abstract class BaseDataBindActivity<T extends ViewDataBinding, K extends BaseViewModel> extends BaseActivity {
    protected T mBinding;
    protected K mViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, getLayoutId());
        initData();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mViewModel != null) {
            mViewModel.onActivityDestroyed();
        }
    }

    protected abstract int getLayoutId();

    protected abstract void initData();
}
