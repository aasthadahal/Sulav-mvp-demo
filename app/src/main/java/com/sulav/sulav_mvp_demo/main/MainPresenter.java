package com.sulav.sulav_mvp_demo.main;

/*
* Handles actions from the View and updates the UI as needed.
* */
public class MainPresenter implements MainContract.MvpPresenter {

    private MainContract.MvpView mvpView;

    MainPresenter(MainContract.MvpView view){
        mvpView = view;
    }

    @Override
    public void handleSignInButtonClick() {

    }

    @Override
    public void handleSignUpButtonClick() {

    }
}
