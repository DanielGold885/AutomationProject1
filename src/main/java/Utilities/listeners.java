package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class listeners extends commonOps implements ITestListener {

    public listeners() throws IOException, SAXException, ParserConfigurationException {
    }

    public void onFinish(ITestContext result) {
        System.out.println("---------------------------- Ending Execution ----------------------------");
    }

    public void onStart(ITestContext result) {
        System.out.println("---------------------------- Starting Execution ----------------------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("---------------------------- " +
                "Failed Test: " + result.getName() + "----------------------------");
        if(!platform.equalsIgnoreCase("api"))
            saveScreenshot();
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("---------------------------- " +
                "Skipping Test: " + result.getName() + "----------------------------");
    }

    public void onTestStart(ITestResult result) {
        System.out.println("---------------------------- " +
                "Starting Test: " + result.getName() + "----------------------------");
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("---------------------------- " +
                "Test Finished Successfully: " + result.getName() + "----------------------------");
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot(){
        return((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
