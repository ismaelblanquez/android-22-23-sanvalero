package com.example.mvp_netflix_01.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvp_netflix_01.R;

public class LoginActivity extends AppCompatActivity {
    private EditText edtUserLogin;
    private EditText edtPassword;
    private Button btnLogin;

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

    }
}
