package com.mozhimen.abilityk.umeng.share.commons

import com.umeng.socialize.UMAuthListener
import com.umeng.socialize.bean.SHARE_MEDIA

/**
 * @ClassName UMAuthCallback
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/1/9
 * @Version 1.0
 */
open class UMAuthCallback : UMAuthListener {
    override fun onStart(p0: SHARE_MEDIA) {
    }

    override fun onComplete(p0: SHARE_MEDIA, p1: Int, p2: MutableMap<String, String>?) {
    }

    override fun onError(p0: SHARE_MEDIA, p1: Int, p2: Throwable?) {
    }

    override fun onCancel(p0: SHARE_MEDIA, p1: Int) {
    }
}