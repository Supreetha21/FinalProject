package com.CollegeBusFacility.model;

public class Bus {

	private int busnum;
	private String routenum;
	private String drivername;
	private String driverphonenum;
	private String destination;
	private String stoppingpoints;
	private String fee;
	public int getBusnum() {
		return busnum;
	}
	public void setBusnum(int busnum) {
		this.busnum = busnum;
	}
	public String getRoutenum() {
		return routenum;
	}
	public void setRoutenum(String routenum) {
		this.routenum = routenum;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getDriverphonenum() {
		return driverphonenum;
	}
	public void setDriverphonenum(String driverphonenum) {
		this.driverphonenum = driverphonenum;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStoppingpoints() {
		return stoppingpoints;
	}
	public void setStoppingpoints(String stoppingpoints) {
		this.stoppingpoints = stoppingpoints;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(int busnum, String routenum, String drivername, String driverphonenum, String destination,
			String stoppingpoints, String fee) {
		super();
		this.busnum = busnum;
		this.routenum = routenum;
		this.drivername = drivername;
		this.driverphonenum = driverphonenum;
		this.destination = destination;
		this.stoppingpoints = stoppingpoints;
		this.fee = fee;
	}
	
	
}
