package day07_If_statements;

public class Browser {
    public static void main(String[] args) {

        String browserName = "opera";
        String result = "";

        if ((browserName == "chrome") || (browserName == "firefox")
                || (browserName == "opera") || (browserName == "safari")
                || (browserName == "edge"))

             if (browserName == "chrome") {
                result = "Chrome browser is selected";
            } else if (browserName == "firefox") {
                result = "Firefox browser is selected";
            } else if (browserName == "opera") {
                result = "Opera browser is selected";
            } else if (browserName == "safari") {
                result = "Safari browser is selected";
            } else {
                result = " Edge browser is selected";
            }else {
                result = "Invalid Browser Name ";
            }

            System.out.println(result);
        }
    }
