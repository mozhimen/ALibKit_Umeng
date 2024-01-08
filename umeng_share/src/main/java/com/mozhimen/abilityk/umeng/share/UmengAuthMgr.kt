package com.mozhimen.abilityk.umeng.share

import android.content.Context
import com.mozhimen.basick.lintk.optin.OptInApiInit_InApplication
import com.mozhimen.basick.manifestk.annors.AManifestKRequire
import com.mozhimen.basick.manifestk.cons.CManifest
import com.umeng.commonsdk.UMConfigure
import com.umeng.socialize.PlatformConfig

/**
 * @ClassName UmengAuthMgr
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/1/8
 * @Version 1.0
 */
@OptInApiInit_InApplication
object UmengAuthMgr {
    @JvmStatic
    fun init() {
        PlatformConfig.setVKontakte()
    }
}