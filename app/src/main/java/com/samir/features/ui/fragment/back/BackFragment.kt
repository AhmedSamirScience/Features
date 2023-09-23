package com.samir.features.ui.fragment.back

import android.view.View
import androidx.fragment.app.viewModels
import com.samir.features.R
import com.samir.features.base.BaseFragment
import com.samir.features.databinding.FragmentBackBinding

class BackFragment : BaseFragment<BackViewModel, FragmentBackBinding>()  {

    override fun getContentView(): Int {
        return R.layout.fragment_back
    }
    override fun initializeViewModel() {
        val viewModel: BackViewModel by viewModels()
        baseViewModel = viewModel
    }
    private fun setInitialAnimations(){
        // baseViewBinding.tvStudentServices.animation = AnimationUtils.loadAnimation(requireContext() , R.anim.slide_in_right)
    }
    override fun initView() {
        setInitialAnimations()
    }

    override fun onClick(v: View?) {
        
    }

    //region application life cycle

    //endregion

}