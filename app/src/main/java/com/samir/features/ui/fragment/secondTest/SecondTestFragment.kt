package com.samir.features.ui.fragment.secondTest

import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.samir.features.R
import com.samir.features.base.BaseFragment
import com.samir.features.databinding.FragmentSecondTestBinding

class SecondTestFragment : BaseFragment<SecondTestViewModel, FragmentSecondTestBinding>()  {

    override fun getContentView(): Int {
        return R.layout.fragment_second_test
    }
    override fun initializeViewModel() {
        val viewModel: SecondTestViewModel by viewModels()
        baseViewModel = viewModel
    }
    private fun setInitialAnimations(){

    }
    override fun initView() {
        setInitialAnimations()
        //onKeyUp()
    }

    override fun onClick(v: View?) {
        when (v)
        {
        }
    }
}