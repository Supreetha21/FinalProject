package com.CollegeBusFacility.model;

public class EnrollBusRoute {
	
	 private String busnum;  
	    private String routenum;  
	    private String destination;  
	    private String stopping;  
	   public EnrollBusRoute() {}
	public String getBusnum() {
		return busnum;
	}
	public void setBusnum(String busnum) {
		this.busnum = busnum;
	}
	public String getRoutenum() {
		return routenum;
	}
	public void setRoutenum(String routenum) {
		this.routenum = routenum;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStopping() {
		return stopping;
	}
	public void setStopping(String stopping) {
		this.stopping = stopping;
	}
	
}
