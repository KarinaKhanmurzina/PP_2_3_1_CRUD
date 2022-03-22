package web.model;

public class Car {

    private String model;
    private String color;
    private int ageOfRelease;

    public Car(String model, String color, int ageOfRelease) {
        this.model = model;
        this.color = color;
        this.ageOfRelease = ageOfRelease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeOfRelease() {
        return ageOfRelease;
    }

    public void setAgeOfRelease(int ageOfRelease) {
        this.ageOfRelease = ageOfRelease;
    }
}
