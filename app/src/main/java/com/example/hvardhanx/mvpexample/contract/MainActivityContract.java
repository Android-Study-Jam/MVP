package com.example.hvardhanx.mvpexample.contract;

public interface MainActivityContract {
    interface Model {
        String getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }

    interface View {
        void initView();
        void setViewData(String data);
    }
}
