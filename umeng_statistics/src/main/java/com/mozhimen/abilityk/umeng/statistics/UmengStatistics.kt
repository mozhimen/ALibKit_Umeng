package com.mozhimen.abilityk.umeng.statistics

import android.content.Context
import com.mozhimen.basick.utilk.android.util.UtilKLog
import com.mozhimen.basick.utilk.bases.IUtilK
import com.umeng.analytics.MobclickAgent
import com.umeng.commonsdk.UMConfigure

/**
 * @ClassName UmengStatistics
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/12/26
 * @Version 1.0
 */
object UmengStatistics : IUtilK {
    @JvmStatic
    fun getTestDeviceInfo(context: Context): Array<String>? {
        return UMConfigure.getTestDeviceInfo(context)
    }

    ////////////////////////////////////////////////////////////////////

    /**
     * 页面开始统计
     */
    @JvmStatic
    fun onPageStart(pageName: String) {
        MobclickAgent.onPageStart(pageName)
    }

    @JvmStatic
    fun onResume(context: Context) {
        MobclickAgent.onResume(context)
    }

    @JvmStatic
    fun onPause(context: Context) {
        MobclickAgent.onPause(context)
    }

    /**
     * 页面结束统计
     */
    @JvmStatic
    fun onPageEnd(pageName: String) {
        MobclickAgent.onPageEnd(pageName)
    }

    @JvmStatic
    fun onEventObject(context: Context, eventId: String, map: Map<String, Any>) {
        MobclickAgent.onEventObject(context, eventId, map)
    }

    @JvmStatic
    fun onEventObject(context: Context, eventId: String) {
        MobclickAgent.onEvent(context, eventId)
    }

    ////////////////////////////////////////////////////////////////////

    @JvmStatic
    fun printTestDeviceInfo(context: Context) {
        val getTestDeviceInfo: Array<String>? = getTestDeviceInfo(context)
        if (!getTestDeviceInfo.isNullOrEmpty()) {
            UtilKLog.it(TAG, "showTestDeviceInfo {\"device_id\":\"" + getTestDeviceInfo[0] + "\",\"mac\":\"" + getTestDeviceInfo[1] + "\"}")
        }
    }
}