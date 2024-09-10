package tb_olx_project.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Start:" + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success:" + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failure:" + result.getName());
    }