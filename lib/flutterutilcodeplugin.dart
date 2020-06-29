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



}
