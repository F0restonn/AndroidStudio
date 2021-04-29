package com.example.myapplication.ui.home;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private LinearLayout b_1;
    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();


    }

    public LiveData<String> getText() {
        return mText;
    }


}