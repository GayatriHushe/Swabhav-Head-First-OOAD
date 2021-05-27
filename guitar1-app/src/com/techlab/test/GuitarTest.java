package com.techlab.test;

import com.techlab.model.Guitar;
import com.techlab.model.Inventory;

public class GuitarTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		Guitar whatErinLikes = new Guitar("", 0, "fender", "Stratocastor", "electric", "Alder", "Alder");
		Guitar guitar = inventory.search(whatErinLikes);
		if (guitar != null) {
			System.out.println("Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " "
					+ guitar.getType() + " guitar:\n " + guitar.getBackWood() + " back and sides,\n "
					+ guitar.getTopWood() + " top.\nYou can have it for only $" + guitar.getPrice() + "!");
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

}
