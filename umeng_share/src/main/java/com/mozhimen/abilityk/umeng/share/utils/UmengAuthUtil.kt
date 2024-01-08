package com.mozhimen.abilityk.umeng.share.utils

import android.app.Activity
import androidx.core.app.ActivityCompat
import com.mozhimen.abilityk.umeng.share.cons.CUmengAuth
import com.mozhimen.basick.manifestk.cons.CPermission
import com.mozhimen.basick.utilk.android.os.UtilKBuildVersion

/**
 * @ClassName UmengAuthUtil
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/1/8
 * @Version 1.0
 */
object UmengAuthUtil {
    @JvmStatic
    fun requestPermission(activity: Activity) {
        if (UtilKBuildVersion.isAfterV_23_6_M()) {
            val permissions = kotlin.arrayOf(
                CPermission.WRITE_EXTERNAL_STORAGE,
                CPermission.READ_EXTERNAL_STORAGE
            )
            ActivityCompat.requestPermissions(activity, permissions, CUmengAuth.REQUEST_CODE_PERMISSION)
        }
    }
}