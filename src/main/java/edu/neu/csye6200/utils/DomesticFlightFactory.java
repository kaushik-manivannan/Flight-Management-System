package edu.neu.csye6200.utils;

public enum DomesticFlightFactory implements AbstractFlightFactory{

    INSTANCE;
    @Override
    public Flight createFlight(String csv) {
        return new DomesticFlight(csv);
    }
}
