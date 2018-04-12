package com.example.wanghongjun.android_ndk_demo.Demo;

/**
 * Created by wanghongjun on 2018/4/11.
 */

public class DemoHelper {

    public static void loadLib(){
        System.loadLibrary("demo");
    }

    public static native String test();
}
