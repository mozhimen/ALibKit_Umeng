package com.mozhimen.abilityk.umeng.basic.optins

import com.mozhimen.abilityk.umeng.basic.cons.CManifest
import com.mozhimen.basick.lintk.annors.ADescription

/**
 * @ClassName OIntentFilter_DATA_SCHEME_UMENG
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/2/20
 * @Version 1.0
 */
@ADescription(CManifest.INTENT_FILTER_DATA_SCHEME_UMENG)
@RequiresOptIn("The api is must add this IntentFilte to your AndroidManifest.xml. 需要声明此IntentFilter到你的AndroidManifest.xml application下", RequiresOptIn.Level.WARNING)
annotation class OIntentFilter_DATA_SCHEME_UMENG