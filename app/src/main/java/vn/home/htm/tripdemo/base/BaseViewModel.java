package vn.home.htm.tripdemo.base;

import android.content.Context;
import android.databinding.BaseObservable;
import android.support.v7.app.AppCompatActivity;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


/**
 * Created by HaiMinhTran on 3/15/2018.
 */

public class BaseViewModel extends BaseObservable {
    protected Context mContext;
    protected BaseNavigator mNavigator;
    private CompositeDisposable mCompositeDisposable;

    public BaseViewModel(Context context) {
        this.mContext = ((AppCompatActivity) context).getBaseContext();
        this.mCompositeDisposable = new CompositeDisposable();
    }

    public void addSubscriptoin(Disposable disposable) {
        mCompositeDisposable.add(disposable);
    }

    public void onActivityDestroyed() {
        mNavigator = null;
        if (mCompositeDisposable != null) {
            this.mCompositeDisposable.clear();
            this.mCompositeDisposable = null;
        }
    }

    public void setmNavigator(BaseNavigator mNavigator) {
        this.mNavigator = mNavigator;
    }
}
