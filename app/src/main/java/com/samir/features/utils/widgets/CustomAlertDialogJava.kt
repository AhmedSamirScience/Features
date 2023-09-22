package com.samir.features.utils.widgets

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.view.LayoutInflater
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

object CustomAlertDialogJava {

    //region Common Places
    @JvmStatic
    fun showDialogError(act: AppCompatActivity , message : String   ){
      /*  val builder = AlertDialog.Builder(act, R.style.CustomAlertDialog).create()
        val view = LayoutInflater.from(act).inflate(R.layout.dialoge_error, null)

        val dismissBtn = view.findViewById<LinearLayout>(R.id.btn_dismiss)
        val textMessage = view.findViewById<TextView>(R.id.txt_message)
        textMessage.text = message
        builder.setView(view)
        builder.getWindow()?.setBackgroundDrawableResource(android.R.color.transparent);

        dismissBtn.setOnClickListener {
            builder.dismiss()
        }

        builder.setCanceledOnTouchOutside(false)
        builder.setCancelable(false)

        builder.show()*/
    }

    @SuppressLint("MissingInflatedId")
    @JvmStatic
    fun showDialogSuccess(act: AppCompatActivity , message : String){
       /* val builder = AlertDialog.Builder(act, R.style.CustomAlertDialog).create()
        val view = LayoutInflater.from(act).inflate(R.layout.dialoge_success, null)

        val dismissBtn = view.findViewById<LinearLayout>(R.id.btn_dismiss)
        val textMessage = view.findViewById<TextView>(R.id.txt_message)
        textMessage.text = message
        builder.setView(view)
        builder.getWindow()?.setBackgroundDrawableResource(android.R.color.transparent);

        *//*
                builder.getWindow()?.attributes?.windowAnimations = R.style.DialogAnimation
        *//*

        dismissBtn.setOnClickListener {
            val intent = Intent(act, MainActivityprint::class.java)
            intent.putExtra("invoice", 1)
            act.startActivity(intent)
            builder.dismiss()
            act.finish()
        }
        builder.setCanceledOnTouchOutside(false)
        builder.setCancelable(false)

        builder.show()*/
    }

    @JvmStatic
    fun showDialogErrorWithActionButton(act: AppCompatActivity , message : String, firstAction: (() -> Unit)  ){
       /* val builder = AlertDialog.Builder(act, R.style.CustomAlertDialog).create()
        val view = LayoutInflater.from(act).inflate(R.layout.dialoge_error, null)

        val dismissBtn = view.findViewById<LinearLayout>(R.id.btn_dismiss)
        val textMessage = view.findViewById<TextView>(R.id.txt_message)
        textMessage.text = message
        builder.setView(view)
        builder.getWindow()?.setBackgroundDrawableResource(android.R.color.transparent)

        dismissBtn.setOnClickListener {
            builder.dismiss()
            firstAction?.invoke()
        }

        builder.setCanceledOnTouchOutside(false)
        builder.setCancelable(false)

        builder.show()*/
    }

    @JvmStatic
    fun showDialogCheckAmountWithActionButton(act: AppCompatActivity , firstAction: (() -> Unit)  ){
       /* val builder = AlertDialog.Builder(act, R.style.CustomAlertDialog).create()
        val view = LayoutInflater.from(act).inflate(R.layout.dialog_ask_amount_collected, null)

        val dismissBtn = view.findViewById<TextView>(R.id.btn_back)
        val confirmBtn = view.findViewById<TextView>(R.id.btn_confirm)

        builder.setView(view)
        builder.getWindow()?.setBackgroundDrawableResource(android.R.color.transparent);

        dismissBtn.setOnClickListener {
            builder.dismiss()
        }

        confirmBtn.setOnClickListener {
            builder.dismiss()
            firstAction?.invoke()
        }

        builder.setCanceledOnTouchOutside(false)
        builder.setCancelable(false)

        builder.show()*/
    }

    @JvmStatic
    fun showDialogConfirmationPayWithActionButton(act: AppCompatActivity, firstAction: (() -> Unit)  ){
       /* val builder = AlertDialog.Builder(act, R.style.CustomAlertDialog).create()
        val view = LayoutInflater.from(act).inflate(R.layout.dialoge_confirm_pay, null)

        val proceedBtn = view.findViewById<TextView>(R.id.btn_confirm)
        val dismissBtn = view.findViewById<TextView>(R.id.btn_not_yet)
        builder.setView(view)

        proceedBtn.setOnClickListener {
            builder.dismiss()
            firstAction?.invoke()
        }
        dismissBtn.setOnClickListener {
            builder.dismiss()
        }

        builder.setCanceledOnTouchOutside(false)
        builder.setCancelable(false)

        builder.show()*/
    }
    //endregion
}