package com.samir.features.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.samir.features.utils.widgets.CustomAlertDialog
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

abstract class BaseFragment<VM : BaseViewModel, VB : ViewDataBinding> : Fragment() , View.OnClickListener,
    BaseInterface {

    protected var baseViewModel: VM? = null
    lateinit var baseViewBinding : VB

    protected abstract fun getContentView(): Int
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        baseViewBinding = DataBindingUtil.inflate(inflater , getContentView() , container , false)
        return baseViewBinding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeViewModel()
        baseViewModel?.start()
    }
    protected abstract fun initializeViewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

        subscribeLiveData() //...not used
    }
    protected open fun subscribeLiveData() {}
    protected abstract fun initView()

    //region Async Task CoroutineScope
    fun <R> CoroutineScope.executeAsyncTask(
        onPreExecute: () -> Unit,
        doInBackground: () -> R,
        onPostExecute: (R) -> Unit
    ) = launch {
        onPreExecute() // runs in Main Thread
        val result = withContext(Dispatchers.IO) {
            doInBackground() // runs in background thread without blocking the Main Thread
        }
        onPostExecute(result) // runs in Main Thread
    }
    //endregion

    //region life cycle
    override fun onDestroy() {
        super.onDestroy()
        baseViewModel?.stop()
    }
    override fun customBackPressed() {}
    //endregion

    //region Dialogs
        // region Insert Reading
        fun showDialogEnterMeterStatus(  myAction: ((String) -> Unit)?) {
          /*  CustomAlertDialog.showDialogEnterMeterStatus(
                requireActivity() as AppCompatActivity,
                myAction
            )*/
        }
        fun showDialogEnterDataStatus(  myAction: ((String) -> Unit)?) {
            /*CustomAlertDialog.showDialogEnterDataStatus(
                requireActivity() as AppCompatActivity,
                myAction
            )*/
        }
        fun showDialogEnterReadingMeter(  myAction: ((String) -> Unit)?) {
            /*CustomAlertDialog.showDialogEnterReadingMeter(
                requireActivity() as AppCompatActivity,
                myAction
            )*/
        }

        //endregion

        //region Common Places
        fun showDialogAskAmountCollected(  myAction: (() -> Unit)?) {
          /*  CustomAlertDialog.showDialogAskAmountCollected(
                requireActivity() as AppCompatActivity,
                myAction
            )*/
        }
        fun showDialogLogout(  myAction: (() -> Unit)?) {
            CustomAlertDialog.showDialogLogout(
                requireActivity() as AppCompatActivity,
                myAction
            )
        }
        //endregion
    //endregion

}