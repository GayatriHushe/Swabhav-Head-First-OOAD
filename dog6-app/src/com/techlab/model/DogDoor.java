package com.techlab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private List allowedBarks;
	
	public DogDoor() {
		this.allowedBarks=new ArrayList();
		this.open = false;
	}
	public void open() {
		System.out.println("The dog door opens.");
		open = true;
		Timer timer = new Timer();
		timer.schedule(new TimerTask() 
		{
			public void run() 
			{
				close();
				timer.cancel();
			}
		}, 5000);
	}
	public void close() {
		System.out.println("The dog door closes.");
		open = false;
	}
	public boolean isOpen() {
		return open; 
	}
	public void addAllowedBark(Bark bark)
	{	allowedBarks.add(bark);
	}
	public List getAllowedBarks()
	{	return allowedBarks;
	}
}
