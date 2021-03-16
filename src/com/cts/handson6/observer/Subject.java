package com.cts.handson6.observer;

public interface Subject {

	public void attach(Observer o);

	public void detach(Observer o);

	public void notifyUpdate(Message m);

}