package hu.unideb.inf;

import hu.unideb.inf.managers.BrowserManager;
import hu.unideb.inf.managers.PageObjectManager;

public class TestContext {

    private static final BrowserManager browserManager = new BrowserManager();
    private static final PageObjectManager pageObjectManager = new PageObjectManager(browserManager.getDefaultDriver());

    public BrowserManager getBrowserManager() {
        return browserManager;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}
