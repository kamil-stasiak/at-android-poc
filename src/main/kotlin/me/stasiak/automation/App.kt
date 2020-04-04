/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package me.stasiak.automation

import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)

    val capabilities = DesiredCapabilities()
    capabilities.setCapability("platformName", "Android")
//    capabilities.setCapability("app", "")
    val driver = AndroidDriver(URL("http://0.0.0.0:4723/wb/hub"), capabilities)
    driver.close()
}