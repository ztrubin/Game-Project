package v0_01;

import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

public class Model {

	public ObservableMap<String, Item> setupItems() {
		ObservableMap<String, Item> items = FXCollections.observableHashMap();
		
		Item lumber = new Item("Lumber", "A piece of lumber", 2, 0, 5, 0);
		Item plank = new Item("Wood Plank", "Refined lumber. Useful for crafting", 0, 0, 0 ,0);
		Item chair;
		Item stone;
		Item copperOre;
		Item copperBar;
		Item ironOre;
		Item ironBar;
		Item coal;
		Item gear;
		Item steel;
		
		return items;
	}

	public void endTurn() {
		
	}
	
	public void gatherWood() {
		if (Game.player.getActionPoints() >= ) {
			
		}
	}
	public void gatherStone() {}
	
	
}
