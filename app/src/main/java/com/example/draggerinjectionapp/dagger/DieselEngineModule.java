package com.example.draggerinjectionapp.dagger;


import com.example.draggerinjectionapp.car.DieselEngine;
import com.example.draggerinjectionapp.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public  class DieselEngineModule {

    private int horsePower;


    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }


    @Provides
    int provideHorsePower(){
        return horsePower;
    }



    //to make the code more concise
    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }









}
