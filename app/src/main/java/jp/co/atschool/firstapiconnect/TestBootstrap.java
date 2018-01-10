package jp.co.atschool.firstapiconnect;

import android.app.Application;

import com.beardedhen.androidbootstrap.TypefaceProvider;

/**
 * Created by nttr on 2017/12/22.
 */

public class TestBootstrap extends Application{
    @Override public void onCreate() {
        super.onCreate();
        TypefaceProvider.registerDefaultIconSets();
    }
}
