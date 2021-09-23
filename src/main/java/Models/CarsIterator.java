package Models;

import Models.Cars.*;

import java.util.Iterator;

public class CarsIterator implements Iterator {
    private CarsProduction[] allCars;
    private int size;

    public CarsIterator(CarsProduction[] allCars) {
        this.allCars = allCars;
    }

    @Override
    public boolean hasNext() {
        return size < allCars.length && allCars[size] != null;
    }

    @Override
    public Object next() {
        return allCars[size++];
    }
}
