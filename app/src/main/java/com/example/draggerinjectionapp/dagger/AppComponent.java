package com.example.draggerinjectionapp.dagger;


import com.example.draggerinjectionapp.car.Driver;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = DriverModule.class)
public  interface AppComponent {

//   Driver getDriver();

   ActivityComponent.Factory getActivityComponentFactory();

   @Component.Factory
   interface  Factory{
      AppComponent create(DriverModule driverModule);
   }


}
