package com.mozhimen.libk.umeng.common

import android.content.Context
import com.mozhimen.kotlin.lintk.optins.OApiInit_InApplication
import com.mozhimen.libk.umeng.common.optins.OIntentFilter_DATA_SCHEME_UMENG
import com.umeng.commonsdk.UMConfigure

/**
 * @ClassName UmengBasicMgr
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/1/8
 * @Version 1.0
 */
@OApiInit_InApplication
object UmengBasicMgr {
    /**
     * // SDK预初始化函数不会采集设备信息，也不会向友盟后台上报数据。
     * // preInit预初始化函数耗时极少，不会影响App首次冷启动用户体验
     * public static void preInit(Context context, String appkey, String channel)
     */
    @JvmStatic
    @OIntentFilter_DATA_SCHEME_UMENG
    fun preInit(context: Context, appKey: String, channel: String) {
        UMConfigure.setLogEnabled(true/*BuildConfig.UMLogEnabled*/)
        UMConfigure.preInit(context, appKey, channel)
    }

    /**
     * /**
     * * 注意: 即使您已经在AndroidManifest.xml中配置过appkey和channel值，也需要在App代码中调
     * * 用初始化接口（如需要使用AndroidManifest.xml中配置好的appkey和channel值，
     * * UMConfigure.init调用中appkey和channel参数请置为null）。
     * */
     * UMConfigure.init(Context context, String appkey, String channel, int deviceType, String pushSecret);
     */
    @JvmStatic
    @OIntentFilter_DATA_SCHEME_UMENG
    fun init(context: Context, appKey: String, channel: String) {
        UMConfigure.init(context, appKey, channel, UMConfigure.DEVICE_TYPE_PHONE, "")
    }
}