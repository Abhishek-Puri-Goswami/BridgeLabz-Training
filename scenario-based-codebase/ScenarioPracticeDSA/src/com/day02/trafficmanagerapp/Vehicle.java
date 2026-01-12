package com.day02.trafficmanagerapp;

class Vehicle {
	String numberPlate;
	Vehicle next;

	Vehicle(String numberPlate) {
		this.numberPlate = numberPlate;
		this.next = null;
	}
}