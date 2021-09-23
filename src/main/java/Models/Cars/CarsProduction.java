package Models.Cars;

import java.util.Iterator;

public abstract class CarsProduction {

    public abstract Iterator theCars();

    protected abstract String getModelName();

    protected abstract int getPassengerCapacity();

    protected abstract double getEuroNCAPScore();

    protected abstract int getBhp();

    protected abstract String getWheelDrive();

    protected abstract String getCarColor();

    protected abstract int getCarId();

    protected abstract String getCarByType();

    @Override
    public String toString() {
       return """
                ---- The car which has id ($id) ----
                Model name : $model
                Car By Type : $typ
                Color : $clr
                Passenger Capacity : $ps
                EuroNCAPScore : $ncap
                Power : $pwr bhp
                Wheel Drive : $wd
                ------------------------------------------
                """
               .replace("$model", getModelName())
               .replace("$clr",getCarColor())
               .replace("$id", String.valueOf(getCarId()))
               .replace("$typ", getCarByType())
               .replace("$ncap", String.valueOf(getEuroNCAPScore()))
               .replace("$ps", String.valueOf(getPassengerCapacity()))
               .replace("$pwr", String.valueOf(getBhp()))
               .replace("$wd",getWheelDrive());
    }

    protected final void createTheCar(){
        System.out.println("*********************************************** Car Producing Has Started ***********************************************");
        skeletonOfCar();
        engineProduce();
        wheelDriveSystemOfCar();
        seatsProduce();
        euroNCAPTest();
        System.out.println("A "+getCarColor()+ " "+getModelName()+" model vehicle was produced.");
        System.out.println("*************************************************************************************************************************\n");
    }

    private void skeletonOfCar(){
        System.out.println("Production of the vehicle with id number " +getCarId()+" started!");
        System.out.println("The skeleton of the car with id number "+ getCarId() +" was produced by "+ getCarByType() +" car type and painted in "+getCarColor()+ " color");
    }

    private void engineProduce(){
        System.out.println("The engine has been done which has "+getBhp()+ " bhp.\nThe engine is built into the manufactured skeleton");
    }

    private void wheelDriveSystemOfCar(){
        System.out.println("The chassis part of the vehicle was placed on the skeleton as "+getWheelDrive()+" and integrated into the engine.");
    }

    private void seatsProduce(){
        System.out.println("Seats with a capacity of "+getPassengerCapacity()+" people were produced and placed in the produced skeleton.");
    }

    private void euroNCAPTest(){
        System.out.println("The vehicle's safety tests were carried out and its euro ncap score was "+getEuroNCAPScore()+" out of 5.");
    }

}

