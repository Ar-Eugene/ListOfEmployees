package com.example.listofemployees

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.listofemployees.databinding.FragmentListOfEmployeesBinding
import com.google.android.material.tabs.TabLayoutMediator

class ListOfEmployeesFragment : Fragment() {
    private lateinit var binding: FragmentListOfEmployeesBinding
    private lateinit var tabLayoutMediator: TabLayoutMediator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{

        binding = FragmentListOfEmployeesBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewPager.adapter = FragmentPagerAdapter(childFragmentManager,viewLifecycleOwner.lifecycle)
        tabLayoutMediator = TabLayoutMediator(binding.tabLayout,binding.viewPager){tab,position ->
            when(position){
                0->tab.text=this.getString(R.string.all_people)
                1->tab.text=this.getString(R.string.designers)
                2->tab.text=this.getString(R.string.analysts)
            }
        }
        tabLayoutMediator.attach()
    }


}
