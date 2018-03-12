package org.selyale.evernote.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerticalMenu {
    private final WebDriver webDriver;

    private final By newNote = By.id("gwt-debug-Sidebar-newNoteButton");
    private final By newCalendar = By.cssSelector("gwt-debug-Sidebar-newCalendarNoteButton-container");
    private final By newSearch = By.id("gwt-debug-Sidebar-searchButton-container");
    private final By newChat = By.id("gwt-debug-Sidebar-workChatButton-container");
    private final By favourites = By.id("gwt-debug-Sidebar-shortcutsButton-container");
    private final By notes = By.id("gwt-debug-Sidebar-notesButton-container");
    private final By notebooks = By.id("gwt-debug-Sidebar-notebooksButton-container");
    private final By labels = By.id("gwt-debug-Sidebar-tagsButton");

    public VerticalMenu(WebDriver webDriver){
        this.webDriver = webDriver;
    }


}
