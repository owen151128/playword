package kr.owens.playword.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kr.owens.playword.R;

/**
 * MainActivity
 * This Activity is not Launch activity
 * Main Display Activity
 *
 * @author owen151128
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
