package de.hans.pan.panutils;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by panhans on 26.08.2017.
 */

public class PanAppActivityBase extends AppCompatActivity {

    public void ShowNotification(String text, int duration){
        Toast.makeText(getApplicationContext(),text,duration).show();
    }

    public void ShowNotification(String text){
        this.ShowNotification(text,Toast.LENGTH_SHORT);
    }

}
