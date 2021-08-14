package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("7UYklAriGAypBJoYJdwCaVTy20akt5txCKeLdIvN")
                .clientKey("CFJyWNW4Ojg2bGVEopuL95hH1trs6OOHdLqVbxg1")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
