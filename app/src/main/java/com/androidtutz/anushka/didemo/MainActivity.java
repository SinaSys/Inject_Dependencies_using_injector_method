package com.androidtutz.anushka.didemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    SmartPhone smartPhone;

/*
    @Inject
    Battery battery;

    @Inject
    SIMCard simCard;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        //smartPhone = smartPhoneComponent.getSmartPhone();
        smartPhoneComponent.inject(this);

        smartPhone.makeACall();

    }
}
