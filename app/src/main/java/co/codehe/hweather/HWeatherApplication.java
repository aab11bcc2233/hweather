package co.codehe.hweather;

import android.app.Application;

import org.litepal.LitePalApplication;

/**
 * Created by codehe on 16-12-15.
 */

public class HWeatherApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePalApplication.initialize(this);
    }
}
