package com.phuocdai.helloword;

import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void setupView() {
        super.setupView();
        setContentView(R.layout.activity_main);
        Toast.makeText(mContext, "hello", Toast.LENGTH_LONG).show();
    }
}
