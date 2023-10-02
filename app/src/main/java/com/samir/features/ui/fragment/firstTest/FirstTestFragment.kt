package com.samir.features.ui.fragment.firstTest


import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.samir.features.R
import com.samir.features.base.BaseFragment
import com.samir.features.databinding.FragmentFirstTestBinding


class FirstTestFragment : BaseFragment<FirstTestViewModel, FragmentFirstTestBinding>()  {

    override fun getContentView(): Int {
        return R.layout.fragment_first_test
    }
    override fun initializeViewModel() {
        val viewModel: FirstTestViewModel by viewModels()
        baseViewModel = viewModel
    }
    private fun setInitialAnimations(){
        // baseViewBinding.tvStudentServices.animation = AnimationUtils.loadAnimation(requireContext() , R.anim.slide_in_right)
    }
    override fun initView() {
        setInitialAnimations()
        baseViewBinding.buttonFirstTestToSecond.setOnClickListener(this)
        //onKeyUp()
    }

    override fun onClick(v: View?) {
        when (v)
        {
            baseViewBinding.buttonFirstTestToSecond->{
                val direction = FirstTestFragmentDirections.actionFirstTestFragmentToSecondTestFragment()
                findNavController().navigate(direction)
            }
        }
    }

}