package ua.ho.andro.mytags;

import android.app.Application;
import android.content.Context;
import android.content.Intent;


public class App extends Application {

    public static App getApplication(Context context) {
        if (context instanceof App){
            return (App)context;
        }
        return (App)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        //startService(new Intent(getApplicationContext(), BluetoothLeService.class));
    }
}
