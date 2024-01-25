package day31_inhiritance.browserTask;

public class TestBrowserObjects {
    public static void main(String[] args) {

        Chrome chrome = new Chrome("Chrome");
        System.out.println(chrome.getName());
        chrome.closeBrowser();
        chrome.openBrowser();

        Safari safari = new Safari("Safari");
        System.out.println(safari.getName());
        safari.closeBrowser();
        safari.openBrowser();


    }
}
