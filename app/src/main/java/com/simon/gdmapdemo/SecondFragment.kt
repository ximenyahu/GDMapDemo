package com.simon.gdmapdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.amap.api.maps.model.LatLng
import com.amap.api.maps.model.Poi
import com.amap.api.navi.AmapNaviPage
import com.amap.api.navi.AmapNaviParams
import com.amap.api.navi.AmapNaviType
import com.amap.api.navi.INaviInfoCallback
import com.amap.api.navi.model.AMapNaviLocation

class SecondFragment : Fragment(R.layout.fragment_second), INaviInfoCallback {

    var p2 = LatLng(39.917337, 116.397056) //故宫博物院

    var p3 = LatLng(39.904556, 116.427231) //北京站


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val params =
            AmapNaviParams(Poi("北京站", p3, ""), null, Poi("故宫博物院", p2, ""), AmapNaviType.DRIVER)
        params.setUseInnerVoice(true)
        AmapNaviPage.getInstance()
            .showRouteActivity(requireActivity().application, params, this@SecondFragment)
    }

    override fun onInitNaviFailure() {
        TODO("Not yet implemented")
    }

    override fun onGetNavigationText(p0: String?) {
        TODO("Not yet implemented")
    }

    override fun onLocationChange(p0: AMapNaviLocation?) {
        TODO("Not yet implemented")
    }

    override fun onArriveDestination(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun onStartNavi(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onCalculateRouteSuccess(p0: IntArray?) {
        TODO("Not yet implemented")
    }

    override fun onCalculateRouteFailure(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onStopSpeaking() {
        TODO("Not yet implemented")
    }

    override fun onReCalculateRoute(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onExitPage(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onStrategyChanged(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onArrivedWayPoint(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onMapTypeChanged(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onNaviDirectionChanged(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onDayAndNightModeChanged(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onBroadcastModeChanged(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onScaleAutoChanged(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun getCustomMiddleView(): View {
        TODO("Not yet implemented")
    }

    override fun getCustomNaviView(): View {
        TODO("Not yet implemented")
    }

    override fun getCustomNaviBottomView(): View {
        TODO("Not yet implemented")
    }
}