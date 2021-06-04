package com.example;

public class Car {

	private int speed = 50;

	public boolean checkRule() {
		if (this.speed < 150) {
			return true;
		} else {
			return false;
		}
	}
}
