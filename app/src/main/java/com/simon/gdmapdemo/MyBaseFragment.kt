package com.simon.gdmapdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.amap.api.navi.AMapNavi
import com.amap.api.navi.AMapNaviListener
import com.amap.api.navi.ParallelRoadListener
import com.amap.api.navi.enums.AMapNaviParallelRoadStatus
import com.amap.api.navi.model.*

open class MyBaseFragment(contentLayoutId: Int) : Fragment(contentLayoutId), AMapNaviListener,
    ParallelRoadListener {

    lateinit var aMapNavi: AMapNavi
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        aMapNavi = AMapNavi.getInstance(requireActivity().application)
        aMapNavi.addAMapNaviListener(this)
        aMapNavi.addParallelRoadListener(this)
        aMapNavi.setUseInnerVoice(true, true)

        aMapNavi.setEmulatorNaviSpeed(75)

    }

    override fun onInitNaviFailure() {
        TODO("Not yet implemented")
    }

    override fun onInitNaviSuccess() {
        TODO("Not yet implemented")
    }

    override fun onStartNavi(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onTrafficStatusUpdate() {
        TODO("Not yet implemented")
    }

    override fun onLocationChange(p0: AMapNaviLocation?) {
        TODO("Not yet implemented")
    }

    override fun onGetNavigationText(p0: Int, p1: String?) {
        TODO("Not yet implemented")
    }

    override fun onGetNavigationText(p0: String?) {
        TODO("Not yet implemented")
    }

    override fun onEndEmulatorNavi() {
        TODO("Not yet implemented")
    }

    override fun onArriveDestination() {
        TODO("Not yet implemented")
    }

    override fun onCalculateRouteFailure(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onCalculateRouteFailure(p0: AMapCalcRouteResult?) {
        TODO("Not yet implemented")
    }

    override fun onReCalculateRouteForYaw() {
        TODO("Not yet implemented")
    }

    override fun onReCalculateRouteForTrafficJam() {
        TODO("Not yet implemented")
    }

    override fun onArrivedWayPoint(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onGpsOpenStatus(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun onNaviInfoUpdate(p0: NaviInfo?) {
        TODO("Not yet implemented")
    }

    override fun updateCameraInfo(p0: Array<out AMapNaviCameraInfo>?) {
        TODO("Not yet implemented")
    }

    override fun updateIntervalCameraInfo(
        p0: AMapNaviCameraInfo?,
        p1: AMapNaviCameraInfo?,
        p2: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun onServiceAreaUpdate(p0: Array<out AMapServiceAreaInfo>?) {
        TODO("Not yet implemented")
    }

    override fun showCross(p0: AMapNaviCross?) {
        TODO("Not yet implemented")
    }

    override fun hideCross() {
        TODO("Not yet implemented")
    }

    override fun showModeCross(p0: AMapModelCross?) {
        TODO("Not yet implemented")
    }

    override fun hideModeCross() {
        TODO("Not yet implemented")
    }

    override fun showLaneInfo(p0: Array<out AMapLaneInfo>?, p1: ByteArray?, p2: ByteArray?) {
        TODO("Not yet implemented")
    }

    override fun showLaneInfo(p0: AMapLaneInfo?) {
        TODO("Not yet implemented")
    }

    override fun hideLaneInfo() {
        TODO("Not yet implemented")
    }

    override fun onCalculateRouteSuccess(p0: IntArray?) {
        TODO("Not yet implemented")
    }

    override fun onCalculateRouteSuccess(p0: AMapCalcRouteResult?) {
        TODO("Not yet implemented")
    }

    override fun notifyParallelRoad(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun OnUpdateTrafficFacility(p0: Array<out AMapNaviTrafficFacilityInfo>?) {
        TODO("Not yet implemented")
    }

    override fun OnUpdateTrafficFacility(p0: AMapNaviTrafficFacilityInfo?) {
        TODO("Not yet implemented")
    }

    override fun updateAimlessModeStatistics(p0: AimLessModeStat?) {
        TODO("Not yet implemented")
    }

    override fun updateAimlessModeCongestionInfo(p0: AimLessModeCongestionInfo?) {
        TODO("Not yet implemented")
    }

    override fun onPlayRing(p0: Int) {
        TODO("Not yet implemented")
    }

    override fun onNaviRouteNotify(p0: AMapNaviRouteNotifyData?) {
        TODO("Not yet implemented")
    }

    override fun onGpsSignalWeak(p0: Boolean) {
        TODO("Not yet implemented")
    }

    override fun notifyParallelRoad(p0: AMapNaviParallelRoadStatus?) {
        TODO("Not yet implemented")
    }


}