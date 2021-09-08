package com.simon.gdmapdemo

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.amap.api.maps.model.LatLng
import com.amap.api.maps.model.Poi
import com.amap.api.navi.AmapNaviPage
import com.amap.api.navi.AmapNaviParams
import com.amap.api.navi.AmapNaviType
import com.amap.api.navi.INaviInfoCallback
import com.amap.api.navi.model.AMapNaviLocation

class SecondActivity : AppCompatActivity(), INaviInfoCallback {

    var p2 = LatLng(39.917337, 116.397056) //故宫博物院

    var p3 = LatLng(39.904556, 116.427231) //北京站

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val params =
            AmapNaviParams(Poi("北京站", p3, ""), null, Poi("故宫博物院", p2, ""), AmapNaviType.DRIVER)
        params.setUseInnerVoice(true)
        AmapNaviPage.getInstance()
            .showRouteActivity(application, params, this@SecondActivity)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
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

    override fun getCustomMiddleView(): View? {
        return null
    }

    override fun getCustomNaviView(): View {
        return getCustomView("中部自定义区域")
    }

    override fun getCustomNaviBottomView(): View {
        return getCustomView("底部自定义区域")
    }


    var text1: TextView? = null
    var text2: TextView? = null
    private fun getCustomView(title: String): View {
        val linearLayout = LinearLayout(this)
        try {
            linearLayout.orientation = LinearLayout.HORIZONTAL
            text1 = TextView(this)
            text1!!.gravity = Gravity.CENTER
            text1!!.height = 90
            text1!!.minWidth = 300
            text1!!.text = title
            text2 = TextView(this)
            text2!!.gravity = Gravity.CENTER
            text1!!.height = 90
            text2!!.minWidth = 300
            text2!!.text = title
            linearLayout.gravity = Gravity.CENTER
            linearLayout.addView(
                text1,
                LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            )
            linearLayout.addView(
                text2,
                LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
            )
            val params = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
            params.height = 100
            linearLayout.layoutParams = params
        } catch (e: Throwable) {
            e.printStackTrace()
        }
        return linearLayout
    }
}