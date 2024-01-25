package day31_inhiritance.browserTask;

public class Opera extends  Browser{
    public Opera(String name) {
        super(name);
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening opera browser");
    }

    @Override
    public void closeBrowser() {
        super.closeBrowser();
    }
}
