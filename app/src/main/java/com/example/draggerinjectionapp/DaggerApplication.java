package com.example.draggerinjectionapp;

import android.app.Application;


import com.example.draggerinjectionapp.dagger.AppComponent;
import com.example.draggerinjectionapp.dagger.DaggerAppComponent;
import com.example.draggerinjectionapp.dagger.DriverModule;


public class DaggerApplication extends Application {
    private AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.factory().create(new DriverModule("Sadek"));



    }

    public AppComponent getAppComponent() {
        return component;
    }
}
