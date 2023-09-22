package com.samir.features.utils.widgets

import androidx.appcompat.app.AppCompatActivity

object CustomAlertDialog {


    fun showDialogLogout(activity: AppCompatActivity, firstAction: (() -> Unit)?){
      /*  val builder = AlertDialog.Builder(activity, R.style.CustomAlertDialog).create()
        val view = LayoutInflater.from(activity).inflate(R.layout.dialoge_logout, null)

        val proceedBtn = view.findViewById<LinearLayout>(R.id.btn_confirm)
        val dismissBtn = view.findViewById<LinearLayout>(R.id.btn_back)
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