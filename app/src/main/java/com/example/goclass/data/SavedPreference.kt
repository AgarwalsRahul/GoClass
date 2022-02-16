package com.example.goclass.data

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager


object SavedPreference {

    const val EMAIL= "email"
    const val NAME="name"
    const val UID="name"
    const val CLASSID=""
    private  fun getSharedPreference(ctx: Context?): SharedPreferences? {
        return PreferenceManager.getDefaultSharedPreferences(ctx)
    }

    private fun  editor(context: Context, const:String, string: String){
        getSharedPreference(
            context
        )?.edit()?.putString(const,string)?.apply()
    }

    fun getEmail(context: Context)= getSharedPreference(
        context
    )?.getString(EMAIL,"")

    fun setEmail(context: Context, email: String){
        editor(
            context,
            EMAIL,
            email
        )
    }

    fun setName(context: Context, name:String){
        editor(
            context,
            NAME,
            name
        )
    }

    fun getName(context: Context) = getSharedPreference(
        context
    )?.getString(NAME,"")
    fun setUID(context: Context, uid:String){
        editor(
            context,
            UID,
            uid
        )
    }
    fun getClassId(context: Context) = getSharedPreference(
        context
    )?.getString(CLASSID,"")
    fun setClassId(context: Context, classid:String){
        editor(
            context,
            UID,
            classid
        )
    }
    fun getUID(context: Context) = getSharedPreference(
        context
    )?.getString(UID,"")


}