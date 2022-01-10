package com.tencent.matrix.trace.core;

import android.os.Trace;

import androidx.annotation.Keep;

/**
 * @author Bruce
 * @date 2022/1/8
 */
@Keep
public class TraceTag {
    public static void i(String methodName) {
        Trace.beginSection(methodName);
    }

    public static void o() {
        Trace.endSection();
    }
}
