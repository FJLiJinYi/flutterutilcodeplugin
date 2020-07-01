import 'dart:async';

import 'package:flutter/services.dart';

class Flutterutilcodeplugin {
  static const MethodChannel _channel =
      const MethodChannel('plugins.flutter.io/flutterutilcodeplugin');

  //about device
  static Future<String> getPlatformVersion() async {
    return await _channel.invokeMethod('getPlatformVersion');
  }

  static Future<String> getMacAddress() async {
    return await _channel.invokeMethod('getMacAddress');
  }

  static Future<bool> isDeviceRooted() async {
    return await _channel.invokeMethod('isDeviceRooted');
  }

  static Future<bool> isAdbEnabled() async {
    return await _channel.invokeMethod('isAdbEnabled');
  }

  static Future<int> getSDKVersionCode() async {
    return await _channel.invokeMethod('getSDKVersionCode');
  }

  static Future<String> getAndroidID() async {
    return await _channel.invokeMethod('getAndroidID');
  }

  static Future<String> getManufacturer() async {
    return await _channel.invokeMethod('getManufacturer');
  }

  static Future<String> getModel() async {
    return await _channel.invokeMethod('getModel');
  }

  static Future<Object> getABIs() async {
    return await _channel.invokeMethod('getModel');
  }

  static Future<bool> isTablet() async {
    return await _channel.invokeMethod('isTablet');
  }

  static Future<bool> isEmulator() async {
    return await _channel.invokeMethod('isEmulator');
  }

  static Future<String> getUniqueDeviceId() async {
    return await _channel.invokeMethod('getUniqueDeviceId');
  }

  static Future<bool> isSameDevice(String uniqueDeviceId) async {
    return await _channel.invokeMethod('isSameDevice',uniqueDeviceId);
  }

  //////////////APP 相关、、、、、、、、、////////////////
  static Future<String> getAppPackageName() async {
    return await _channel.invokeMethod('getAppPackageName');
  }

  static Future<String> getAppName() async {
    return await _channel.invokeMethod('getAppName');
  }

  static Future<String> getAppNames(String packageName) async {
    return await _channel.invokeMethod('getAppNames',packageName);
  }

  static Future<String> getAppVersionName() async {
    return await _channel.invokeMethod('getAppVersionName');
  }

  static Future<int> getAppVersionCode() async {
    return await _channel.invokeMethod('getAppVersionCode');
  }

  //encrypt 加密解密
  static Future<String> encryptMD5ToString(String encryptMD5) async {
    return await _channel.invokeMethod('encryptMD5ToString',encryptMD5);
  }

  static Future<String> encryptSHA1ToString(String encryptSHA1) async {
    return await _channel.invokeMethod('encryptSHA1ToString',encryptSHA1);
  }

  static Future<String> encryptSHA224ToString(String encryptSHA224) async {
    return await _channel.invokeMethod('encryptSHA224ToString',encryptSHA224);
  }

  static Future<String> encryptSHA256ToString(String encryptSHA256) async {
    return await _channel.invokeMethod('encryptSHA256ToString',encryptSHA256);
  }

  static Future<String> encryptSHA384ToString(String encryptSHA384) async {
    return await _channel.invokeMethod('encryptSHA384ToString',encryptSHA384);
  }

  static Future<String> encryptSHA512ToString(String encryptSHA512) async {
    return await _channel.invokeMethod('encryptSHA512ToString',encryptSHA512);
  }

  static Future<String> encryptHmacMD5ToString(String encryptHmacMD5,String encryptHmacKey) async {
    return await _channel.invokeMethod('encryptHmacMD5ToString',<String,dynamic>{'encryptHmacMD5':encryptHmacMD5,'encryptHmacKey':encryptHmacKey});
  }

  static Future<String> encryptHmacSHA1ToString(String encryptHmacSHA1,String encryptHmacKey) async {
    return await _channel.invokeMethod('encryptHmacSHA1ToString',<String,dynamic>{'encryptHmacSHA1':encryptHmacSHA1,'encryptHmacKey':encryptHmacKey});
  }

  static Future<String> encryptHmacSHA224ToString(String encryptHmacSHA224,String encryptHmacKey) async {
    return await _channel.invokeMethod('encryptHmacSHA224ToString',<String,dynamic>{'encryptHmacSHA224':encryptHmacSHA224,'encryptHmacKey':encryptHmacKey});
  }

  static Future<String> encryptHmacSHA256ToString(String encryptHmacSHA256,String encryptHmacKey) async {
    return await _channel.invokeMethod('encryptHmacSHA256ToString',<String,dynamic>{'encryptHmacSHA256':encryptHmacSHA256,'encryptHmacKey':encryptHmacKey});
  }

  static Future<String> encryptHmacSHA384ToString(String encryptHmacSHA384,String encryptHmacKey) async {
    return await _channel.invokeMethod('encryptHmacSHA384ToString',<String,dynamic>{'encryptHmacSHA384':encryptHmacSHA384,'encryptHmacKey':encryptHmacKey});
  }

  static Future<String> encryptHmacSHA512ToString(String encryptHmacSHA512,String encryptHmacKey) async {
    return await _channel.invokeMethod('encryptHmacSHA512ToString',<String,dynamic>{'encryptHmacSHA512':encryptHmacSHA512,'encryptHmacKey':encryptHmacKey});
  }



}
