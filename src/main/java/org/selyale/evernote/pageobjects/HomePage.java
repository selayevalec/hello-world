package org.selyale.evernote.pageobjects;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver webDriver;
    private final VerticalMenu vMenu;
    private final HorizontalMenu hMenu;


    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        vMenu = new VerticalMenu(webDriver);
        hMenu = new HorizontalMenu(webDriver);
    }

    public HorizontalMenu gethMenu() {
        return hMenu;
    }

    public VerticalMenu getvMenu() {
        return vMenu;
    }
}
