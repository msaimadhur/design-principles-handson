package com.cts.handson3.builder;

public abstract class ColdDrink implements Item {

	@Override

	public Packing packing() {

		return new Bottle();

	}

	@Override

	public abstract float price();

}