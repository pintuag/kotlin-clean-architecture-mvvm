package com.sa.kotlin_cleanarch.sample.model.preference

import android.content.SharedPreferences


/* Created by Sahil Bharti on 10/1/19.
 *
*/

class PreferenceHelper constructor(private val mSharedPreferences: SharedPreferences) {


    fun put(key: String, value: String) {
        mSharedPreferences.edit().putString(key, value).commit()
    }

    fun put(key: String, value: Int) {
        mSharedPreferences.edit().putInt(key, value).commit()
    }

    fun put(key: String, value: Long) {
        mSharedPreferences.edit().putLong(key, value).commit()
    }

    fun put(key: String, value: Float) {
        mSharedPreferences.edit().putFloat(key, value).commit()
    }

    fun put(key: String, value: Boolean) {
        mSharedPreferences.edit().putBoolean(key, value).commit()
    }

    operator fun get(key: String): String {
        return mSharedPreferences.getString(key, "").toString()
    }

    operator fun get(key: String, defaultValue: Int): Int? {
        return mSharedPreferences.getInt(key, defaultValue)
    }

    operator fun get(key: String, defaultValue: Long): Long? {
        return mSharedPreferences.getLong(key, defaultValue)
    }

    operator fun get(key: String, defaultValue: Float): Float? {
        return mSharedPreferences.getFloat(key, defaultValue)
    }

    fun getBoolean(key: String): Boolean {
        return mSharedPreferences.getBoolean(key, false)
    }

    fun deleteSavedData(key: String) {
        mSharedPreferences.edit().remove(key).commit()
    }

    fun isTokenAvailable(): Boolean {
        return !mSharedPreferences.getString(PreferenceConstants.TOKEN, "").isNullOrEmpty()
    }

}