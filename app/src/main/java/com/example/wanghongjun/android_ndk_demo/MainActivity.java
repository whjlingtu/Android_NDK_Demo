package com.example.wanghongjun.android_ndk_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.wanghongjun.android_ndk_demo.Demo.DemoHelper;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method

        initView();


    }
    private void initView(){
        DemoHelper.loadLib();//加载生成的动态文件
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(""+ DemoHelper.test());
    }


}
