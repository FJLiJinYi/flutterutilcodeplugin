import 'dart:async';

import 'package:flutter/services.dart';

class Flutterutilcodeplugin {


  static const MethodChannel _channel =
      const MethodChannel('plugins.flutter.io/flutterutilcodeplugin');

  //about device
  static Future<String> getPlatformVersion()async{
    return await _channel.invokeMethod('getPlatformVersion');
  }

  static Future<String> getMacAddress()async{
    return await _channel.invokeMethod('getMacAddress');
  }

  static Future<bool> isDeviceRooted()async{
    return await _channel.invokeMethod('isDeviceRooted');
  }

  static Future<bool> isAdbEnabled()async{
    return await _channel.invokeMethod('isAdbEnabled');
  }

  static Future<int> getSDKVersionCode()async{
    return await _channel.invokeMethod('getSDKVersionCode');
  }

  static Future<String> getAndroidID()async{
    return await _channel.invokeMethod('getAndroidID');
  }



}
