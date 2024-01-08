package com.mozhimen.abilityk.umeng.statistics

import android.content.Context
import com.mozhimen.abilityk.umeng.basic.cons.CManifest
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

    fun setPageCollectionModeManual() {
        setPageCollectionMode(PageMode.MANUAL)
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