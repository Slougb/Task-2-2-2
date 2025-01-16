package web.model;

public class Car {

    private String model;
    private int serial;
    private String color;

    public Car(String model, int serial, String color) {
        this.model = model;
        this.serial = serial;
        this.color = color;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
