package sk.itsovy.learning;

public class Car {
    private String model;
    private String brand;
    private String yearOfCreation;


    public Car() {
    }

    public Car(String model, String brand, String yearOfCreation) {
        this.model = model;
        this.brand = brand;
        this.yearOfCreation = yearOfCreation;


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public void printCar() {

    }


}
