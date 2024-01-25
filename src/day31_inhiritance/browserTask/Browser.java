package day31_inhiritance.browserTask;

public class Browser {

    private String name;

    public Browser(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void openBrowser(){
        System.out.println("Opening ");
    }

    public void closeBrowser(){
        System.out.println("Close "+ getClass().getSimpleName() +" browser");
    }




}
