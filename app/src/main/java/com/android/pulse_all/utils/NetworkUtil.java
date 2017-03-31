package com.android.pulse_all.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;

import com.android.pulse_all.PulseApplication;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by angleterry on 2017/3/25.
 */

public class NetworkUtil {

    private static ConnectivityManager mConnectivityManager;

    public NetworkUtil() {
    }

    public static boolean isConnected(Context context) {
        try {
            if(mConnectivityManager == null) {
                mConnectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            }

            NetworkInfo e = mConnectivityManager.getActiveNetworkInfo();
            return e != null && (e.isConnected() || e.getState() == NetworkInfo.State.CONNECTING);
        } catch (Exception var2) {
            LogUtils.e(var2);
            return false;
        }
    }

    public static boolean isWifiAvailable() {
        try {
            if(mConnectivityManager == null) {
                mConnectivityManager = (ConnectivityManager) PulseApplication.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
            }

            NetworkInfo e = mConnectivityManager.getActiveNetworkInfo();
            return e != null && e.isAvailable() && e.getType() == 1;
        } catch (Exception var1) {
            LogUtils.e(var1);
            return false;
        }
    }

    public static boolean isMobileAvailable() {
        try {
            if(mConnectivityManager == null) {
                mConnectivityManager = (ConnectivityManager) PulseApplication.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
            }

            NetworkInfo e = mConnectivityManager.getActiveNetworkInfo();
            return e != null && e.isAvailable() && e.getType() == 0;
        } catch (Exception var1) {
            LogUtils.e(var1);
            return false;
        }
    }

    public static int getNetType() {
        int netType = -1;

        try {
            if(mConnectivityManager == null) {
                mConnectivityManager = (ConnectivityManager) PulseApplication.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
            }

            NetworkInfo e = mConnectivityManager.getActiveNetworkInfo();
            if(e != null && e.isAvailable()) {
                netType = e.getType();
            }
        } catch (Exception var2) {
            LogUtils.e(var2);
        }

        return netType;
    }

    public static String getNetMode() {
        String netMode = "none";

        try {
            if(mConnectivityManager == null) {
                mConnectivityManager = (ConnectivityManager) PulseApplication.getInstance().getSystemService(Context.CONNECTIVITY_SERVICE);
            }

            NetworkInfo e = mConnectivityManager.getActiveNetworkInfo();
            if(e != null && e.isAvailable()) {
                int netType = e.getType();
                if(netType == 1) {
                    netMode = e.getTypeName();
                } else if(netType == 0) {
                    netMode = e.getExtraInfo();
                }
            }
        } catch (Exception var3) {
            LogUtils.e(var3);
        }

        if(netMode == null) {
            netMode = "none";
        }

        return netMode;
    }

    /** @deprecated */
    @Deprecated
    public static int getLinkSpeed(Context context) {
        try {
            WifiInfo e = ((WifiManager)context.getSystemService(Context.WIFI_SERVICE)).getConnectionInfo();
            return e.getLinkSpeed();
        } catch (Exception var2) {
            LogUtils.e(var2);
            return 0;
        }
    }

    /** @deprecated */
    @Deprecated
    public static int getRssiLevel(Context context) {
        try {
            WifiInfo e = ((WifiManager)context.getSystemService(Context.WIFI_SERVICE)).getConnectionInfo();
            return WifiManager.calculateSignalLevel(e.getRssi(), 5);
        } catch (Exception var2) {
            LogUtils.e(var2);
            return 1;
        }
    }

    public static void setMobileDataEnabled(Context context, boolean enabled) {
        try {
            ConnectivityManager e = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
            Class conmanClass = Class.forName(e.getClass().getName());
            Field iConnectivityManagerField = conmanClass.getDeclaredField("mService");
            iConnectivityManagerField.setAccessible(true);
            Object iConnectivityManager = iConnectivityManagerField.get(e);
            Class iConnectivityManagerClass = Class.forName(iConnectivityManager.getClass().getName());
            Method setMobileDataEnabledMethod = iConnectivityManagerClass.getDeclaredMethod("setMobileDataEnabled", new Class[]{Boolean.TYPE});
            setMobileDataEnabledMethod.setAccessible(true);
            setMobileDataEnabledMethod.invoke(iConnectivityManager, new Object[]{Boolean.valueOf(enabled)});
        } catch (Exception var8) {
            LogUtils.e(var8);
        }

    }

}
