package vn.home.htm.tripdemo.data.source.local;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by HaiMinhTran on 4/4/2018.
 */

public class SharedPreferenceApi {
    public static final String PREFS_NAME = "AYESharedPreference";
    private SharedPreferences mSharedPreferences;
    private static SharedPreferenceApi INSTANCE;

    public SharedPreferenceApi(Context context) {
        this.mSharedPreferences = context.getSharedPreferences(PREFS_NAME,Context.MODE_PRIVATE);
    }

    public static SharedPreferenceApi getInstance(Context context){
        if (INSTANCE == null){
            INSTANCE = new SharedPreferenceApi(context);
        }
        return INSTANCE;
    }

    public <T> void put(String key,T data){
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        if (data instanceof String){
            editor.putString(key,(String)data);
        }else if (data instanceof Boolean){
            editor.putBoolean(key, (Boolean) data);
        }else if (data instanceof Float){
            editor.putFloat(key, (Float) data);
        }else if (data instanceof Integer){
            editor.putInt(key, (Integer) data);
        }else if (data instanceof Long){
            editor.putLong(key, (Long) data);
        }
        editor.apply();
    }

    public <T> T get(String key, Class<T> clazz, T defValue) {
        if (clazz == String.class) {
            return (T) mSharedPreferences.getString(key, (String) defValue);
        } else if (clazz == Boolean.class) {
            return (T) Boolean.valueOf(mSharedPreferences.getBoolean(key, (Boolean) defValue));
        } else if (clazz == Float.class) {
            return (T) Float.valueOf(mSharedPreferences.getFloat(key, (Float) defValue));
        } else if (clazz == Integer.class) {
            return (T) Integer.valueOf(mSharedPreferences.getInt(key, (Integer) defValue));
        } else if (clazz == Long.class) {
            return (T) Long.valueOf(mSharedPreferences.getLong(key, (Long) defValue));
        }
        return null;
    }

    public void clear(){
        mSharedPreferences.edit().clear().apply();
    }
}
