package vn.home.htm.tripdemo.screen.login;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.home.htm.tripdemo.R;
import vn.home.htm.tripdemo.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity  {

    private ActivityLoginBinding activityLoginBinding;
    private LoginViewModel loginViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginViewModel = new LoginViewModel(this);
        activityLoginBinding.setViewModel(loginViewModel);
    }

}
