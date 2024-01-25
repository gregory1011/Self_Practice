package day18_GarbageColletion;

public class Offer {
    public String location, companyName, jobTitle;
    double salary;
    boolean hasBenefit, hasWTH, isFullTime;


    public void setInfo(String location, String companyName, String jobTitle, double salary,
                        boolean hasBenefit, boolean hasWTH, boolean isFullTime){

        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasWTH = hasWTH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasWTH=" + hasWTH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
Create a custom class named Offer
        Attributes:
                location
                companyName
                jobTitle
                salary
                hasBenefit
                hasPTO
                isWFH
                isFullTime

        Actions:
            setInfo(): sets all the instance variables
            toString(): returns the full info of the Offer Object
 */