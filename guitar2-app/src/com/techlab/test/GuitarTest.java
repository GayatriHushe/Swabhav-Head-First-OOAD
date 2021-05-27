package com.techlab.test;

import java.util.Iterator;
import java.util.List;

import com.techlab.model.Builder;
import com.techlab.model.Guitar;
import com.techlab.model.Inventory;
import com.techlab.model.Type;
import com.techlab.model.Wood;

public class GuitarTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addGuitar("1", 500.0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("2", 600.0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		//System.out.println(inventory);
		
		Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
				Guitar guitar1 = (Guitar)i.next();
				System.out.println(" We have a " + 	guitar1.getBuilder() + " " + 
						guitar1.getModel() + " " + guitar1.getType() + " guitar:\n " +
						guitar1.getBackWood() + " back and sides,\n " +
						guitar1.getTopWood() + " top.\n You can have it for only $" +
						guitar1.getPrice() + "!\n ----");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

}
