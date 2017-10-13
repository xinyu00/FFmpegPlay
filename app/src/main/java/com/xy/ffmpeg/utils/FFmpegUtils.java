package com.xy.ffmpeg.utils;

/**
 * Created by chenxy on 2017/10/5.
 */

public class FFmpegUtils {
    static {
        System.loadLibrary("native-lib");
    }

    public static native int getImage(Object surface);
}
