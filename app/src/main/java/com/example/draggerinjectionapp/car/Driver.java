package com.example.draggerinjectionapp.car;

import javax.inject.Inject;
import javax.inject.Singleton;




public class Driver {

    // we don't own this class so we can't annotate it with @inject

    String name;
//
    public Driver(String name) {
        this.name = name;
    }



}
