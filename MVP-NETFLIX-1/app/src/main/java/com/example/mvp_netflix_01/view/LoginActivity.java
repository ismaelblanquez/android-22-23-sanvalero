package com.example.mvp_netflix_01.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp_netflix_01.R;
import com.example.mvp_netflix_01.contract.LoginContract;
import com.example.mvp_netflix_01.model.pojo.User;
import com.example.mvp_netflix_01.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {
    private EditText edtUserLogin;
    private EditText edtPassword;
    private Button btnLogin;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponents();
        initPresenter();
    }
    private void initComponents(){
        edtUserLogin = findViewById(R.id.edtUserLogin);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.button);
    }
    private void initPresenter(){
        loginPresenter = new LoginPresenter();
        loginPresenter.lstFilms(null);
    }

    @Override
    public void successLogin(User user, String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void failureLogin(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }
}
