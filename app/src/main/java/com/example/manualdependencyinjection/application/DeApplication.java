package com.example.manualdependencyinjection.application;

import android.app.Application;

import com.example.manualdependencyinjection.AppContainer;

public class DeApplication extends Application {
    public AppContainer appContainer = new AppContainer();

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
