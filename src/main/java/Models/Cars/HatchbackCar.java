package Models.Cars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HatchbackCar extends CarsProduction {
    private String modelName;
    private int passengerCapacity=4;
    private double euroNCAPScore;
    private int bhp; // horse power
    private String wheelDrive;
    private String carColor;
    private int carId;
    private final String carByType="Hatchback";
    private static List<HatchbackCar> allHatchbackCars=new ArrayList<>();

    public HatchbackCar(String modelName,  double euroNCAPScore, int bhp, String wheelDrive, String carColor, int carId) {
        this.modelName = modelName;
        this.euroNCAPScore = euroNCAPScore;
        this.bhp = bhp;
        this.wheelDrive = wheelDrive;
        this.carColor = carColor;
        this.carId = carId;
        super.createTheCar();
        allHatchbackCars.add(this);
    }

    @Override
    public Iterator theCars() {
        return allHatchbackCars.iterator();
    }

    @Override
    protected String getModelName() {
        return modelName;
    }

    @Override
    protected int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    protected double getEuroNCAPScore() {
        return euroNCAPScore;
    }

    @Override
    protected int getBhp() {
        return bhp;
    }

    @Override
    protected String getWheelDrive() {
        return wheelDrive;
    }

    @Override
    protected String getCarColor() {
        return carColor;
    }

    @Override
    protected int getCarId() {
        return carId;
    }

    @Override
    protected String getCarByType() {
        return carByType;
    }
}
