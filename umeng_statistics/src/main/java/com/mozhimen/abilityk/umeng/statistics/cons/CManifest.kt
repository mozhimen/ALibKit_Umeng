package com.mozhimen.abilityk.umeng.statistics.cons

/**
 * @ClassName CManifest
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/12/26
 * @Version 1.0
 */
object CManifest {
    /**
     *埋点验证配置
     * 该功能仅9.4.0及以上版本的SDK支持详情可见：
     *
     * https://developer.umeng.com/docs/119267/detail/118639
     *
     * 新版集成测试需要在manifest.xml文件中配置，您需要在其中找到响应android.intent.action.MAIN的activity（也就是应用可以被外部唤起的第一个Activity），加上如下代码，让应用能被指定连接scheme唤起。
     *
     * //1.唤起码默认为“um.该app对应的appkey”，不可改变
     * //2.请使用单独intent-filter,和其他intent-filter并列，不要将上述代码填入其他intent-filter里；
     * //3.该功能仅9.4.0及以上版本的SDK支持
     *
     *
     * <activity
     *             android:name=".MainActivity"
     *             android:label="@string/app_name">
     *
     *             <intent-filter>
     *                 <action android:name="android.intent.action.VIEW" />
     *                 <category android:name="android.intent.category.DEFAULT" />
     *                 <category android:name="android.intent.category.BROWSABLE" />
     *                 <data android:scheme="um.该app对应的appkey" />
     *             </intent-filter>
     *         </activity>
     */
    const val INTENT_FILTER_DATA_SCHEME_UMENG = """
        <data android:scheme="um.该app对应的appkey" />
    """
}