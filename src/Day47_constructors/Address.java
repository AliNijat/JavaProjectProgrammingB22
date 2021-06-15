package Day47_constructors;

public class Address {

    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String country;

    public Address() {
        System.out.println("Address constructor");
        street = "123 papajan foxily";
        city = "Java";
        state = "KojaAbad";
        zipCode = 20223;
        country = "world";

    }

    public Address(String street, String city, String state, int zipCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
        System.out.println("New constructor method with parameters");
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return street + " " + zipCode + ", " + city + ", " + state + " " + country;
    }
}
