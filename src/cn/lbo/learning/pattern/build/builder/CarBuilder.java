package cn.lbo.learning.pattern.build.builder;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:02
 * @PackageName:cn.lbo.learning.pattern.build.builder
 * @ClassName: CarBuilder
 * @Description: TODO
 * @Version 1.0
 */
public class CarBuilder {
    private String make;
    private String model;
    private int year;
    private String engine;
    private int seats;

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public Car build() {
        return new Car(make, model, year, engine, seats);
    }

}
