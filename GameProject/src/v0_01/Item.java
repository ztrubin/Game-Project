package v0_01;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Item {
	
//	public Item() {
//	}
//	
//	public Item(String name, String description, 
//			float sellPrice, float sellElasticity, 
//			float buyPrice, float buyElasticity) {
//		this.name.set(name);
//		this.description.set(description);
//		this.sellPrice.set(sellPrice);
//		this.sellElasticity.set(sellElasticity);
//		this.buyPrice.set(buyPrice);
//		this.buyElasticity.set(buyElasticity);
//	}
	
	private StringProperty name = new SimpleStringProperty();
	private StringProperty description = new SimpleStringProperty();
	private FloatProperty sellPrice = new SimpleFloatProperty();
	private FloatProperty sellElasticity = new SimpleFloatProperty();
	private FloatProperty buyPrice = new SimpleFloatProperty();
	private FloatProperty buyElasticity = new SimpleFloatProperty();
	private IntegerProperty requiredInventorySpace = new SimpleIntegerProperty();
	private IntegerProperty requiredActionPoints = new SimpleIntegerProperty();
	
	
	public String getName() { return name.get(); }
	public String getDescription() { return description.get(); }
	public float getSellPrice() { return sellPrice.get(); }
	public float getSellElasticity() { return sellElasticity.get(); }
	public float getBuyPrice() { return buyPrice.get(); }
	public float getBuyElasticity() { return buyElasticity.get(); }
			
	public void setName(String name) { this.name.set(name); }
	public void setDescription(String description) { this.description.set(description); }
	public void setSellPrice(float sellPrice) { this.sellPrice.set(sellPrice); }
	public void setSellElasticity(float sellElasticity) { this.sellElasticity.set(sellElasticity); }
	public void setBuyPrice(float buyPrice) { this.buyPrice.set(buyPrice); }
	public void setBuyElasticity(float buyElasticity) { this.buyElasticity.set(buyElasticity); }

	public StringProperty getNameProperty() { return name; }
	public StringProperty getDescriptionProperty() { return description; }
	public FloatProperty getSellPriceProperty() { return sellPrice; }
	public FloatProperty getSellElasticityProperty() { return sellElasticity; }
	public FloatProperty getBuyPriceProperty() { return buyPrice; }
	public FloatProperty getBuyElasticityProperty() { return buyElasticity; }

}
