package com.example.mvp_netflix_01.presenter;

import com.example.mvp_netflix_01.contract.LoginContract;
import com.example.mvp_netflix_01.model.pojo.User;
import com.example.mvp_netflix_01.model.pojo.Film;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.Model.OnLoginUserListener {
    @Override
    public void login(User user) {

    }

    @Override
    public void lstFilms(Film film) {

    }
    //public void lstFilms(){}
}
