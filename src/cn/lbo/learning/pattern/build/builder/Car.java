package cn.lbo.learning.pattern.build.builder;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:01
 * @PackageName:cn.lbo.learning.pattern.build.builder
 * @ClassName: Car
 * @Description: TODO
 * @Version 1.0
 */
public class Car {

    private String make;
    private String model;
    private int year;
    private String engine;
    private int seats;

    public Car(String make, String model, int year, String engine, int seats) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine='" + engine + '\'' +
                ", seats=" + seats +
                '}';
    }
}
