package com.techlab.test;

import com.techlab.model.Bark;
import com.techlab.model.BarkRecognizer;
import com.techlab.model.DogDoor;
import com.techlab.model.Remote;

public class DogTest {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		
		door.addAllowedBark(new Bark("woof"));
		door.addAllowedBark(new Bark("roowlf"));
		
		BarkRecognizer recognizer=new BarkRecognizer(door);
		Remote remote = new Remote(door);
		
		System.out.println("Fido barks to go outside...");
		recognizer.recognize(new Bark("Woof"));
		
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido’s all done...");

		try
		{
			Thread.currentThread().sleep(10000);
		}
		catch (InterruptedException e) { }
		System.out.println("...but he's stuuck outside!");
		
		Bark Jack =new Bark("bhooh");
		System.out.println("\nJack starts barking");
		recognizer.recognize(Jack);
		
		System.out.println("\nFido starts barking");
		recognizer.recognize(new Bark("Woof"));
		
		System.out.println("\nFido’s back inside...");
	}
}
