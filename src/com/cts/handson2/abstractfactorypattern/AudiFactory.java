package com.cts.handson2.abstractfactorypattern;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
