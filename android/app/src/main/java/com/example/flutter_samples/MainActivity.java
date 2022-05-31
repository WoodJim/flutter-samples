package com.example.flutter_samples;

import android.os.Bundle;
//import io.flutter.app.FlutterActivity;
//import io.flutter.plugins.GeneratedPluginRegistrant;

import android.view.ViewTreeObserver;
import android.view.WindowManager;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;

public class MainActivity extends FlutterActivity {
    private static final String CHANNEl = "example.flutter_samples";
//  @Override
//  protected void onCreate(Bundle savedInstanceState) {
//    super.onCreate(savedInstanceState);
//    //make transparent status bar
//    getWindow().setStatusBarColor(0x00000000);
//    GeneratedPluginRegistrant.registerWith(this);
//    //Remove full screen flag after load
//    ViewTreeObserver vto = getFlutterView().getViewTreeObserver();
//    vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
//      @Override
//      public void onGlobalLayout() {
//        getFlutterView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
//        getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
//      }
//    });
//  }


    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        GeneratedPluginRegister.registerGeneratedPlugins(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), CHANNEl)
                .setMethodCallHandler(
                        (call, result) -> {
                            //Extra
                    getWindow().setStatusBarColor(0x00000000);
                        });
    }
}
