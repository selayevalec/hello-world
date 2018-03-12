package org.selyale.evernote.util;

import org.apache.log4j.PropertyConfigurator;

public class SetProperties {

    public static void setProperties() {
        System.setProperty("org.selyale.resources.root",
                "C:\\Users\\User\\IdeaProjects\\hello-world\\resources");

        System.setProperty("webdriver.chrome.driver",
                System.getProperty("org.selyale.resources.root") + "\\chrome\\chromedriver.exe");

        PropertyConfigurator
                .configure(System.getProperty("org.selyale.resources.root")
                        + "\\log4j.properties");
    }
}
