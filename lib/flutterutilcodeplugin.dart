import 'dart:async';

import 'package:flutter/services.dart';

class Flutterutilcodeplugin {
  static const MethodChannel _channel =
      const MethodChannel('flutterutilcodeplugin');

  static Future<String> get platformVersion async {
    final String version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
