package edu.neu.csye6200.utils;

public class InternationalFlightFactory implements AbstractFlightFactory{

    private static final InternationalFlightFactory instance = new InternationalFlightFactory();

    private InternationalFlightFactory() {
    }

    public static InternationalFlightFactory getInstance() {
        return instance;
    }
    @Override
    public Flight createFlight(String csv) {
        return new InternationalFlight(csv);
    }
}
