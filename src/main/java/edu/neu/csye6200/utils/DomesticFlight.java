package edu.neu.csye6200.utils;

public class DomesticFlight implements Flight {
    
    private String flightID, timeDuration, date,departDestination,landDestination,economySeats,businessSeats,distance;
	
	public DomesticFlight(String flightID, String timeDuration, String date, String departDestination, String landDestination, String economySeats, String businessSeats, String distance)
	{
		this.flightID=flightID;
		this.timeDuration = timeDuration;
		this.date=date;
		this.departDestination=departDestination;
		this.landDestination=landDestination;
		this.economySeats=economySeats;
		this.businessSeats=businessSeats;
		this.distance=distance;
	}

	public DomesticFlight(String csvString) {
		String[] fields = csvString.split(",");
		this.flightID=fields[0];
		this.timeDuration =fields[1];
		this.date=fields[2];
		this.departDestination=fields[3];
		this.landDestination=fields[4];
		this.economySeats=fields[5];
		this.businessSeats=fields[6];
		this.distance=fields[7];
	}
	
	@Override
	public void setFlightID(String flightID)
	{
		this.flightID=flightID;
	}

	@Override
	public String getTimeDuration() {
		return timeDuration;
	}

	@Override
	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}

	@Override
	public String getDate() {
		return date;
	}

	@Override
	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String getFlightID()
	{
		return flightID;
	}

	@Override
	public void setDepartDestination(String departDestination)
	{
		this.departDestination=departDestination;
	}

	@Override
	public void setLandDestination(String landDestination)
	{
		this.landDestination=landDestination;
	}

	@Override
	public void setEconomySeats(String economySeats)
	{
		this.economySeats=economySeats;
	}

	@Override
	public void setBusinessSeats(String businessSeats)
	{
		this.businessSeats=businessSeats;
	}

	@Override
	public String getDepartDestination()
	{
		return departDestination;
	}

	@Override
	public String getLandDestination()
	{
		return landDestination;
	}

	@Override
	public String getEconomySeats()
	{
		return economySeats;
	}

	@Override
	public String getBusinessSeats()
	{
		return businessSeats;
	}

	@Override
	public void setDistance(String distance)
	{
		this.distance=distance;
	}

	@Override
	public String getDistance()
	{
		return distance;
	}

	@Override
	public String toString() {
		return flightID +  "," + timeDuration +  "," +
				date + "," + departDestination + "," + landDestination + "," +
				economySeats + "," + businessSeats + "," + distance;
	}
    
}
