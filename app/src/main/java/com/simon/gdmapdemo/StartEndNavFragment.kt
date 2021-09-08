package com.simon.gdmapdemo

import android.os.Bundle
import android.view.View
import com.amap.api.maps.model.LatLng
import com.amap.api.navi.AMapNaviView
import com.amap.api.navi.AMapNaviViewListener
import com.amap.api.navi.enums.NaviType
import com.amap.api.navi.enums.TravelStrategy
import com.amap.api.navi.model.AMapCalcRouteResult
import com.amap.api.navi.model.NaviLatLng
import com.amap.api.navi.model.NaviPoi
import com.simon.gdmapdemo.databinding.FragmentSenavBinding

class StartEndNavFragment : MyBaseFragment(R.layout.fragment_senav),
    AMapNaviViewListener {

    private var mStartLatlng = NaviLatLng(39.825934, 116.342972)
    private var mEndLatlng = NaviLatLng(40.084894, 116.603039)

    lateinit var binding: FragmentSenavBinding
    lateinit var aMapNavView: AMapNaviView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSenavBinding.bind(view)
        aMapNavView = binding.naviView
        aMapNavView.onCreate(savedInstanceState)
        aMapNavView.setAMapNaviViewListener(this)


        val aMapNaviViewOptions = aMapNavView.viewOptions
        aMapNaviViewOptions.isAfterRouteAutoGray = true
        aMapNavView.viewOptions = aMapNaviViewOptions
    }

    override fun onResume() {
        super.onResume()
        aMapNavView.onResume()
    }

    override fun onPause() {
        super.onPause()
        aMapNavView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        aMapNavView.onDestroy()
    }


    override fun onNaviSetting() {
        TODO("Not yet implemented")
    }

    override fun onNaviCancel() {
        TODO("Not yet implemented")
    }

    override fun onNaviBackClick(): Boolean {
        TODO("Not yet implemented")
    }

    override fun onNaviMapMode(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onNaviTurnClick() {
        TODO("Not yet implemented")
    }

    override fun onNextRoadClick() {
        TODO("Not yet implemented")
    }

    override fun onScanViewButtonClick() {
        TODO("Not yet implemented")
    }

    override fun onLockMap(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun onNaviViewLoaded() {
        TODO("Not yet implemented")
    }

    override fun onMapTypeChanged(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onNaviViewShowMode(p0: Int) {
        TODO("Not yet implemented")
    }


    //AMapNaviListener
    override fun onInitNaviSuccess() {
        super.onInitNaviSuccess()
        // 构造起点POI

//        // 无起点算路
//        mAMapNavi.calculateEleBikeRoute(new NaviLatLng(39.925846, 116.435765));

//        // 起终点算路
//        mAMapNavi.calculateEleBikeRoute(new NaviLatLng(39.925846, 116.435765), new NaviLatLng(39.925846, 116.532765));


        // 构造起点POI
        val fromPoi = NaviPoi("起点", LatLng(39.925846, 116.435765), "")
        // 构造终点POI
        // 构造终点POI
        val toPoi = NaviPoi("终点", LatLng(39.925846, 116.532765), "")
        // 进行骑行(电动车)算路
        // 进行骑行(电动车)算路
        aMapNavi.calculateEleBikeRoute(fromPoi, toPoi, TravelStrategy.SINGLE)
    }

    override fun onCalculateRouteSuccess(aMapCalcRouteResult: AMapCalcRouteResult?) {
        super.onCalculateRouteSuccess(aMapCalcRouteResult)
        aMapNavi.startNavi(NaviType.GPS)
    }
}