package de.hans.pan.simpleqr;

import android.os.Bundle;

import de.hans.pan.panutils.PanAppActivityBase;

public class ScannerActivity extends PanAppActivityBase {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
    }
}
