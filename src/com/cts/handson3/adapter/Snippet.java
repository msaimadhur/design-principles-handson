package com.cts.handson3.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Snippet {
	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	
	@Test
	public void whenConvertingUSDToEuro_thenSuccessfullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getPrice(), 1260000.0, 0.00001);
	}
}
