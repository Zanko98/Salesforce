package tests;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.AllureUtils;

@Log4j2
public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        log.info("Starting test {}", iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        log.debug("Finished test {}", iTestResult.getName());
        takeScreenshot(iTestResult);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        log.debug("Filed test {} ", iTestResult.getName());
        takeScreenshot(iTestResult);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        log.debug("Skipping test {} ", iTestResult.getName());
        takeScreenshot(iTestResult);
    }

    private void takeScreenshot(ITestResult iTestResult) {
        ITestContext context = iTestResult.getTestContext();
        try {
            WebDriver driver = (WebDriver) context.getAttribute("driver");
            AllureUtils.takeScreenshot(driver);
        } catch (NoSuchSessionException | IllegalStateException ex) {
            log.error("Filed to create screenshot");
        }
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    }

    @Override
    public void onStart(ITestContext iTestContext) {
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    }
}

