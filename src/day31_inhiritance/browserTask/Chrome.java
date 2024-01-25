package day31_inhiritance.browserTask;

public class Chrome extends Browser{
    public Chrome(String name) {
        super(name);
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
