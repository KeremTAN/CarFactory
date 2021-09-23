package Models.Cars;

import Models.CarsIterator;

import java.util.Iterator;

public class SpecialCar extends CarsProduction  {
    private String modelName;
    private int passengerCapacity=2;
    private double euroNCAPScore;
    private int bhp; // horse power
    private String wheelDrive; //fwd=önden çekiş! rwd=arkadan itiş! 4wd=4x4;
    private String carColor;
    private int carId;
    private final String carByType="Special Custom Made";
    private static SpecialCar[] allSpecialsCars= new SpecialCar[20];
    private static int size=0;

    public SpecialCar(String modelName, double euroNCAPScore, int bhp, String wheelDrive, String carColor, int carId) {
        if(size<20) {
            this.modelName = modelName;
            this.euroNCAPScore = euroNCAPScore;
            this.bhp = bhp;
            this.wheelDrive = wheelDrive;
            this.carColor = carColor;
            this.carId = carId;
            allSpecialsCars[size++] = this;
            super.createTheCar();
        }

    }

    @Override
    public Iterator theCars() {
        return new CarsIterator(allSpecialsCars);
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
