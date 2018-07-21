package com.example.hvardhanx.mvpexample.presenter;


import com.example.hvardhanx.mvpexample.contract.MainActivityContract;
import com.example.hvardhanx.mvpexample.contract.MainActivityContract.Model;
import com.example.hvardhanx.mvpexample.contract.MainActivityContract.View;
import com.example.hvardhanx.mvpexample.model.MainActivityModel;

;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private View mView;
    private Model mModel;

    public MainActivityPresenter(View view) {
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }
}