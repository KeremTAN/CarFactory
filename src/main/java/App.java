import Models.Cars.*;
import java.util.Random;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        System.out.println("Test project");
        Random r = new Random();
        CarsProduction sedan, hatchback, concept, special;
        String[] models = {"Corolla", "Auris", "Avalon", "Camry", "Prius", "Prius", "Yaris", "Sienna"};
        String[] specialModels = {"Corolla S", "Supra", "86", "GR"};
        double[] NCAPScores = {3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5, 4.6, 4.7, 4.8, 4.9, 5.0};
        int[] bhp = {125, 126, 127, 128, 134, 137, 138, 140, 141, 143, 144, 149, 150, 153, 155};
        int[] specialBhp = {250, 251, 253, 255, 260, 264, 265, 267, 280, 283, 287, 290, 293, 294, 295};
        String[] colors = {"White", "Red", "IndianRed", "Black", "Gray", "Green", "Purple", "Turquoise", "DarkRed", "MediumVioletRed", "OrangeRed", "BlueViolet", "Olive", "DimGray", "GhostWhite"};
        String[] wheelDrive = {"rwd", "fwd", "4wd"};

        System.out.println();
        for (int i = 0; i < 7; i++)
            new SedanCar(models[r.nextInt(8)], NCAPScores[r.nextInt(15)], bhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 50000000 + r.nextInt(10000000));
        sedan = new SedanCar(models[r.nextInt(8)], NCAPScores[r.nextInt(15)], bhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 50000000 + r.nextInt(10000000));

        for (int i = 0; i < 5; i++)
            new HatchbackCar(models[r.nextInt(8)], NCAPScores[r.nextInt(15)], bhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 60000000 + r.nextInt(10000000));
        hatchback = new HatchbackCar(models[r.nextInt(8)], NCAPScores[r.nextInt(15)], bhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 60000000 + r.nextInt(10000000));

        for (int i = 0; i < 3; i++)
            new SpecialCar(specialModels[r.nextInt(4)], NCAPScores[r.nextInt(15)], specialBhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 10000000 + r.nextInt(10000));
        special = new SpecialCar(specialModels[r.nextInt(4)], NCAPScores[r.nextInt(15)], specialBhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 10000000 + r.nextInt(10000));

        for (int i = 0; i < 2; i++)
            new PrototypeCar(models[r.nextInt(8)], NCAPScores[r.nextInt(15)], specialBhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 10000000 + r.nextInt(10));
        concept = new PrototypeCar(models[r.nextInt(8)], NCAPScores[r.nextInt(15)], specialBhp[r.nextInt(15)], wheelDrive[r.nextInt(3)], colors[r.nextInt(15)], 10000000 + r.nextInt(10));


        printCars(sedan.theCars());
        printCars(hatchback.theCars());
        printCars(special.theCars());
        printCars(concept.theCars());
    }

    public static void printCars(Iterator it) {
        while (it.hasNext()) {
            CarsProduction c = (CarsProduction) it.next();
            System.out.println(c.toString());
        }
    }
}