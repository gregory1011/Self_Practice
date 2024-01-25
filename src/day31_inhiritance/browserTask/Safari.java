package day31_inhiritance.browserTask;

public class Safari extends Browser{
    public Safari(String name) {
        super(name);
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening safari browser");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }


}
