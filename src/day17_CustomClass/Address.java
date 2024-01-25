package day17_CustomClass;

public class Address {
    public int buildingNumber;
    public String street, city, state;
    public int zipCode;

    public void setInfo (int buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        String result ="Address: \n\t" + buildingNumber+ " " + street +",\n\t"+ city+ ", "+state+", "+ zipCode;

        return result;
    }
}
