package com.mozhimen.abilityk.umeng.statistics

import android.content.Context
import android.util.Log
import com.mozhimen.basick.utilk.android.util.UtilKLog
import com.mozhimen.basick.utilk.commons.IUtilK
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

    private var _lastPageName: String = ""

    /**
     * 页面开始统计
     */
    @JvmStatic
    fun onPageStartAuto(pageName: String) {
        if (_lastPageName.isNotEmpty())
            onPageEnd(_lastPageName)
        onPageStart(pageName)
        _lastPageName = pageName
    }

    @JvmStatic
    fun onPageStart(pageName: String) {
        Log.d(TAG, "onPageStart: pageName $pageName")
        MobclickAgent.onPageStart(pageName)
    }

    @JvmStatic
    fun onResume(context: Context, pageName: String) {
        Log.d(TAG, "onResume   : pageName $pageName")
        MobclickAgent.onResume(context)
    }

    @JvmStatic
    fun onPause(context: Context, pageName: String) {
        Log.d(TAG, "onPause    : pageName $pageName")
        MobclickAgent.onPause(context)
    }

    /**
     * 页面结束统计
     */
    @JvmStatic
    fun onPageEnd(pageName: String) {
        Log.d(TAG, "onPageEnd  : pageName $pageName")
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