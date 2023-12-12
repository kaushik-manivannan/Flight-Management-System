package edu.neu.csye6200.utils;

import java.util.List;

public interface Flight {

    String getFlightID();

    void setFlightID(String flightID);

    public String getTimeDuration();

    public void setTimeDuration(String timeDuration);

    public String getDate();

    public void setDate(String date);

    public String getDepartDestination();

    public void setDepartDestination(String departDestination);

    public String getLandDestination();

    public void setLandDestination(String landDestination);

    public String getEconomySeats();

    public void setEconomySeats(String economySeats);

    public String getBusinessSeats();

    public void setBusinessSeats(String businessSeats);

    public String getDistance();

    public void setDistance(String distance);
}
