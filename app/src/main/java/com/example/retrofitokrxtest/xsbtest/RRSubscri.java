package com.example.retrofitokrxtest.xsbtest;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;

import com.tpnet.remote.RSubscriber;

/**
 * Created by tp on 2016/12/22.
 */

public abstract class RRSubscri<T> extends RSubscriber<T> {

    Context context;
    public RRSubscri(Context context){
        this.context = context;
    }


    Dialog mDialog ;

    @Override
    public void showDialog() {
        super.showDialog();
        if (mDialog ==null){
            mDialog = new ProgressDialog(context);
        }
        mDialog.show();
    }

    @Override
    public void closeDialog() {
        super.closeDialog();

        if (mDialog!=null && mDialog.isShowing()){
            mDialog.dismiss();
        }
    }
}
