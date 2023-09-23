package com.samir.features.ui.fragment.popStack

import android.view.KeyEvent
import android.view.View
 import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.samir.features.R
import com.samir.features.base.BaseFragment
import com.samir.features.databinding.FragmentPopStackBackBinding

class PopStackBackFragment : BaseFragment<PopStackBackViewModel, FragmentPopStackBackBinding>()  {

    override fun getContentView(): Int {
        return R.layout.fragment_pop_stack_back
    }
    override fun initializeViewModel() {
        val viewModel: PopStackBackViewModel by viewModels()
        baseViewModel = viewModel
    }
    private fun setInitialAnimations(){
        // baseViewBinding.tvStudentServices.animation = AnimationUtils.loadAnimation(requireContext() , R.anim.slide_in_right)
    }
    override fun initView() {
        setInitialAnimations()
        baseViewBinding.popStackBackBtn.setOnClickListener(this)
        baseViewBinding.normalBackBtn.setOnClickListener(this)
        //onKeyUp()
    }

    override fun onClick(v: View?) {
        when (v)
        {
            baseViewBinding.popStackBackBtn-> {
                findNavController().apply {
                    popBackStack()
                    navigateUp()
                }
            }
            baseViewBinding.normalBackBtn-> {
                findNavController().apply {
                    navigateUp()
                }
            }
        }
    }

//    fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
//        return if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN || keyCode == KeyEvent.KEYCODE_VOLUME_UP){
//            viewModel.setEvent(keyCode)
//            super.dispatchKeyEvent(keyCode)
//            true
//        } else super.onKeyUp(keyCode, event)
//    }

}

