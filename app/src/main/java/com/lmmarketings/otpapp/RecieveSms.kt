package com.lmmarketings.otpapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage
import android.widget.Toast
import kotlin.Exception

class RecieveSms : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(Intent.ACTION_BOOT_COMPLETED == intent!!.action
                || Intent.ACTION_BOOT_COMPLETED == intent!!.action
                ||Intent.ACTION_REBOOT == intent!!.action
                    ||Intent.ACTION_SHUTDOWN == intent!!.action){

            val i=Intent(context,MainActivity::class.java)
            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context!!.startActivity(i)
        }
        if(intent!!.action.equals("android.provider.Telephony.SMS_RECEIVED")){
            val bundle=intent.extras
            var message:String?=null
            if(bundle!=null){
                try {
                    val pdus = bundle.get("pdus") as Array<Any>
                    val messages: SmsMessage = SmsMessage.createFromPdu(pdus[0] as ByteArray)
                    Toast.makeText(context,messages.displayMessageBody,Toast.LENGTH_SHORT).show()
                }catch (e : Exception)
                {
                    Toast.makeText(context,"Some Error Occured",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}


