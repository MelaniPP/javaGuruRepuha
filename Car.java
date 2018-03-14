package Car;

public class Car {
    int modelYear;
    String color;
    String brand;

    public Car(int y, String clr, String brd) {
        modelYear = y;
        color = clr;
        brand = brd;

    }

    public Car() {

    }

    void setModelYear(int y) {
        modelYear = y;
    }

    void setColor(String clr) {
        color = clr;
    }

    void setBrand(String brd) {
        brand = brd;
    }

    Integer getModelYear() {
        return modelYear;

    }

    String getColor() {
        return color;
    }

    String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "model : " + modelYear + ", color: " + color + ", brand:  " + brand;
    }
}