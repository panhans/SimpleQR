package de.hans.pan.simpleqr;

import android.content.Context;

import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

/**
 * Created by panhans on 26.08.2017.
 */

public class PanBarcodeDetector {

    private BarcodeDetector barcodeDetector;
    private CameraSource cameraSource;

    public PanBarcodeDetector(Context context) {

        this.barcodeDetector = new BarcodeDetector.Builder(context)
                .setBarcodeFormats(Barcode.ALL_FORMATS)
                .build();

        this.cameraSource = new CameraSource.Builder(context,barcodeDetector)
                .setAutoFocusEnabled(true)
                .build();
    }
}
