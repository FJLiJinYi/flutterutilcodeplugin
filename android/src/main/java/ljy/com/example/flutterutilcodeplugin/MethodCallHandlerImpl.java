package ljy.com.example.flutterutilcodeplugin;

import android.content.Context;
import android.os.Build;
import android.util.Log;


import androidx.annotation.NonNull;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import ljy.com.example.flutterutilcodeplugin.util.DeviceUtils;

import static android.Manifest.permission.ACCESS_WIFI_STATE;
import static android.Manifest.permission.CHANGE_WIFI_STATE;
import static android.Manifest.permission.INTERNET;

/**
 * author : lijinyi
 * e-mail : fflijinyi@foxmail.com
 * date   : 2020/6/2410:29
 * desc   :
 * version: 1.0
 */
@SuppressWarnings("unchecked")
class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {

    private Context mContext;

    MethodCallHandlerImpl(Context context){
        this.mContext = context;
    }


    @Override
    public void onMethodCall(@NonNull MethodCall call, @NonNull MethodChannel.Result result) {

        try {
            switch (call.method){
                //about Device
                case "isDeviceRooted":
                    result.success(DeviceUtils.isDeviceRooted());
                    break;
                case "isAdbEnabled":
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                        result.success(DeviceUtils.isAdbEnabled(mContext));
                    }else{
                        result.error("The version is too low",call.method,false);
                    }
                    break;
                case "getPlatformVersion":
                    result.success(DeviceUtils.getSDKVersionName());
                    break;
                case "getSDKVersionCode":
                    result.success(DeviceUtils.getSDKVersionCode());
                    break;
                case "getAndroidID":
                    result.success(DeviceUtils.getAndroidID(mContext));
                    break;
                case "getMacAddress":
                    result.success(DeviceUtils.getMacAddress(mContext));
                    break;
                case "getManufacturer":
                    result.success(DeviceUtils.getManufacturer());
                    break;
                case "getModel":
                    result.success(DeviceUtils.getModel());
                    break;
                case "getABIs":
                    result.success(DeviceUtils.getABIs());
                    break;
                case "isTablet":
                    result.success(DeviceUtils.isTablet());
                    break;
                case "isEmulator":
                    result.success(DeviceUtils.isEmulator(mContext));
                    break;
                case "getUniqueDeviceId":
                    result.success(DeviceUtils.getUniqueDeviceId(mContext));
                    break;
                case "isSameDevice":
                    String value = (String) call.argument("value");
                    result.success(DeviceUtils.isSameDevice(mContext,value));
                    break;

                default:
                    break;
            }
        }catch (Exception e){
            result.error("Exception encountered",call.method,e);
        }
    }
}
