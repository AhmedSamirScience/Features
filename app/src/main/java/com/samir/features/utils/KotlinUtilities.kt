package com.samir.features.utils

import android.app.Activity
import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.util.*

abstract class KotlinUtilities {
    companion object {
        fun arabicToDecimal(number: String): String? {
            return try {
                val chars = CharArray(number.length)
                for (i in number.indices) {
                    var ch = number[i]
                    if (ch.code in 0x0660..0x0669)
                        ch -= 0x0660 - '0'.code
                    else if (ch.code in 0x06f0..0x06F9)
                        ch -= (0x06f0 - '0'.code)
                    chars[i] = ch
                }
                String(chars)
            } catch (e: Exception) {
                number
            }
        }

        fun hideKeyboard(activity: Activity) {
            val imm = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            var view: View? = activity.currentFocus
            if (view == null) {
                view = View(activity)
            }
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0)
        }

        @RequiresApi(Build.VERSION_CODES.M)
        fun hasNetworkAccess(context: Context): Boolean {
            val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.activeNetwork)
            if (capabilities != null) {
                if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI")
                    return true
                } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET")
                    return true
                }
            }
            return false
        }

        fun getCurrentDateAndTime(): String {
            val c: Date = Calendar.getInstance().getTime()
            val df = SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa", Locale.ENGLISH)
            return df.format(c)
        }

        /* if you need to filter list (needed inside the adapter)
       private fun filter(text: String, itemList : List<String>) {
          val filteredList: ArrayList<String> = ArrayList()
          val number = JavaUtilities.arabicToDecimal(text) // number = 42;"۴۲"

          for (item in itemList) {
              if (item.contains(text) || item.contains(number)) {
                  filteredList.add(item)
              }
          }
          if (filteredList.size==0) {
              baseViewBinding.editTextSearch.setText("")
          }
          payBillAdapter.putSearch(filteredList)
      }
       fun filter(text: String, itemList: MutableList<Datum>?) {
           val txt = text.toLowerCase(Locale.ROOT)
           val filteredNames = ArrayList<Merchant>()

           itemList?.filterTo(filteredNames) {
               it.name!!.toLowerCase(Locale.ROOT).contains(txt.toLowerCase(Locale.ROOT)) ||
                       it.address!!.toLowerCase(Locale.ROOT).contains(txt.toLowerCase(Locale.ROOT)) ||
                       it.addressAr!!.toLowerCase(Locale.ROOT).contains(txt.toLowerCase(Locale.ROOT))
           }
           merchantsAdapter?.filterList(filteredNames)
       }
   */
    }
}