package ua.ho.andro.mytags;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class BaseActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);}
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
