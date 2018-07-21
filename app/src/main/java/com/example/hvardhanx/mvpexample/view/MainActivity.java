package com.example.hvardhanx.mvpexample.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.hvardhanx.mvpexample.R;
import com.example.hvardhanx.mvpexample.contract.MainActivityContract;
import com.example.hvardhanx.mvpexample.presenter.MainActivityPresenter;

public class MainActivity extends Activity implements MainActivityContract.View {

    private TextView mTextView;
    private Button mButton;
    private MainActivityContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                mPresenter.onClick(view);
            }
        });
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}