package com.cts.handson6.observer;

public class MessageSubscriberOne implements Observer {

	@Override

	public void update(Message m) {

		System.out.println("MessageSubscriberOne :: " + m.getMessageContent());

	}

}