package pl.pjatk.pawbad;

public class CarModel {

    private String make;
    private String model;

    public CarModel(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "CarModel{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
