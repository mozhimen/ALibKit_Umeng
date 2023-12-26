package com.mozhimen.abilityk.umeng.statistics

import android.content.Context
import com.mozhimen.abilityk.umeng.statistics.cons.CManifest
import com.mozhimen.basick.lintk.optin.OptInApiInit_InApplication
import com.mozhimen.basick.manifestk.annors.AManifestKRequire
import com.umeng.analytics.MobclickAgent
import com.umeng.analytics.MobclickAgent.PageMode
import com.umeng.commonsdk.UMConfigure

/**
 * @ClassName UmengStatistics
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/12/26
 * @Version 1.0
 */
@OptInApiInit_InApplication
object UmengStatisticsMgr {
    /**
     * // SDK预初始化函数不会采集设备信息，也不会向友盟后台上报数据。
     * // preInit预初始化函数耗时极少，不会影响App首次冷启动用户体验
     * public static void preInit(Context context, String appkey, String channel)
     */
    @JvmStatic
    @AManifestKRequire(CManifest.INTENT_FILTER_DATA_SCHEME_UMENG)
    fun preInit(context: Context, appKey: String, channel: String) {
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
    @AManifestKRequire(CManifest.INTENT_FILTER_DATA_SCHEME_UMENG)
    fun init(context: Context, appKey: String, channel: String) {
        UMConfigure.setLogEnabled(true/*BuildConfig.UMLogEnabled*/)
        UMConfigure.init(context, appKey, channel, UMConfigure.DEVICE_TYPE_PHONE, "")
    }

    fun setPageCollectionModeManual(): UmengStatisticsMgr {
        setPageCollectionMode(PageMode.MANUAL)
        return this
    }

    fun setPageCollectionMode(pageMode: PageMode) {
        MobclickAgent.setPageCollectionMode(pageMode)
    }

    /**
     * 如果您调用kill或者exit之类的方法杀死进程，或者双击back键会杀死进程，请务必在此之前调用onKillProcess方法，用来保存统计数据。
     * public static void onKillProcess(Context context);
     */

    fun onKillProcess(context: Context) {
        MobclickAgent.onKillProcess(context)
    }
}