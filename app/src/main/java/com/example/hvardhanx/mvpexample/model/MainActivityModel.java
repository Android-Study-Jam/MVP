package com.example.hvardhanx.mvpexample.model;

import com.example.hvardhanx.mvpexample.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData() {
        return "I'm your MVP";
    }
}