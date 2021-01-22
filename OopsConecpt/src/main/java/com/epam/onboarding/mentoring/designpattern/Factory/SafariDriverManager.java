package com.epam.onboarding.mentoring.designpattern.Factory;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariDriverService;

import java.io.File;

public class SafariDriverManager extends DriverManager{
    private SafariDriverService ffService;

    @Override
    public void startService() {
        if (null == ffService) {
            try {
                ffService = new SafariDriverService.Builder()
                        .usingDriverExecutable(new File("chromedriver.exe"))
                        .usingAnyFreePort()
                        .build();
                ffService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != ffService && ffService.isRunning())
            ffService.stop();
    }

    @Override
    public void createDriver() {
        driver = new SafariDriver();
    }
}
