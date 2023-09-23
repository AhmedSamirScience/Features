package com.samir.features.ui.fragment.serviceList

import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.samir.features.R
import com.samir.features.base.BaseFragment
import com.samir.features.databinding.FragmentServiceListBinding


class ServiceListFragment : BaseFragment<ServiceListViewModel, FragmentServiceListBinding>()  {

    override fun getContentView(): Int {
        return R.layout.fragment_service_list
    }
    override fun initializeViewModel() {
        val viewModel: ServiceListViewModel by viewModels()
        baseViewModel = viewModel
    }
    private fun setInitialAnimations(){
        // baseViewBinding.tvStudentServices.animation = AnimationUtils.loadAnimation(requireContext() , R.anim.slide_in_right)
    }

    override fun initView() {
        setInitialAnimations()
        baseViewBinding.mapsBtn.setOnClickListener(this)
        baseViewBinding.backBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v)
        {
            baseViewBinding.mapsBtn-> {
                //val direction = ServiceListFragmentDirections.actionNavHomeToNavBillPaymentSearch(customerListRs, routeName)
                //findNavController().navigate(direction)
                findNavController().navigate(R.id.action_serviceListFragment_to_mapsFragment)
            }
            baseViewBinding.backBtn-> {
                findNavController().navigate(R.id.action_serviceListFragment_to_backFragment)
            }
        }
    }

    //region application life cycle

    //endregion

}