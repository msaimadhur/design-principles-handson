package com.cts.handson2.abstractfactorypattern;

public class Client {
	public static void main(String[] args) {
		Factory mercedesFactory = new MercedesFactory();
		System.out.println(mercedesFactory.makeHeadlight());
		System.out.println(mercedesFactory.makeTire());
		Factory audiFactory = new AudiFactory();
		System.out.println(audiFactory.makeHeadlight());
		System.out.println(audiFactory.makeTire());
	}
}
