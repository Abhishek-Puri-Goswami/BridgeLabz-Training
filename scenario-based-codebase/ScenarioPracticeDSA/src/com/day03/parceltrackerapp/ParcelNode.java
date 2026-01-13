package com.day03.parceltrackerapp;

class ParcelNode {
	String stage;
	ParcelNode next;

	public ParcelNode(String stage) {
		this.stage = stage;
		this.next = null;
	}
}
