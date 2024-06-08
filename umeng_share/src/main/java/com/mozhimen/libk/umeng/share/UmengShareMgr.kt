package com.mozhimen.libk.umeng.share

import com.mozhimen.basick.lintk.optins.OApiInit_InApplication

/**
 * @ClassName UmengAuthMgr
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2024/1/8
 * @Version 1.0
 */
@Deprecated("体验感很差")
@OApiInit_InApplication
object UmengShareMgr {
//    @ADescription(
//        """
//        <!-- vk -->
//        <activity
//            android:name="com.vk.sdk.VKServiceActivity"
//            android:label="ServiceActivity"
//            android:theme="@style/VK.Transparent" />
//    """
//    )
//    @JvmStatic
//    fun initVKontakte(a: String, b: String): UmengShareMgr {
//        PlatformConfig.setVKontakte(a, b)
//        return this
//    }
//
//    @ADescription(
//        """
//        <!-- dp -->
//        <activity
//            android:name="com.dropbox.client2.android.AuthActivity"
//            android:configChanges="orientation|keyboard"
//            android:exported="true"
//            android:launchMode="singleTask">
//            <intent-filter>
//                <!-- Change this to be db- followed by your app key -->
//                <data android:scheme="db-oz8v5apet3arcdy" />
//                <action android:name="android.intent.action.VIEW" />
//
//                <category android:name="android.intent.category.BROWSABLE" />
//                <category android:name="android.intent.category.DEFAULT" />
//            </intent-filter>
//        </activity>
//
//        - 解决
//        java.lang.ClassNotFoundException: Didn't find class "org.apache.http.client.methods.HttpGet" on path: DexPathList[[dex file "/data/data/com.ty.lelejoy/code_cache/.overlay/base.apk/classes14.dex", dex file "/data/data/com.ty.lelejoy/code_cache/.overlay/base.apk/classes9.dex", zip file "/data/app/~~pk_gOk3oABTHA4bFZG7Bcg==/com.ty.lelejoy-1BuFTKwwtC_0vltBibKitw==/base.apk"],nativeLibraryDirectories=[/data/app/~~pk_gOk3oABTHA4bFZG7Bcg==/com.ty.lelejoy-1BuFTKwwtC_0vltBibKitw==/lib/arm64, /data/app/~~pk_gOk3oABTHA4bFZG7Bcg==/com.ty.lelejoy-1BuFTKwwtC_0vltBibKitw==/base.apk!/lib/arm64-v8a, /system/lib64, /system_ext/lib64]]
//	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:259)
//	at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
//	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
//	at com.dropbox.client2.RESTUtility.streamRequest(RESTUtility.java:166)
//	at com.dropbox.client2.RESTUtility.request(RESTUtility.java:124)
//	at com.dropbox.client2.DropboxAPI.accountInfo(DropboxAPI.java:1437)
//	at com.umeng.socialize.handler.UMDropBoxHandler.fetchUserInfo(UMDropBoxHandler.java:294)
//	at com.umeng.socialize.handler.UMDropBoxHandler.access${'$'}000(UMDropBoxHandler.java:38)
//	at com.umeng.socialize.handler.UMDropBoxHandler${'$'}5${'$'}1.run(UMDropBoxHandler.java:269)
//	at java.lang.Thread.run(Thread.java:1012)
//
//    1.app/build.gradle
//    android {
//        useLibrary 'org.apache.http.legacy'
//        ...
//    }
//
//    2.app/AndroidManifest.xml
//    <application
//        ...>
//        <uses-library
//            android:name="org.apache.http.legacy"
//            android:required="false" />
//        """
//
//
//    )
//    @JvmStatic
//    fun initDropbox(a: String, b: String): UmengShareMgr {
//        PlatformConfig.setDropbox(a, b)
//        return this
//    }
}