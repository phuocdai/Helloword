package com.phuocdai.helloword;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class BaseActivity extends Activity {
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupView();
    }

    /**
     * setup view
     */
    public void setupView() {
        Toast.makeText(mContext, "hello", Toast.LENGTH_LONG).show();
    }
}
