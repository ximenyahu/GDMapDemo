package com.simon.gdmapdemo

import android.Manifest
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.hjq.permissions.OnPermission
import com.hjq.permissions.XXPermissions
import com.lxj.xpopup.XPopup
import com.simon.gdmapdemo.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    companion object {
        private const val TAG = "MainFragment"
    }

    lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.btStartEnd.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToStartEndNavFragment())
        }
        binding.btStartSecond.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment())
        }

        //默认用户十分配合地授予权限
        if (!checkMyPermissions()) {
            XXPermissions.with(activity)
                .constantRequest()
                .permission(
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.READ_PHONE_STATE,
                ).request(object : OnPermission {
                    override fun hasPermission(granted: List<String>, isAll: Boolean) {

                    }

                    override fun noPermission(denied: List<String>, quick: Boolean) {
                        XPopup.Builder(requireContext())
                            .asConfirm("权限提醒", "地图功能需要授予相关权限",
                                { XXPermissions.gotoPermissionSettings(requireContext()) }) {
                            }.show()
                    }
                })
        }
    }

    private fun checkMyPermissions(): Boolean {
        return XXPermissions.isHasPermission(
            requireContext(), Manifest.permission.ACCESS_COARSE_LOCATION,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.READ_PHONE_STATE,
        )
    }
}