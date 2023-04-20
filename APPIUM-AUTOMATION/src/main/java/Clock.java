import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Clock {
    public static void main(String args[]) throws MalformedURLException {
        DesiredCapabilities dc=new DesiredCapabilities();
        dc.setCapability("udid","emulator-5554");
        dc.setCapability("deviceName","Pixel_5_API_3");
        dc.setCapability("automationName","appium");
        dc.setCapability("platformName","android");
        dc.setCapability("appPackage","com.google.android.deskclock");
        dc.setCapability("appActivity","com.android.deskclock.DeskClock");

        AndroidDriver<AndroidElement> ad= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        MobileElement el1 = (MobileElement)  ad.findElementById("com.google.android.deskclock:id/alarm_recycler_view");
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementByXPath("//nh[@content-desc=\"Clock\"]/android.widget.TextView");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementByXPath("//nh[@content-desc=\"Timer\"]/android.widget.TextView");
        el3.click();
        MobileElement el4 = (MobileElement) ad.findElementByXPath("//nh[@content-desc=\"Stopwatch\"]/android.widget.TextView");
        el4.click();
        MobileElement el5 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout");
        el5.click();
        el5.click();

    }
}
