package ljy.com.example.flutterutilcodeplugin;

import android.content.Context;
import android.os.Build;
import android.util.Log;


import androidx.annotation.NonNull;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import ljy.com.example.flutterutilcodeplugin.util.AppUtils;
import ljy.com.example.flutterutilcodeplugin.util.DeviceUtils;
import ljy.com.example.flutterutilcodeplugin.util.EncryptUtils;

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
                    String value = (String) call.arguments;
                    result.success(DeviceUtils.isSameDevice(mContext,value));
                    break;

                //AppUtils app相关包名 应用名等
                case "getAppPackageName":
                    result.success(AppUtils.getAppPackageName(mContext));
                    break;
                case "getAppName":
                    result.success(AppUtils.getAppName(mContext));
                    break;
                case "getAppNames":
                    String packageName = (String) call.arguments;
                    result.success(AppUtils.getAppName(mContext,packageName));
                    break;
                case "getAppVersionName":
                    result.success(AppUtils.getAppVersionName(mContext));
                    break;
                case "getAppVersionCode":
                    result.success(AppUtils.getAppVersionCode(mContext));
                    break;

                //EncryptUtils
                case "encryptMD5ToString":
                    String md5Data = (String) call.arguments;
                    result.success(EncryptUtils.encryptMD5ToString(md5Data));
                    break;
                case "encryptSHA1ToString":
                    String sHA1Data = (String) call.arguments;
                    result.success(EncryptUtils.encryptSHA1ToString(sHA1Data));
                    break;
                case "encryptSHA224ToString":
                    String SHA224Data = (String) call.arguments;
                    result.success(EncryptUtils.encryptSHA224ToString(SHA224Data));
                    break;
                case "encryptSHA256ToString":
                    String SHA256Data = (String) call.arguments;
                    result.success(EncryptUtils.encryptSHA256ToString(SHA256Data));
                    break;
                case "encryptSHA384ToString":
                    String SHA384Data = (String) call.arguments;
                    result.success(EncryptUtils.encryptSHA384ToString(SHA384Data));
                    break;
                case "encryptSHA512ToString":
                    String SHA512Data = (String) call.arguments;
                    result.success(EncryptUtils.encryptSHA512ToString(SHA512Data));
                    break;
                case "encryptHmacMD5ToString":
                    String HmacMD5Data = (String) call.argument("encryptHmacMD5");
                    String HmacMD5Key = (String) call.argument("encryptHmacKey");
                    result.success(EncryptUtils.encryptHmacMD5ToString(HmacMD5Data,HmacMD5Key));
                    break;
                case "encryptHmacSHA1ToString":
                    String HmacSHA1Data = (String) call.argument("encryptHmacSHA1");
                    String HmacSHA1Key = (String) call.argument("encryptHmacKey");
                    result.success(EncryptUtils.encryptHmacSHA1ToString(HmacSHA1Data,HmacSHA1Key));
                    break;
                case "encryptHmacSHA224ToString":
                    //值有点不对~~~
                    String HmacSHA224Data = (String) call.argument("encryptHmacSHA224");
                    String HmacSHA224Key = (String) call.argument("encryptHmacKey");
                    result.success(EncryptUtils.encryptHmacSHA224ToString(HmacSHA224Data,HmacSHA224Key));
                    break;
                case "encryptHmacSHA256ToString":
                    String HmacSHA256Data = (String) call.argument("encryptHmacSHA256");
                    String HmacSHA256Key = (String) call.argument("encryptHmacKey");
                    result.success(EncryptUtils.encryptHmacSHA256ToString(HmacSHA256Data,HmacSHA256Key));
                    break;
                case "encryptHmacSHA384ToString":
                    //值有点不对~~~
                    String HmacSHA384Data = (String) call.argument("encryptHmacSHA384");
                    String HmacSHA384Key = (String) call.argument("encryptHmacKey");
                    result.success(EncryptUtils.encryptHmacSHA384ToString(HmacSHA384Data,HmacSHA384Key));
                    break;
                case "encryptHmacSHA512ToString":
                    String HmacSHA512Data = (String) call.argument("encryptHmacSHA512");
                    String HmacSHA512Key = (String) call.argument("encryptHmacKey");
                    result.success(EncryptUtils.encryptHmacSHA512ToString(HmacSHA512Data,HmacSHA512Key));
                    break;


                default:
                    break;
            }
        }catch (Exception e){
            result.error("Exception encountered",call.method,e);
        }
    }
}
