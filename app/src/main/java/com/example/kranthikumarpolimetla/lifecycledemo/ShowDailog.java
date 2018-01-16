package com.example.kranthikumarpolimetla.lifecycledemo;

import android.app.AlertDialog;
import android.view.View;

/**
 * Created by kranthikumarpolimetla on 7/16/17.
 */

@FunctionalInterface
 interface ShowDailog {

     void showDialog(AlertDialog.Builder builder);
}
