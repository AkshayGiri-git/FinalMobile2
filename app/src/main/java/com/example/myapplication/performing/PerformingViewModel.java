package com.example.myapplication.performing;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PerformingViewModel extends ViewModel {
    private MutableLiveData<Boolean> fabClicked = new MutableLiveData<>();
    public LiveData<Boolean> getFabClicked() {
        return fabClicked;
    }

    public void onFabClicked() {
        // Handle FAB click logic in the ViewModel
        // You can perform any additional logic here

        // For example, update LiveData to notify observers
        fabClicked.setValue(true);
        System.out.println("hello");
    }
}