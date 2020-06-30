package ljy.com.example.flutterutilcodeplugin.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * author : lijinyi
 * e-mail : fflijinyi@foxmail.com
 * date   : 2020/6/3018:35
 * desc   :
 * version: 1.0
 */
public final class AppUtils {
    private AppUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * Return the application's package name.
     *
     * @return the application's package name
     */
    public static String getAppPackageName(Context mContext) {
        return mContext.getPackageName();
    }

    /**
     * Return the application's name.
     *
     * @return the application's name
     */
    public static String getAppName(Context mContext) {
        return getAppName(mContext,mContext.getPackageName());
    }
    /**
     * Return the application's name.
     *
     * @param packageName The name of the package.
     * @return the application's name
     */
    public static String getAppName(final Context mContext,final String packageName) {
        if (UtilsBridge.isSpace(packageName)) {
            return "";
        }
        try {
            PackageManager pm = mContext.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(packageName, 0);
            return pi == null ? null : pi.applicationInfo.loadLabel(pm).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Return the application's version name.
     *
     * @return the application's version name
     */
    public static String getAppVersionName(final Context mContext) {
        return getAppVersionName(mContext,mContext.getPackageName());
    }

    /**
     * Return the application's version name.
     *
     * @param packageName The name of the package.
     * @return the application's version name
     */
    public static String getAppVersionName(final Context mContext,final String packageName) {
        if (UtilsBridge.isSpace(packageName)) {
            return "";
        }
        try {
            PackageManager pm = mContext.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(packageName, 0);
            return pi == null ? null : pi.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Return the application's version code.
     *
     * @return the application's version code
     */
    public static int getAppVersionCode(final Context mContext) {
        return getAppVersionCode(mContext,mContext.getPackageName());
    }

    /**
     * Return the application's version code.
     *
     * @param packageName The name of the package.
     * @return the application's version code
     */
    public static int getAppVersionCode(final Context mContext,final String packageName) {
        if (UtilsBridge.isSpace(packageName)) {
            return -1;
        }
        try {
            PackageManager pm = mContext.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(packageName, 0);
            return pi == null ? -1 : pi.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
