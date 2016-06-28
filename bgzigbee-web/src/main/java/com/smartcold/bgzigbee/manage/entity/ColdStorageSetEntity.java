package com.smartcold.bgzigbee.manage.entity;

/**
 * Author: qiunian.sun Date: qiunian.sun(2016-03-19 16:25)
 */
public class ColdStorageSetEntity {

	private int id;

	private int coldStorageID;

	private int rdcId;

	private String name;

	private float startTemperature;

	private float energyCost;

	private Double longitude;

	private Double latitude;

	private String location;

	private String mapping;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getColdStorageID() {
		return coldStorageID;
	}

	public void setColdStorageID(int coldStorageID) {
		this.coldStorageID = coldStorageID;
	}

	public int getRdcId() {
		return rdcId;
	}

	public void setRdcId(int rdcId) {
		this.rdcId = rdcId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getStartTemperature() {
		return startTemperature;
	}

	public void setStartTemperature(float startTemperature) {
		this.startTemperature = startTemperature;
	}

	public float getEnergyCost() {
		return energyCost;
	}

	public void setEnergyCost(float energyCost) {
		this.energyCost = energyCost;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMapping() {
		return mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
	}
}