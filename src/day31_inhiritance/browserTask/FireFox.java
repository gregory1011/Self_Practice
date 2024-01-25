package day31_inhiritance.browserTask;

public class FireFox extends Browser{
    public FireFox(String name) {
        super(name);
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
