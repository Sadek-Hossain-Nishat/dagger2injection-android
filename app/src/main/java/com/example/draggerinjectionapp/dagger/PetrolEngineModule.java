package com.example.draggerinjectionapp.dagger;


import com.example.draggerinjectionapp.car.Engine;
import com.example.draggerinjectionapp.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

  /***
    @Provides
    Engine provideEngine(PetrolEngine engine){
        return engine;
    }

   ***/


    //to make the code more concise
    @Binds
    abstract Engine provideEngine(PetrolEngine engine);









}
