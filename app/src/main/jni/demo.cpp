//
// Created by wanghongjun on 2018/4/11.
//
//-------------------【头文件、命名空间部分】---------------------
//      描述：包含程序所依赖的头文件和命名空间
//-------------------------------------------------------------
#include <jni.h>
#include <stdio.h>


extern "C"{

JNIEXPORT jstring JNICALL Java_com_example_wanghongjun_android_1ndk_1demo_Demo_DemoHelper_test
        (JNIEnv  *env, jclass obj){
    jstring result=env->NewStringUTF("TestDemo");
    return result;
}


}



