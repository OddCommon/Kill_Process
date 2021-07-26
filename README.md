# Killing Specific Process Introduction

AAR file, demo APK are in /resource.    
Note: Regarding java package creation and usage, please refer to [the Guideline](http://static.appstore.picovr.com/docs/JarUnity/index.html)

## Introduction  
This demo shows how to kill a specific process.

## Class Name  
```
com.picovr.killapplication.KillAppClass
```

## Permission 
Add uses-permission property: 
```
<uses-permission android:name="android.permission.KILL_BACKGROUND_PROCESSES" />
```
![](https://github.com/picoxr/LauncherWebVR/blob/master/01.png)

## Interface  
```
void killApp(String pkgName, Context context)
```

## Sample Code
```
AndroidJavaObject killApp = new AndroidJavaObject("com.picovr.killapplication.KillAppClass");
AndroidJavaObject context = new AndroidJavaClass("com.unity3d.player.UnityPlayer").GetStatic<AndroidJavaObject>("currentActivity");

killApp.Call("killApp", "com.picovr.store", context);
```



