package day26_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean fullTime;
    public LocalDate hire_date;

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime, LocalDate hire_date) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.hire_date = hire_date;
    }

    public void takeOrder(){
        System.out.println("Server "+ name+ " is making an order.");
    }
    public void cleanTable(){
        System.out.println("Server "+ name+ " is cleaning the table.");
    }


    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + fullTime +
                ", hire_date=" + hire_date.format(DateTimeFormatter.ofPattern("MMM/dd/y")) +
                '}';
    }

}
