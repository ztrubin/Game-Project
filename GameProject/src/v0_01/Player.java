package v0_01;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

public class Player {
	
	//add rent variable
	//add max inv variable
	// code inventory methods
	
	private StringProperty name = new SimpleStringProperty();
	private IntegerProperty level = new SimpleIntegerProperty();
	private IntegerProperty experience = new SimpleIntegerProperty();
	private FloatProperty cash = new SimpleFloatProperty();
	private IntegerProperty maxActionPoints = new SimpleIntegerProperty();
	private IntegerProperty actionPoints = new SimpleIntegerProperty();
//	private ObservableMap<String, Float> inventory = FXCollections.observableHashMap();
	private IntegerProperty maxInventorySpace = new SimpleIntegerProperty();
	private IntegerProperty usedInventorySpace = new SimpleIntegerProperty();
	private IntegerProperty freeInventorySpace = new SimpleIntegerProperty();
	
	
	//Getters and Setters
	public final String getName() { return name.get(); }
	public final int getLevel() { return level.get(); }
	public final float getExperience() { return experience.get(); }
	public final float getCash() { return cash.get(); }
	public final int getActionPoints() { return actionPoints.get(); }
	public final int getMaxActionPoints() { return maxActionPoints.get(); }
	public final int getMaxInventorySpace() { return maxInventorySpace.get(); }
	public final int getUsedInventorySpace() { return usedInventorySpace.get(); }
	public final int getFreeInventorySpace() { return freeInventorySpace.get(); }
	
	
	
	public void setName(String name) { this.name.set(name);	}
	public void setLevel(int level) { this.level.set(level); }
	public void setExperience(float experience) { this.experience.set(experience); }
	public void setCash(float cash) { this.cash.set(cash); }
	public void setActionPoints(int actionPoints) { this.actionPoints.set(actionPoints); }
	public void setMaxActionPoints(int maxActionPoints) { this.maxActionPoints.set(maxActionPoints); }
	public void setMaxInventorySpace(int maxInventorySpace) { this.maxInventorySpace.set(maxInventorySpace); }
	public void setUsedInventorySpace(int usedInventorySpace) { this.usedInventorySpace.set(usedInventorySpace); }
	public void setFreeInventorySpace(int freeInventorySpace) { this.freeInventorySpace.set(freeInventorySpace); }

	
	
	public final StringProperty getNameProperty() { return name; }
	public final IntegerProperty getLevelProperty() { return level; }
	public final FloatProperty getExperienceProperty() { return experience; }
	public final FloatProperty getCashProperty() { return cash; }
	public final IntegerProperty getActionPointsProperty() { return actionPoints; }
	public final IntegerProperty getMaxActionPointsProperty() { return maxActionPoints; }
	public final IntegerProperty getMaxInventorySpaceProperty() { return maxInventorySpace; }
	public final IntegerProperty getUsedInventorySpaceProperty() { return usedInventorySpace; }
	public final IntegerProperty getFreeInventorySpaceProperty() { return freeInventorySpace; }
	
	
	public void levelUp() {
		
		setLevel(getLevel() + 1);
		
		setMaxActionPoints(getMaxActionPoints() + 1);
		setMaxInventorySpace(getMaxInventorySpace() + 1);

		this.level.set(this.level.get() + 1); 
		this.maxActionPoints.set(this.maxActionPoints.get() + 2);
		
	}
	public void incrementExperience(int tempExp) { 
		this.experience.set(this.experience.get() + tempExp); 
	}
	public void incrementCash(float tempCash) { 
		this.cash.set(this.cash.get() + tempCash);
	}
	
	
}