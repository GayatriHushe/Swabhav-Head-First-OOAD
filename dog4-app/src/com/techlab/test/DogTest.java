package com.techlab.test;

import com.techlab.model.BarkRecognizer;
import com.techlab.model.DogDoor;
import com.techlab.model.Remote;

public class DogTest {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecognizer recognizer=new BarkRecognizer(door);
		Remote remote = new Remote(door);
		System.out.println("Fido barks to go outside...");
		recognizer.recognize("Woof");
		remote.pressButton();
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido’s all done...");

		try
		{
			Thread.currentThread();
			Thread.sleep(10000);
		}
		catch (InterruptedException e) { }
		System.out.println("...but he's stuuck outside!");
		System.out.println("\nFido starts barking");
		recognizer.recognize("Woof");
		
		//System.out.println("...so Gina grabs the remote control");
		//remote.pressButton();
		System.out.println("\nFido’s back inside...");

	}

}
