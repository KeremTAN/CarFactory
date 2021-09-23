package Models.Cars;

import Models.CarsIterator;
import java.util.Iterator;

public class PrototypeCar extends CarsProduction {

    private String modelName;
    private int passengerCapacity=3;
    private double euroNCAPScore;
    private int bhp; // horse power
    private String wheelDrive; //fwd=önden çekiş! rwd=arkadan itiş! 4wd=4x4;
    private String carColor;
    private int carId;
    private final String carByType="Concept(Prototype)";
    private static PrototypeCar[] allConceptCars= new PrototypeCar[4];
    private static int size=0;

    public PrototypeCar(String modelName, double euroNCAPScore, int bhp, String wheelDrive, String carColor, int carId) {
        if(size<4) {
            this.modelName = modelName;
            this.euroNCAPScore = euroNCAPScore;
            this.bhp = bhp;
            this.wheelDrive = wheelDrive;
            this.carColor = carColor;
            this.carId = carId;
            allConceptCars[size++] = this;
             super.createTheCar();
        }

    }

    @Override
    public Iterator theCars() {
        return new CarsIterator(allConceptCars);
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
