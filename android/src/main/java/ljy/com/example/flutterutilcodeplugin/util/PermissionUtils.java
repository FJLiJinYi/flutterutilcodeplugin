package ljy.com.example.flutterutilcodeplugin.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;

import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

/**
 * author : lijinyi
 * e-mail : fflijinyi@foxmail.com
 * date   : 2020/7/115:11
 * desc   :
 * version: 1.0
 */
public final class PermissionUtils {

    /**
     * Return whether <em>you</em> have been granted the permissions.
     *
     * @param permissions The permissions.
     * @return {@code true}: yes<br>{@code false}: no
     */
    public static boolean isGranted(final Context mContext,final String... permissions) {
        for (String permission : permissions) {
            if (!isGranted(mContext,permission)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isGranted(final Context mContext,final String permission) {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M
                || PackageManager.PERMISSION_GRANTED
                == ContextCompat.checkSelfPermission(mContext, permission);
    }

    /**
     * Return whether the app can draw on top of other apps.
     *
     * @return {@code true}: yes<br>{@code false}: no
     */
    @RequiresApi(api = Build.VERSION_CODES.M)
    public static boolean isGrantedDrawOverlays(final Context mContext) {
        return Settings.canDrawOverlays(mContext);
    }

}
