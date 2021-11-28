package com.demo.demo

import androidx.constraintlayout.widget.ConstraintLayout
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class LaunchViewTest {
  @get:Rule
  val paparazzi = Paparazzi(
    deviceConfig = PIXEL_5,
    theme = "android:Theme.Material.Light.NoActionBar"
    // ...see docs for more options
  )

  @Test
  fun simple() {
    val view = paparazzi.inflate<ConstraintLayout>(R.layout.activity_login)
    // or...
    // val view = LaunchView(paparazzi.context)

//    view.setModel(LaunchModel(title = "paparazzi"))
    paparazzi.snapshot(view)
  }
}
